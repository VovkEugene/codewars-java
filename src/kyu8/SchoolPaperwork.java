package kyu8;

/**
 * Школьные документы
 * <p>
 * Ваши одноклассники попросили вас скопировать для них некоторые документы.
 * Вы знаете, что есть "n" одноклассников, а в документах "m" страниц.
 * <p>
 * Ваша задача - подсчитать, сколько пустых страниц вам нужно.
 * Если n < 0 или m < 0, верните 0.
 * <p>
 * Example:
 * n= 5, m=5: 25
 * n=-5, m=5:  0
 */
public class SchoolPaperwork {
    public static int paperWork(int n, int m) {
        return n < 0 || m < 0 ? 0 : n * m;
    }
}