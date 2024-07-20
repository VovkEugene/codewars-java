package kyu7;

import java.util.Objects;

/**
 * Два бойца, один победитель.
 * <p>
 * Создайте функцию, возвращающую имя победителя в схватке двух бойцов.
 * Каждый боец по очереди атакует другого, и тот, кто первым убьет другого, побеждает.
 * Смерть определяется как состояние здоровья <= 0.
 * <p>
 * Каждый боец будет объектом/экземпляром Fighter.
 * См. класс Fighter ниже на выбранном вами языке.
 * <p>
 * И health, и damagePerAttack будут целыми числами больше 0.
 * Вы можете мутировать объекты Fighter.
 * <p>
 * Ваша функция также получает третий аргумент — строку с именем бойца, который атакует первым.
 */
public class TwoFightersOneWinner {

    public static void main(String[] args) {
        var winner1 = declareWinner(
                new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 5), "Lew"
        );

        var winner2 = declareWinner(
                new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"
        );

        var winner3 = declareWinner(
                new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Harry"
        );

        var winner4 = declareWinner(
                new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harry"
        );

        var winner5 = declareWinner(
                new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harald"
        );

        var winner6 = declareWinner(
                new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Jerry"
        );

        var winner7 = declareWinner(
                new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Harald"
        );

        System.out.println(winner1);
        System.out.println(winner2);
        System.out.println(winner3);
        System.out.println(winner4);
        System.out.println(winner5);
        System.out.println(winner6);
        System.out.println(winner7);
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (Objects.equals(firstAttacker, fighter1.name)) {
            attack(fighter1, fighter2);
        } else {
            attack(fighter2, fighter1);
        }

        return isAlive(fighter1) ? fighter1.name : fighter2.name;
    }

    private static void attack(Fighter fighter1, Fighter fighter2) {
        while (isAlive(fighter1) && isAlive(fighter2)) {
            takeDamage(fighter2, fighter1.damagePerAttack);

            if (isAlive(fighter2)) {
                takeDamage(fighter1, fighter2.damagePerAttack);
            }
        }
    }

    private static void takeDamage(Fighter fighter, int damage) {
        if (isAlive(fighter) && fighter.health <= damage) {
            fighter.health = 0;
        } else {
            fighter.health -= damage;
        }
    }

    private static boolean isAlive(Fighter fighter) {
        return fighter.health > 0;
    }
}

class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
