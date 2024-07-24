package kyu7;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

/**
 * Сортировка подарочного кода
 * <p>
 * Старший организатор подарков Санты Elf разработал способ представления до 26 подарков,
 * присвоив каждому подарку уникальный алфавитный символ.
 * После того, как каждому подарку был присвоен персонаж,
 * организатор подарков Эльф объединил персонажей, чтобы сформировать код заказа подарка.
 * <p>
 * Санта попросил своего организатора расположить персонажей в алфавитном порядке,
 * но Эльф уснул, съев слишком много горячего шоколада и леденцов!
 * Сможешь ли ты ему помочь?
 * <p>
 * Сортировка подарочного кода
 * Напишите функцию sortGiftCode/sort_gift_code/SortGiftCode,
 * которая принимает строку, содержащую до 26 уникальных буквенных символов,
 * и возвращает строку, содержащую те же символы в алфавитном порядке.
 * <p>
 * Examples (Input -- => Output):
 * "abcdef"                      -- => "abcdef"
 * "pqksuvy"                     -- => "kpqsuvy"
 * "zyxwvutsrqponmlkjihgfedcba"  -- => "abcdefghijklmnopqrstuvwxyz"
 */
public class SortGiftCode {
    public static void main(String[] args) {
        System.out.println(sortGiftCode("fedcba"));
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

    public static String sortGiftCode(String code) {
        return stream(code.split(""))
                .sorted()
                .collect(joining());
    }
}
