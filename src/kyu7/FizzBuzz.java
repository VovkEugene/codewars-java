package kyu7;

/**
 * Верните массив, содержащий числа от 1 до N, где N — переданное в качестве параметра значение.
 * Однако замените некоторые значения, если выполняется одно из следующих условий:
 * ---
 * Если значение кратно 3: используйте значение «Fizz» вместо этого
 * Если значение кратно 5: вместо этого используйте значение «Buzz»
 * Если значение кратно 3 и 5: используйте значение «FizzBuzz» вместо этого
 * N никогда не будет меньше 1.
 * ---
 * FizzBuzzArray.fizzBuzz(3) -->  ["1", "2", "Fizz"]
 */
public class FizzBuzz {
    public static String[] fizzBuzz(int n) {
        String[] result = new String[n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[index++] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[index++] = "Fizz";
            } else if (i % 5 == 0) {
                result[index++] = "Buzz";
            } else {
                result[index++] = String.valueOf(i);
            }
        }
        return result;
    }
}
