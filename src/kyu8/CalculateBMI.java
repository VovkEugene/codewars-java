package kyu8;

/**
 * Рассчитать ИМТ (индекс массы тела)
 *
 * Напишите функцию bmi, которая вычисляет индекс массы тела (имт = вес / рост2).
 *
 * если имт <= 18,5, верните "Недостаточный вес"
 * если имт <= 25,0, верните "Нормальный"
 * если имт <= 30,0, верните "Избыточный вес"
 * если имт > 30, верните "Ожирение"
 */
public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);

        if (bmi <= 18.5) {
            return "Underweight";
        }

        if (bmi <= 25.0) {
            return "Normal";
        }

        if (bmi <= 30.0) {
            return "Overweight";
        }

        if (bmi > 30) {
            return "Obese";
        }

        return "";
    }
}
