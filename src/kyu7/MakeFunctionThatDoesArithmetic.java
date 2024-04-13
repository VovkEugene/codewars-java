package kyu7;

/**
 * �������� �������, ������� ��������� �������������� ��������!
 * -----------------------------------------------------------
 * ���� ��� ����� � �������������� �������� (��� �������� � ���� ������),
 * ������� ��������� ��� ���� �����, ��� ������� ������������ ���� ��������.
 * -----------------------------------------------------------
 * a � b ����� ������ �������������� �������,
 * � a ������ ����� ������ ������ � ��������,
 * � b ������ ������.
 * -----------------------------------------------------------
 * ��� ������ ���������: "��������", "���������", "�������", "���������".
 * 5, 2, "add"      --> 7
 * 5, 2, "subtract" --> 3
 * 5, 2, "multiply" --> 10
 * 5, 2, "divide"   --> 2.5
 */
public class MakeFunctionThatDoesArithmetic {
    public static int arithmetic(int a, int b, String operator) {
        int result;

        switch (operator) {
            case "add" -> result = a + b;
            case "subtract" -> result = a - b;
            case "multiply" -> result = a * b;
            case "divide" -> result = a / b;
            default -> throw new IllegalStateException(
                    "Unexpected value: " + operator
            );
        }

        return result;
    }
}
