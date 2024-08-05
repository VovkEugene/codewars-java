package kyu6;

/**
 * Разбить camelCase
 * <p>
 * Завершите решение так,
 * чтобы функция разбивала camelCase,
 * используя пробел между словами.
 * <p>
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */
public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
        System.out.println(camelCase("camelcasingtest"));
    }

    public static String camelCase(String input) {
        var sb = new StringBuilder();

        for (char item : input.toCharArray()) {
            if (item >= 65 && item <= 90) {
                sb.append(' ');
            }

            sb.append(item);
        }

        return sb.toString().trim();
    }

    //public static String camelCase(String input) {
    //    return input.replaceAll("([A-Z])", " $1");
    //  }
}
