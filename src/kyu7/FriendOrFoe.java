package kyu7;

import java.util.List;

/**
 * Напиши программу, которая фильтрует список строк и возвращает список, содержащий только имя вашего друга.
 * ---
 * Если в имени ровно 4 буквы, вы можете быть уверены, что это должен быть ваш друг!
 * В противном случае вы можете быть уверены, что это не так...
 * ---
 * Input = ["Ryan", "Kieran", "Jason", "Yous"]
 * Output = ["Ryan", "Yous"]
 * ---
 * Input = ["Peter", "Stephen", "Joe"]
 * Output = []
 */
public class FriendOrFoe {
    public static List<String> friend(List<String> list) {
        return list.stream()
                .filter(name -> name.length() == 4)
                .toList();
    }
}
