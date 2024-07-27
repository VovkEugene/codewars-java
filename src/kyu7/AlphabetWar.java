package kyu7;

import java.util.HashMap;
import java.util.Map;

/**
 * Алфавитная война
 * <p>
 * Введение
 * Идет война и никто не знает - война алфавитов!
 * Есть две группы враждебных писем.
 * Напряжение между левыми и правыми буквами было слишком велико, и началась война.
 * <p>
 * Задача
 * Напишите метод, который принимает строку боя, состоящую только из маленьких букв,
 * и возвращает информацию о том, кто победит в битве.
 * Когда побеждает левая сторона - return Left side wins!,
 * когда побеждает правая сторона - return Right side wins!,
 * в противном случае - return Let's fight again!
 * <p>
 * Левые буквы и их сила:
 * w - 4
 * p - 3
 * b - 2
 * s - 1
 * <p>
 * Правые буквы и их сила:
 * m - 4
 * q - 3
 * d - 2
 * z - 1
 * <p>
 * Остальные буквы не имеют силы и являются лишь жертвами.
 * <p>
 * Example
 * AlphabetWar("z");        //=> Right side wins!
 * AlphabetWar("zdqmwpbs"); //=> Let's fight again!
 * AlphabetWar("zzzzs");    //=> Right side wins!
 * AlphabetWar("wwwwwwz");  //=> Left side wins!
 */
public class AlphabetWar {
    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("zzzzs"));
        System.out.println(alphabetWar("wwwwwwz"));
    }

    public static String alphabetWar(String fight) {
        int leftSideCounter = 0;
        int rightSideCounter = 0;

        Map<String, Integer> leftSideLetters = new HashMap<>();
        Map<String, Integer> rightSideLetters = new HashMap<>();

        leftSideLetters.put("w", 4);
        leftSideLetters.put("p", 3);
        leftSideLetters.put("b", 2);
        leftSideLetters.put("s", 1);

        rightSideLetters.put("m", 4);
        rightSideLetters.put("q", 3);
        rightSideLetters.put("d", 2);
        rightSideLetters.put("z", 1);

        for (int i = 0; i < fight.length(); i++) {
            String key = Character.valueOf(fight.charAt(i)).toString();

            if (leftSideLetters.containsKey(key)) {
                leftSideCounter += leftSideLetters.get(key);
            }

            if (rightSideLetters.containsKey(key)) {
                rightSideCounter += rightSideLetters.get(key);
            }
        }

        if (leftSideCounter > rightSideCounter) {
            return "Left side wins!";
        }

        if (rightSideCounter > leftSideCounter) {
            return "Right side wins!";
        }

        return "Let's fight again!";
    }
}
