package kyu6;

/**
 * ���� ��� ��������?
 * <p>
 * ��, ��������, ������ ������� ������ �� Facebook � ������ ���������.
 * ���� ����� ������� ����� ������ � ������, ������������ � ������ ���������.
 * �� ����� ������� �����, ������� ������ ������������ ����� � ����� ���������.
 * <p>
 * ���������� �������, ������� ��������� ������,
 * ���������� ����� �����, ������� ���������� �������.
 * <p>
 * �� ������ ���������� ������������ �����, ��� �������� � ��������:
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 * <p>
 * ����������. ��� ������� 4 � ����� ���� ����� � �"and 2 others� ������ �������������.
 */
public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        }

        var sb = new StringBuilder();

        if (names.length == 1) {
            sb.append(names[0])
                    .append(" likes this");
        }

        if (names.length == 2) {
            sb.append(names[0])
                    .append(" and ")
                    .append(names[1])
                    .append(" like this");
        }

        if (names.length == 3) {
            sb.append(names[0])
                    .append(", ")
                    .append(names[1])
                    .append(" and ")
                    .append(names[2])
                    .append(" like this");
        }

        if (names.length >= 4) {
            int counter = names.length - 2;

            sb.append(names[0])
                    .append(", ")
                    .append(names[1])
                    .append(" and ")
                    .append(counter)
                    .append(" others")
                    .append(" like this");
        }

        return sb.toString();
    }

    //public static String whoLikesIt(String... names) {
    //        switch (names.length) {
    //          case 0: return "no one likes this";
    //          case 1: return String.format("%s likes this", names[0]);
    //          case 2: return String.format("%s and %s like this", names[0], names[1]);
    //          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
    //          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
    //        }
    //    }
}
