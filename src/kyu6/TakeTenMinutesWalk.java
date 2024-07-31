package kyu6;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Совершите десятиминутную прогулку
 * <p>
 * Вы живете в городе Картезия,
 * где все дороги расположены в идеальной сетке.
 * Вы пришли на встречу на десять минут раньше
 * и решили воспользоваться возможностью прогуляться.
 * Город предоставляет своим гражданам приложение
 * для создания ходьбы на их телефонах —
 * каждый раз, когда вы нажимаете кнопку,
 * оно отправляет вам массив однобуквенных строк,
 * представляющих направления для ходьбы (например, ['n', 's', 'w', 'е']).
 * Вы всегда проходите только один квартал для каждой буквы (направления),
 * и вы знаете, что прохождение одного городского квартала занимает у вас одну минуту.
 * <p>
 * Cоздайте функцию, которая будет возвращать true,
 * если прогулка, которую предлагает вам приложение,
 * займет у вас ровно десять минут (вы не хотите ни раньше, ни позже!)
 * и, конечно же, вернет вас в исходную точку.
 * В противном случае верните false.
 * <p>
 * Примечание. Вы всегда получите действительный массив,
 * содержащий случайный набор букв направления (только «n», «s», «e» или «w»).
 * Он никогда не выдаст вам пустой массив (это не прогулка, это стояние на месте!).
 */
public class TakeTenMinutesWalk {
    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(isValid(new char[]{'w'}));
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    public static boolean isValid(char[] walk) {
        int tenMinutes = 10;

        if (walk.length != tenMinutes) {
            return false;
        }

        var mapDirections = getMapDirections(walk);

        return Objects.equals(mapDirections.get('n'), mapDirections.get('s'))
                && Objects.equals(mapDirections.get('e'), mapDirections.get('w'));
    }

    private static HashMap<Character, Integer> getMapDirections(char[] walk) {
        var mapDirections = new HashMap<>(
                Map.of('n', 0, 's', 0, 'e', 0, 'w', 0));

        for (char direction : walk) {
            if (mapDirections.containsKey(direction)) {
                mapDirections.put(direction, mapDirections.get(direction) + 1);
            }
        }

        return mapDirections;
    }
}
