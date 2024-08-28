package kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Подсчитайте смайлики!
 * <р>
 * Учитывая массив (arr) в качестве аргумента, выполните функцию countSmileys,
 * которая должна возвращать общее количество улыбающихся лиц.
 * <р>
 * Правила улыбающегося лица:
 * <р>
 * Каждый смайлик должен содержать действительную пару глаз.
 * Глаза могут быть отмечены как : или ;
 * Смайлик может иметь нос, но не обязательно. Допустимые символы для носа: - или ~.
 * На каждом улыбающемся лице должен быть улыбающийся рот, отмеченный либо ), либо D.
 * Никакие дополнительные символы, кроме упомянутых, не допускаются.
 * <р>
 * Допустимые примеры смайлов: :) :D ;-D :~)
 * Недопустимые смайлы: ;( :> :} :]
 */
public class CountSmileyFaces {
    public static void main(String[] args) {
        var a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add(":-}");
        a.add(":-()");

        var b = new ArrayList<String>();
        b.add(":)");
        b.add("XD");
        b.add(":0}");
        b.add("x:-");
        b.add("):-");
        b.add("D:");

        var c = new ArrayList<String>();
        c.add(":)");
        c.add(":D");
        c.add("X-}");
        c.add("xo)");
        c.add(":X");
        c.add(":-3");
        c.add(":3");

        var d = new ArrayList<String>();
        d.add(":)");
        d.add(":)");
        d.add("x-]");
        d.add(":ox");
        d.add(";-(");
        d.add(";-)");
        d.add(";~(");
        d.add(":~D");
        d.add(":~D)");
        d.add(":;~D)");

        var e = new ArrayList<String>();
        e.add(":D");
        e.add("8x");
        e.add("8D");
        e.add("()");
        e.add(":8X");
        e.add(":p");
        e.add(":dP");
        e.add(";X");
        e.add(";8X");
        e.add("(-D");
        e.add(";x)");
        e.add("'~-D");
        e.add("px");
        e.add("5D");
        e.add(":D");
        e.add("'p");
        e.add(";oD");
        e.add(";ox");
        e.add(";pD");
        e.add("'oD");
        e.add(";D");
        e.add("()");
        e.add("'oD");
        e.add(";)");
        e.add("(~P");
        e.add("8-x");
        e.add("(x");
        e.add(";P");
        e.add("p;)");
        e.add(":p)");
        e.add("p:D)");
        e.add("oP");
        e.add(":xD");
        e.add("");

        System.out.println(countSmileys(a));
        System.out.println(countSmileys(b));
        System.out.println(countSmileys(c));
        System.out.println(countSmileys(e));
    }

    public static int countSmileys(List<String> arr) {
        int counter = 0;
        var pattern = Pattern.compile("[:;][-~]?[\\)D]");

        for (String smile : arr) {
            if (pattern.matcher(smile).matches()) {
                counter++;
            }
        }

        return counter;
    }
}
