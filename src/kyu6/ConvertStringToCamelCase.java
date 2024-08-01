package kyu6;

/**
 * Преобразование строки в верблюжий регистр
 * <p>
 * Завершите метод, чтобы он преобразовывал слова,
 * разделенные тире/подчеркиванием, в верблюжий регистр.
 * Первое слово в выводе должно быть написано с заглавной буквы,
 * только если исходное слово было написано с заглавной буквы
 * (так называемый верхний верблюжий регистр, также часто называемый регистром Паскаля).
 * Следующие слова всегда должны быть с заглавной буквы.
 * <p>
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * <p>
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * <p>
 * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */
public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrior"));
        System.out.println(toCamelCase("the-Stealth-Warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
    }

    static String toCamelCase(String s) {
        var words = s.split("[_-]");
        var sb = new StringBuilder();

        sb.append(words[0]);

        for (int i = 1; i < words.length; i++) {
            sb.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase());
        }

        return sb.toString();
    }
}
