package kyu6;

import java.util.HashMap;

/**
 * Обнаружение панграммы
 * <р>
 * Панграмма – это предложение, в котором каждая буква алфавита содержится хотя бы один раз.
 * Например, предложение "The quick brown fox jumps over the lazy dog." является панграммой,
 * поскольку в нем хотя бы один раз используются буквы A-Z (регистр не имеет значения).
 * <р>
 * Учитывая строку, определите, является ли она панграммой.
 * Возвращает True, если это так, и False, если нет.
 * Не обращайте внимания на цифры и знаки препинания.
 */
public class DetectPangram {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
    }

    public static boolean check(String sentence) {
        int allLetters = 26;

        if (sentence.length() < allLetters) {
            return false;
        }

        sentence = sentence.toLowerCase();

        var alphabet = getAlphabet();

        var map = getMap(alphabet);

        findAllLetters(sentence, map);

        return areAllLettersFound(map);
    }

    private static char[] getAlphabet() {
        return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    }

    private static HashMap<Character, Boolean> getMap(char[] alphabet) {
        var map = new HashMap<Character, Boolean>();

        for (var item : alphabet) {
            map.put(item, false);
        }

        return map;
    }

    private static void findAllLetters(String sentence, HashMap<Character, Boolean> map) {
        for (char item : sentence.toCharArray()) {
            if (map.containsKey(item)) {
                map.put(item, true);
            }
        }
    }

    private static boolean areAllLettersFound(HashMap<Character, Boolean> map) {
        return map.values()
                .stream()
                .allMatch(item -> item);
    }

    //----------------------------------------------------------------------------

    //public boolean check(String sentence){
    //  return sentence.chars()
    //      .map(Character::toLowerCase)
    //      .filter(Character::isAlphabetic)
    //      .distinct()
    //      .count() == 26;
    // }

    //boolean check(final String sentence) {
    //        return sentence.chars()
    //            .filter(Character::isLetter)
    //            .map(Character::toLowerCase)
    //            .distinct()
    //            .count() == 26;
    // }
}
