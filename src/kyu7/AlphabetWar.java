package kyu7;

import java.util.HashMap;
import java.util.Map;

/**
 * ���������� �����
 * <p>
 * ��������
 * ���� ����� � ����� �� ����� - ����� ���������!
 * ���� ��� ������ ���������� �����.
 * ���������� ����� ������ � ������� ������� ���� ������� ������, � �������� �����.
 * <p>
 * ������
 * �������� �����, ������� ��������� ������ ���, ��������� ������ �� ��������� ����,
 * � ���������� ���������� � ���, ��� ������� � �����.
 * ����� ��������� ����� ������� - return Left side wins!,
 * ����� ��������� ������ ������� - return Right side wins!,
 * � ��������� ������ - return Let's fight again!
 * <p>
 * ����� ����� � �� ����:
 * w - 4
 * p - 3
 * b - 2
 * s - 1
 * <p>
 * ������ ����� � �� ����:
 * m - 4
 * q - 3
 * d - 2
 * z - 1
 * <p>
 * ��������� ����� �� ����� ���� � �������� ���� ��������.
 * <p>
 * Example
 * AlphabetWar("z");        //=> Right side wins!
 * AlphabetWar("zdqmwpbs"); //=> Let's fight again!
 * AlphabetWar("zzzzs");    //=> Right side wins!
 * AlphabetWar("wwwwwwz");  //=> Left side wins!
 */
public class AlphabetWar {
    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("zzzzs"));
        System.out.println(alphabetWar("wwwwwwz"));
    }

    public static String alphabetWar(String fight) {
        int leftSideCounter = 0;
        int rightSideCounter = 0;

        Map<String, Integer> leftSideLetters = new HashMap<>();
        Map<String, Integer> rightSideLetters = new HashMap<>();

        leftSideLetters.put("w", 4);
        leftSideLetters.put("p", 3);
        leftSideLetters.put("b", 2);
        leftSideLetters.put("s", 1);

        rightSideLetters.put("m", 4);
        rightSideLetters.put("q", 3);
        rightSideLetters.put("d", 2);
        rightSideLetters.put("z", 1);

        for (int i = 0; i < fight.length(); i++) {
            String key = Character.valueOf(fight.charAt(i)).toString();

            if (leftSideLetters.containsKey(key)) {
                leftSideCounter += leftSideLetters.get(key);
            }

            if (rightSideLetters.containsKey(key)) {
                rightSideCounter += rightSideLetters.get(key);
            }
        }

        if (leftSideCounter > rightSideCounter) {
            return "Left side wins!";
        }

        if (rightSideCounter > leftSideCounter) {
            return "Right side wins!";
        }

        return "Let's fight again!";
    }
}
