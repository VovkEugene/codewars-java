package kyu7;

/**
 * Простой счет бисера
 * <p>
 * Две красные бисеринки помещаются между двумя синими бисеринами.
 * Имеется N синих бусин. Посмотрев на расположение ниже, подсчитайте количество красных бусинок.
 * <p>
 * b rr b rr b rr b rr b
 * <p>
 * Реализуйте countRedBeads(n) так,
 * чтобы он возвращал количество красных бусинок.
 * <p>
 * Если синих бисерин меньше двух, вернуть 0.
 */
public class SimpleBeadsCount {
    public static void main(String[] args) {
        System.out.println(countRedBeads(0));
        System.out.println(countRedBeads(1));
        System.out.println(countRedBeads(3));
        System.out.println(countRedBeads(5));
    }

    public static int countRedBeads(final int nBlue) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nBlue - 1; i++) {
            sb.append("@@");
        }

        return sb.length();
    }
}
