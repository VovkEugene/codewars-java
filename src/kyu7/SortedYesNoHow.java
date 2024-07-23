package kyu7;

/**
 * —ортировано? да? нет? как?
 * <p>
 * «авершите метод, который принимает массив целых чисел и возвращает одно из следующих значений:
 * Ђда, по возрастаниюї Ч если числа в массиве отсортированы по возрастанию
 * Ђда, по убываниюї Ч если числа в массиве отсортированы по убыванию
 * Ђнетї Ч иначе
 * ¬ы можете предположить, что массив всегда будет действительным и всегда будет один правильный ответ.
 */
public class SortedYesNoHow {
    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[]{1, 2}));
        System.out.println(isSortedAndHow(new int[]{15, 7, 3, -8}));
        System.out.println(isSortedAndHow(new int[]{4, 2, 30}));
        System.out.println(isSortedAndHow(new int[]{8}));
    }

    public static String isSortedAndHow(int[] array) {
        if (array.length > 0) {
            if (array.length == 1 || getAscending(array)) {
                return "yes, ascending";
            }

            if (getDescending(array)) {
                return "yes, descending";
            }
        }

        return "no";
    }

    private static boolean getDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (!(array[i - 1] > array[i])) {
                return false;
            }
        }

        return true;
    }

    private static boolean getAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (!(array[i - 1] < array[i])) {
                return false;
            }
        }

        return true;
    }


//    public static String isSortedAndHow(int[] array) {
//        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] <= array[i+1]))
//            return "yes, ascending";
//
//        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] >= array[i+1]))
//            return "yes, descending";
//
//        return "no";
//    }
}
