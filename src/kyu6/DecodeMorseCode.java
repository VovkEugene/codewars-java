package kyu6;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ����������� ������ �����
 * <p>
 * � ���� ���� ��� ��������� �������� ������� ������� ������ �����.
 * ���� ������ ����� � ��������� ����� � �������� ��������� �������� �������� ������ � �������� ������,
 * ��� ��� ��� ������������ � ��������� ����������� �� ����� ����.
 * ��� ����� �������� ������ ������ ��� ������������������ ������ � �����.
 * ��������, ����� A ���������� ��� �-, ����� Q ���������� ��� ?-�-,
 * � ����� 1 ���������� ��� �----.
 * � ���� ����� ������� �� �����������, ����������� ������������ ��������� �����.
 * ����� ��������� �������� ������� �����,
 * ��� ���������� ����� �������� ������������ ���� ������,
 * � ��� ���������� ���� � ��� �������.
 * ��������, ��������� �� ���� �� ������ ����� �������� ���: ���� � -�-- �--- ��- -�� �.
 * <p>
 * ����������. �������������� ������� �� ��� ����� ���� �� ����� �������� � �� ������� ������������.
 * <p>
 * ������ ����, ���� � ��������� ������ ����������, ���������� ��������� ���� ����������� �����,
 * �������� ��������� �� ������� �������� ������������� ������ �������� SOS
 * (������� ���������� ����������), ������� ���������� ��� ���---�� �.
 * ��� ����������� ���� ��������������� ��� ��������� ����������� �������
 * � ������ ���������� ��� ��������� �����.
 * <p>
 * ���� ������ � ����������� �������, ������� ����� ��������� �� ���� ������ �����
 * � ���������� ��������������, ������������� ������.
 * <p>
 * For example:
 * <p>
 * MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
 * //should return "HEY JUDE"
 */
public class DecodeMorseCode {
    public static void main(String[] args) {
        System.out.println(encode("HEY JUDE"));
        System.out.println(encode("SOS"));
        System.out.println(encode("SOS! THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."));

        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
        System.out.println(decode("... --- ..."));
        System.out.println(decode("... --- ... -.-.--   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. .-.-.-"));
    }

    public static String decode(String morseCode) {
        var sb = new StringBuilder();
        var words = morseCode.split("   ");
        var mapMorse = getMapMorse();

        for (var word : words) {
            for (var letter : word.split(" ")) {
                for (var item : mapMorse.entrySet()) {
                    if (Objects.equals(item.getValue(), letter)) {
                        sb.append(item.getKey());
                    }
                }
            }

            sb.append(' ');
        }

        return sb.toString().trim();
    }

    public static String encode(String morseCode) {
        var sb = new StringBuilder();
        var mapMorse = getMapMorse();

        for (char item : morseCode.toCharArray()) {
            if (item == ' ') {
                sb.append(' ').append(' ');
            } else {
                sb.append(mapMorse.get(Character.toUpperCase(item))).append(' ');
            }
        }

        return sb.toString().trim();
    }

    private static Map<Character, String> getMapMorse() {
        Map<Character, String> mapMorse = new HashMap<>();
        mapMorse.put('A', ".-");
        mapMorse.put('B', "-...");
        mapMorse.put('C', "-.-.");
        mapMorse.put('D', "-..");
        mapMorse.put('E', ".");
        mapMorse.put('F', "..-.");
        mapMorse.put('G', "--.");
        mapMorse.put('H', "....");
        mapMorse.put('I', "..");
        mapMorse.put('J', ".---");
        mapMorse.put('K', "-.-");
        mapMorse.put('L', ".-..");
        mapMorse.put('M', "--");
        mapMorse.put('N', "-.");
        mapMorse.put('O', "---");
        mapMorse.put('P', ".--.");
        mapMorse.put('Q', "--.-");
        mapMorse.put('R', ".-.");
        mapMorse.put('S', "...");
        mapMorse.put('T', "-");
        mapMorse.put('U', "..-");
        mapMorse.put('V', "...-");
        mapMorse.put('W', ".--");
        mapMorse.put('X', "-..-");
        mapMorse.put('Y', "-.--");
        mapMorse.put('Z', "--..");
        mapMorse.put('.', ".-.-.-");
        mapMorse.put('!', "-.-.--");

        return mapMorse;
    }
}
