package kyu7;

/**
 * Digits explosion
 * <p>
 * Дана строка, состоящая из цифр [0–9],
 * верните строку, в которой каждая цифра
 * повторяется количество раз, равное ее значению.
 * <p>
 * Examples
 * "312" should return "333122"
 * "102269" should return "12222666666999999999"
 */
public class DigitsExplosion {
    public static void main(String[] args) {
        System.out.println(explode("123"));
        System.out.println(explode("321"));
        System.out.println(explode("102269"));
        System.out.println(explode("0"));
        System.out.println(explode("000"));
    }

    public static String explode(String digits) {
        var sb = new StringBuilder();

        for (String digit : digits.split("")) {
            int repeat = Integer.parseInt(digit);

            for (int i = 0; i < repeat; i++) {
                sb.append(digit);
            }
        }

        return sb.toString();
    }

    //public static String explode(String digits) {
    //      return digits.chars()
    //            .mapToObj(Character::toString)
    //            .map(item -> item.repeat(Integer.parseInt(item)))
    //            .collect(Collectors.joining());
    //  }
}
