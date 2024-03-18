package kyu8;

/**
 * Иголка в стоге сена
 *
 * Можете ли вы найти иголку в стоге сена? *
 * Напишите функцию findNeedle(), которая принимает массив, полный мусора, но содержащий одну "иглу"
 * После того, как ваша функция найдет иглу, она должна вернуть сообщение (в виде строки), в котором говорится: *
 * "found the needle at position " плюс индекс, по которому была найдена игла, так что:
 *
 * Example(Input --> Output)
 * ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
 */
public class NeedleInHaystack {
    public static String findNeedle(Object[] haystack) {
        String result = "";
        int len = haystack.length;

        for (int i = 0; i < len; i++) {
            if (haystack[i] != null && haystack[i].equals("needle")) {
                result = "found the needle at position " + i;
            }
        }

        return result;
    }
}
