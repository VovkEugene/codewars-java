package kyu8;

import java.util.Arrays;

/**
 * Насколько ты хорош на самом деле?
 *
 * В вашем классе был тест, и вы его сдали. Поздравляю!
 * Но вы амбициозный человек.
 * Вы хотите знать, лучше ли вы среднестатистического ученика в вашем классе.
 *
 * Вы получаете массив с результатами тестов ваших сверстников.
 * Теперь рассчитайте среднее значение и сравните свой результат!
 *
 * Верните True, если вы лучше, иначе False!
 * 
 * Примечание:
 * Ваши баллы не включаются в массив баллов вашего класса.
 * Для расчета среднего балла вы можете добавить свой балл в данный массив!
 */
public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > Arrays.stream(classPoints).average().orElse(0);
    }
}
