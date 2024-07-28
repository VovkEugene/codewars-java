package kyu6;

import static java.util.stream.IntStream.range;

/**
 * Кратные 3 или 5
 * <p>
 * Если мы перечислим все натуральные числа до 10,
 * кратные 3 или 5, мы получим 3, 5, 6 и 9.
 * Сумма этих кратных равна 23.
 * <p>
 * Завершите решение так,
 * чтобы оно возвращало сумму всех кратных 3 или 5 ниже введенного числа.
 * <p>
 * Примечание. Если число кратно 3 и 5, посчитайте его только один раз.
 */
public class MultiplesOfThreeOrFive {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

//    public static int solution(int number) {
//        int result = 0;
//
//        for (int i = 1; i < number; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                result += i;
//            } else if (i % 3 == 0 || i % 5 == 0) {
//                result += i;
//            }
//        }
//
//        return result;
//    }

    public static int solution(int number) {
        return range(3, number)
                .filter(item -> item % 3 == 0 || item % 5 == 0)
                .sum();
    }
}
