package kyu8;

/**
 * Противоположности притягиваются
 *
 * Тимми и Сара думают, что они влюблены, но там, где они живут, они узнают об этом только после того,
 * как сорвут по цветку. Если у одного из цветков четное количество лепестков, а у другого нечетное,
 * это означает, что они влюблены.
 *
 * Напишите функцию, которая будет принимать количество лепестков каждого цветка и возвращать значение true,
 * если они влюблены, и значение false, если это не так.
 */
public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }
}