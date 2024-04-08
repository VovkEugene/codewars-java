package kyu7;

/**
 * ��������������� ���
 * <p>
 * ���������������������� ������� (���) - ��� ���������� ��������, ������������ � ���� ������
 * � ���������� "����������" ��� �������� � ���������������� ����� ����������.
 * <p>
 * � ������� ��� ������� "A" � "T" ��������� ���� �����, ��� "C" � "G".
 * ���� ������� �������� ���� ������� ���;
 * ��� ����� ������� ������, ����������� �������.
 * ������� ��� ������� �� ������ ������ ��� �� ������ ���.
 * Example:
 * "ATTGC" --> "TAACG"
 * "GTAT" --> "CATA"
 */
public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        char[] symbols = dna.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < symbols.length; i++) {
            switch (symbols[i]) {
                case 'A' -> symbols[i] = 'T';
                case 'T' -> symbols[i] = 'A';
                case 'C' -> symbols[i] = 'G';
                case 'G' -> symbols[i] = 'C';
            }

            sb.append(symbols[i]);
        }

        return sb.toString();
    }
}
