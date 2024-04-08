package kyu7;

/**
 * Комплементарная ДНК
 * <p>
 * Дезоксирибонуклеиновая кислота (ДНК) - это химическое вещество, содержащееся в ядре клеток
 * и содержащее "инструкции" для развития и функционирования живых организмов.
 * <p>
 * В строках ДНК символы "A" и "T" дополняют друг друга, как "C" и "G".
 * Ваша функция получает одну сторону ДНК;
 * вам нужно вернуть другую, дополняющую сторону.
 * Цепочка ДНК никогда не бывает пустой или ее вообще нет.
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
