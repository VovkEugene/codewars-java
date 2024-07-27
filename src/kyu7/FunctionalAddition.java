package kyu7;

import java.util.function.IntUnaryOperator;

/**
 * �������������� ����������
 * <p>
 * �������� ������� add(n),
 * ������� ���������� �������,
 * ������� ������ ��������� n � ������ �����.
 * <p>
 * ���������� ��� Java: ��� ������������� �������� � ������ �� �������, ��� ��������� ������.
 * <p>
 * ...returnType addOne = Kata.add(1);
 * addOne.method(3) => 4
 */
public class FunctionalAddition {
    public static void main(String[] args) {
        System.out.println(add(3).applyAsInt(5));
    }

    public static IntUnaryOperator add(int n) {
        return operand -> operand + n;
    }
}
