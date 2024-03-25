package kyu7;

/**
 * Самый высокий и самый низкий
 * <p>
 * В этом небольшом задании вам дается строка чисел, разделенных пробелом,
 * и вы должны вернуть наибольшее и наименьшее число.
 */
public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] array = stringToArray(numbers);
        int max = getFirstNumber(numbers);
        int min = getFirstNumber(numbers);
        int temp;

        for (String item : array) {
            temp = stringToInt(item);

            if (max < temp) {
                max = temp;
            }
            
            if (min > temp) {
                min = temp;
            }
        }

        return max + " " + min;
    }

    static String[] stringToArray(String str) {
        return str.split("\s");
    }

    static int getFirstNumber(String str) {
        return Integer.parseInt(stringToArray(str)[0]);
    }

    static int stringToInt(String str){
        return Integer.parseInt(str);
    }
}
