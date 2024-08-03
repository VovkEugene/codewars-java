package kyu6;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

/**
 * Последовательность Трибоначчи
 * <p>
 * Фибоначчи, но суммируя последние 3 (вместо 2)
 * чисел последовательности для генерации следующей.
 * <p>
 * Итак, если мы хотим начать нашу последовательность Трибоначчи с [1, 1, 1]
 * в качестве начального ввода, у нас будет такая последовательность:
 * [1, 1, 1, 3, 5, 9, 17, 31, ...]
 * <p>
 * Но что, если мы начнем с [0, 0, 1] в качестве подписи?
 * Поскольку начало с [0, 1] вместо [1, 1]
 * по существу сдвигает обычную последовательность Фибоначчи на одну позицию,
 * у вас может возникнуть соблазн подумать,
 * что мы получим ту же последовательность, смещенную на 2 позиции,
 * но это не так, и мы получим:
 * [0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
 * <p>
 * Что ж, вы, возможно, уже догадались, но чтобы внести ясность:
 * вам нужно создать функцию Фибоначчи,
 * которая, учитывая массив,
 * возвращает первые n элементов - включенная подпись
 * в полученную таким образом последовательность.
 * <p>
 * Подпись всегда будет состоять из 3 цифр;
 * n всегда будет неотрицательным числом;
 * если n == 0, то верните пустой массив
 * и будьте готовы ко всему, что явно не указано;)
 */
public class TribonacciSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 0, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 10)));

        System.out.println(Arrays.toString(tribonacci(new double[]{9.0, 3.0, 19.0}, 8)));
        System.out.println(Arrays.toString(tribonacci(new double[]{9.0, 10.0, 0.0}, 37)));
        System.out.println(Arrays.toString(tribonacci(new double[]{6.0, 4.0, 10.0}, 16)));
        System.out.println(Arrays.toString(tribonacci(new double[]{3.0, 2.0, 0.0}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{16.0, 17.0, 2.0}, 34)));
        System.out.println(Arrays.toString(tribonacci(new double[]{7.0, 7.0, 2.0}, 21)));
        System.out.println(Arrays.toString(tribonacci(new double[]{2.0, 2.0, 15.0}, 1)));

        System.out.println(Arrays.toString(tribonacci(new double[]{4.0, 5.0, 12.0}, 0)));
        System.out.println(Arrays.toString(tribonacci(new double[]{4.0, 5.0, 12.0}, 3)));
        System.out.println(Arrays.toString(tribonacci(new double[]{4.0, 5.0, 12.0}, 2)));
        System.out.println(Arrays.toString(tribonacci(new double[]{4.0, 5.0, 12.0}, 1)));
    }

    public static double[] tribonacci(double[] s, int n) {
        var result = copyOf(s, n);

        for (int i = s.length; i < result.length; i++) {
            result[i] = result[i - 3]
                    + result[i - 2]
                    + result[i - 1];
        }

        return result;
    }

//    public static double[] tribonacci(double[] s, int n) {
//        if (n == 0) {
//            return new double[0];
//        }
//
//        var result = getDoubleList(s);
//
//        for (int i = 3; i < n; i++) {
//            double sumOfThree = result.get(i - 3)
//                    + result.get(i - 2)
//                    + result.get(i - 1);
//            result.add(sumOfThree);
//        }
//
//        return getDoubleArray(result);
//    }
//
//    private static ArrayList<Double> getDoubleList(double[] s) {
//        return new ArrayList<>(DoubleStream.of(s)
//                .boxed()
//                .toList());
//    }
//
//    private static double[] getDoubleArray(ArrayList<Double> result) {
//        return result.stream()
//                .mapToDouble(item -> item)
//                .toArray();
//    }
}
