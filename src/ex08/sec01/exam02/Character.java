package ex08.sec01.exam02;

public abstract class Character {
    String name;
    int level;

    Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public abstract void SpecialAbility();
}
