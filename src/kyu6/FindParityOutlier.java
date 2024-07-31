package kyu6;

/**
 * Ќайдите выброс четности
 * <p>
 * ¬ам дан массив (длина которого не менее 3, но может быть очень большим),
 * содержащий целые числа.
 * ћассив либо полностью состоит из нечетных целых чисел,
 * либо полностью состоит из четных целых чисел,
 * за исключением одного целого числа N.
 * <p>
 * Ќапишите метод, который принимает массив в качестве аргумента
 * и возвращает это Ђвыбросї N.
 * <p>
 * Examples
 * [2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)
 * <p>
 * [160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
 */
public class FindParityOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 6, 8, -10, 3}));
        System.out.println(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        System.out.println(find(new int[]{Integer.MAX_VALUE, 0, 1}));

    }

    static int find(int[] integers) {
        int counterEven = 0;
        int counterOdd = 0;
        var result = new int[2];

        counterEven = getOnlyEvenNumber(integers, counterEven, result);

        getOnlyOddNumber(integers, counterOdd, result);

        return counterEven == 1 ? result[0] : result[1];
    }

    private static int getOnlyEvenNumber(int[] integers, int counter, int[] result) {
        for (int item : integers) {
            if (item % 2 == 0) {
                counter++;
                result[0] = item;
            }

            if (isMoreThenOne(counter)) {
                break;
            }
        }

        return counter;
    }

    private static void getOnlyOddNumber(int[] integers, int counter, int[] result) {
        for (int item : integers) {
            if (item % 2 != 0) {
                counter++;
                result[1] = item;
            }

            if (isMoreThenOne(counter)) {
                break;
            }
        }
    }

    private static boolean isMoreThenOne(int counter) {
        return counter > 1;
    }
}
