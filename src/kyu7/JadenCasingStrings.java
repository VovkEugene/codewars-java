package kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * ƒжейден —мит, сын ”илла —мита, €вл€етс€ звездой таких фильмов,
 * как "ѕарень-каратист" (2010) и "ѕосле земли" (2013).
 * ƒжейден также известен своей философией, которую он излагает через Twitter.
 * »звестно, что при написании текстов в Twitter он почти всегда пишет каждое слово с заглавной буквы.
 * ƒл€ простоты вам придетс€ писать каждое слово с заглавной буквы,
 * посмотрите, какими должны быть сокращени€ в примере ниже:
 * <p>
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * <p>
 * ¬аша задача - преобразовать строки в то, как они были бы написаны ƒжейденом —митом.
 * Ёти строки €вл€ютс€ насто€щими цитатами из ƒжейдена —мита,
 * но они написаны с заглавной буквы не так, как он вводил их изначально.
 * <p>
 * ќбратите внимание, что верси€ Java ожидает возвращаемое значение null дл€ пустой строки
 * или значени€ null.
 */
public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(item -> Character.toUpperCase(item.charAt(0)) + item.substring(1))
                .collect(Collectors.joining(" "));
    }
}
