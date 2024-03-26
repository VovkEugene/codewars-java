package kyu7;

/**
 * Ты - квадрат!
 * <p>
 * Квадрат из квадратов
 * Вам нравятся строительные блоки.
 * Вам особенно нравятся строительные блоки, которые являются квадратами.
 * И что вам еще больше нравится, так это расположить их в квадрат из квадратных строительных блоков!
 * <p>
 * Однако иногда вы не можете расположить их в квадрат.
 * Вместо этого у вас получается обычный прямоугольник!
 * Эти чертовы штуки!
 * Если бы у вас только был способ узнать, не напрасно ли вы сейчас работаете…
 * Ждать! Вот и все!
 * Вам просто нужно проверить, является ли ваше количество строительных блоков идеальным квадратом.
 * <p>
 * Задача
 * Дано целое число, определите, является ли оно квадратным числом:
 * В математике квадратное число или совершенный квадрат - это целое число,
 * которое является квадратом целого числа; другими словами,
 * это произведение некоторого целого числа на само себя.
 * <p>
 * Тесты всегда будут использовать некоторое целое число.
 * <p>
 * Examples
 * -1  =>  false
 * 0  =>  true
 * 3  =>  false
 * 4  =>  true
 * 25  =>  true
 * 26  =>  false
 */
public class YouAreSquare {
    public static boolean isSquare(int n) {
        return (int) Math.sqrt(n) * Math.sqrt(n) == n;
//        return Math.sqrt(n) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(0));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
        System.out.println(isSquare(139336256));    // false
    }
}