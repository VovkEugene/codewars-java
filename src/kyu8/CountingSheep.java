package kyu8;

import java.util.Arrays;

/**
 * Счет овец...
 * <p>
 * Рассмотрим массив / список овец, в котором некоторые овцы могут отсутствовать на своем месте.
 * Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве
 * (true означает "присутствует").
 * <p>
 * For example:
 * [true,  true,  true,  false,
 * true,  true,  true,  true ,
 * true,  false, true,  false,
 * true,  false, false, true ,
 * true,  true,  true,  true ,
 * false, false, true,  true]
 * <p>
 * Правильным ответом было бы 17.
 * <p>
 * Подсказка: Не забудьте проверить наличие неверных значений, таких как null
 */
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(sheep -> sheep != null && sheep)
                .count();
    }
}
