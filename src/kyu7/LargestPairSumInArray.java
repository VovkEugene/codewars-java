package kyu7;

/**
 * Наибольшая сумма пар в массиве
 * <p>
 * Учитывая последовательность чисел,
 * найдите наибольшую парную сумму в этой последовательности.
 * <p>
 * Например: *
 * [10, 14, 2, 23, 19] --> 42 (= 23 + 19)
 * [99, 2, 2, 23, 19] --> 122 (= 99 + 23)
 * <p>
 * Входная последовательность содержит минимум два элемента,
 * каждый элемент является целым числом.
 */
public class LargestPairSumInArray {
    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19}));
        System.out.println(largestPairSum(new int[]{-100, -29, -24, -19, 19}));
        System.out.println(largestPairSum(new int[]{1, 2, 3, 4, 6, -1, 2}));
        System.out.println(largestPairSum(new int[]{-10, -8, -16, -18, -19}));
        System.out.println(largestPairSum(new int[]{-3, 40, 89, -34, 29, -73, -73, -83, -34, 98, 85, 64, 46, 46, -16, 20, 40, 6, -75, -93, -90, -28, 81, -76, -36}));
    }

    public static int largestPairSum(int[] numbers) {
        int max = numbers[0] + numbers[1];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    sum += numbers[i] + numbers[j];
                    max = Math.max(max, sum);
                    sum = 0;
                }
            }
        }

        return max;
    }

//    public static int largestPairSum(int[] numbers) {
//       Arrays.sort(numbers);
//       return numbers[numbers.length-1] + numbers[numbers.length-2];
//    }

//    public static int largestPairSum(int[] numbers) {
//		 return IntStream.of(numbers)
//                    .boxed()
//                    .sorted(Comparator.reverseOrder())
//                    .limit(2)
//                    .mapToInt(Integer::intValue)
//                    .sum();
//    }
}
