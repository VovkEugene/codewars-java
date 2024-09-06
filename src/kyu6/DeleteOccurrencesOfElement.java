package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Удалять вхождения элемента, если он встречается более n раз.
 * <p>
 * Алиса и Боб были в отпуске.
 * Они оба сделали много фотографий мест, где побывали,
 * и теперь они хотят показать Чарли всю свою коллекцию.
 * Однако Чарли не нравятся такие сеансы, поскольку мотив обычно повторяется.
 * Ему не нравится видеть Эйфелеву башню 40 раз.
 * Он говорит им, что сядет на сеанс только в том случае,
 * если они покажут один и тот же мотив не более N раз.
 * К счастью, Алиса и Боб могут закодировать мотив в виде числа.
 * Можете ли вы помочь им удалить числа так,
 * чтобы их список содержал каждое число только до N раз, не меняя порядка?
 * <p>
 * Задача:
 * Дан список и номер,
 * создать новый список, который будет содержать каждый номер списка не более N раз,
 * без повтора.
 * <p>
 * Например, если введенное число равно 2,
 * и список ввода: [1,2,3,1,2,1,2,3],
 * вы берете [1,2,3,1,2],
 * отбросьте следующие [1,2],
 * так как это приведет к тому, что 1 и 2 появятся в результате 3 раза,
 * и затем возьмем 3, что приведет к [1,2,3,1,2,3].
 * Со списком [20,37,20,21] и номером 1 результатом будет [20,37,21].
 */
public class DeleteOccurrencesOfElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int counter;
        var map = new HashMap<Integer, Integer>();
        var resultList = new ArrayList<Integer>();

        for (int item : elements) {
            counter = map.getOrDefault(item, 0);
            if (counter < maxOccurrences) {
                resultList.add(item);
                map.put(item, counter + 1);
            }
        }

        return resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
