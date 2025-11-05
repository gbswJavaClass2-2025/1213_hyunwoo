package ex08.sec01.exam02;

public class Warrior extends Character {

    Warrior(String name) {
        super(name, 1);
    }

    Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    public void SpecialAbility() {
        System.out.println(name + " shouts: Charge!");
    }
}
