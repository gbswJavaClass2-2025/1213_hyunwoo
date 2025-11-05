package ex08.sec01.exam02;

public abstract class Skill {
    String skillName;

    Skill(String skillName) {
        this.skillName = skillName;
    }

    public abstract void execute();
}