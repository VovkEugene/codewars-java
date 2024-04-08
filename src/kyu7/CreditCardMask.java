package kyu7;

/**
 * Маска кредитной карты
 * <p>
 * Обычно, когда вы что-то покупаете, вас спрашивают, верен ли номер вашей кредитной карты,
 * номер телефона или ответ на ваш самый секретный вопрос.
 * Однако, поскольку кто-то может заглянуть вам через плечо, вы не хотите,
 * чтобы это отображалось на вашем экране. Вместо этого мы маскируем это.
 * <p>
 * Ваша задача - написать функцию maskify, которая заменяет все символы,
 * кроме последних четырех, на "#".
 * <p>
 * Examples
 * "4556364607935616" --> "############5616"
 * "64607935616" -->      "#######5616"
 * "1" -->                "1"
 * "" -->                 ""
 * <p>
 * // "What was the name of your first pet?"
 * "Skippy" --> "##ippy"
 * "Nananananananananananananananana Batman!" --> "####################################man!"
 */
public class CreditCardMask {
    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        return sb.append("#".repeat(Math.max(0, str.length() - 4)))
                .append(str.substring(str.length() - 4))
                .toString();
    }
}
