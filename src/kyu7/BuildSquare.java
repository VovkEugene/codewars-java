package kyu7;

/**
 * ѕостроить квадрат
 * <p>
 * я дам вам целое число.
 * ¬ерните мне фигуру такой же длины и ширины, как целое число.
 * ÷елое число будет целым числом от 1 до 50.
 * <p>
 * ѕример
 * n = 3, поэтому € ожидаю обратного квадрата 3x3, как показано ниже, в виде строки:
 * <p>
 * +++
 * +++
 * +++
 */
public class BuildSquare {
    public static void main(String[] args) {
        System.out.println(generateShape(3));
        System.out.println(generateShape(5));
        System.out.println(generateShape(8));
    }

    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("+".repeat(n));

            if (i != (n - 1)) {
                sb.append('\n');
            }
        }

        return sb.toString();
    }
}
