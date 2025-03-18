package kyu7;

/**
 * Завершите метод так, чтобы он возвращал URL с чем угодно после удаления привязки (#).
 * ---
 * "www.codewars.com#about" --> "www.codewars.com"
 * "www.codewars.com?page=1" -->"www.codewars.com?page=1"
 */
public class RemoveAnchorFromUrl {
    public static String removeUrlAnchor(String url) {
        int anchor = url.indexOf('#');
        if (anchor == -1) {
            return url;
        }
        return url.substring(0, anchor);
    }
}
