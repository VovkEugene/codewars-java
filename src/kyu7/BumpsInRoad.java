package kyu7;

/**
 * ”дары на дороге
 * <p>
 * ¬аша машина стара€, легко ломаетс€.
 * јмортизаторов больше нет, и вы думаете,
 * что он выдержит еще около 15 ударов, прежде чем полностью умрет.
 * <p>
 *   сожалению дл€ вас, ваша поездка очень ухабиста€!
 * ƒана строка, показывающа€ либо ровную дорогу (_), либо неровности (n).
 * ≈сли вам удалось благополучно добратьс€ до дома,
 * встретив 15 или меньше ударов, верните Woohoo!,
 * в противном случае верните Car Dead
 */
public class BumpsInRoad {
    public static void main(String[] args) {
        System.out.println(bumps("n"));
        System.out.println(bumps("__nn_nnnn__n_n___n____nn__nnn"));
        System.out.println(bumps("nnn_n__n_n___nnnnn___n__nnn__"));
        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        System.out.println(bumps("______n___n_"));
        System.out.println(bumps("nnnnnnnnnnnnnnnnnnnnn"));
    }

    public static String bumps(final String road) {
        int fatalBump = 15;

        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == 'n') {
                fatalBump--;
            }

            if (fatalBump < 0) {
                return "Car Dead";
            }
        }

        return "Woohoo!";
    }
}
