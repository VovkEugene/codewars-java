package kyu8;

/**
 * Ты играешь на банджо?
 *
 * Создайте функцию, которая отвечает на вопрос "Вы играете на банджо?".
 * Если ваше имя начинается с буквы "R" или строчной "r", вы играете на банджо!
 *
 * Функция принимает имя в качестве единственного аргумента и возвращает одну из следующих строк:
 * name + " plays banjo"
 * name + " does not play banjo"
 *
 * Указанные имена всегда являются допустимыми строками.
 */
public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
//        return name.startsWith("R") || name.startsWith("r")
//                ? name + " plays banjo"
//                : name + " does not play banjo";
        return name.matches("^[Rr].*")
                ? name + " plays banjo"
                : name + " does not play banjo";
    }
}
