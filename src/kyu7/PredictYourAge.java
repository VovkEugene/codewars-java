package kyu7;

import java.util.Arrays;

/**
 * Предскажите свой возраст!
 * <p>
 * Мой дедушка всегда предсказывал, насколько стареют люди, и прямо перед смертью раскрыл свою тайну!
 * <p>
 * В честь памяти моего дедушки напишем функцию по его формуле!
 * <p>
 * Составьте список возраста, в котором умер каждый из ваших прадедов.
 * Умножьте каждое число само на себя.
 * Сложите их все вместе.
 * Извлеките квадратный корень из результата.
 * Разделить на два.
 * Пример
 * PredictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
 * Примечание: результат необходимо округлить до ближайшего целого числа.
 */
public class PredictYourAge {
    public static void main(String[] args) {
        System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));
        System.out.println(predictAge(32, 54, 76, 65, 34, 63, 64, 45));
    }

    public static int predictAge(int... ages) {
        int sum = Arrays.stream(ages)
                .map(age -> age * age)
                .sum();

        return (int) Math.sqrt(sum) / 2;
    }
}
