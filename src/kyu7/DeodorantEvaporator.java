package kyu7;

/**
 * Дезодорант-испаритель
 *
 * Эта программа проверяет срок службы испарителя, содержащего газ.
 *
 * Мы знаем содержимое испарителя (объем - content в мл),
 * процент пены или газа, теряемый каждый день (evap_per_day)
 * и порог (threshold) в процентах, за которым испаритель больше не полезен.
 * Все числа строго положительные.
 *
 * Программа сообщает n-й день (в виде целого числа), в который испаритель выйдет из строя.
 *
 * Пример:
 * evaporator(10, 10, 5) -> 29
 * 
 * Примечание:
 * Содержимое в теле функции "испаритель" на самом деле не обязательно,
 * вы можете использовать его или не использовать по своему усмотрению.
 * Некоторые люди предпочитают рассуждать с помощью содержания, другие — только с процентами.
 * Решать вам, но вы должны сохранить его как параметр,
 * поскольку в тестах он используется в качестве аргумента.
 */
public class DeodorantEvaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        int counter = 0;
        threshold = getPercent(content, threshold);

        while (content > threshold) {
            content = content - getPercent(content, evap_per_day);
            counter++;
        }

        return counter;
    }

    private static double getPercent(double content, double percentValue) {
        return (content / 100) * percentValue;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 5));
        System.out.println(evaporator(10, 10, 10));
    }
}
