package ex08.sec01.exam02;

public class AttackSkill extends Skill {
    int damage;

    AttackSkill(String skillName, int damage) {
        super(skillName);
        this.damage = damage;
    }

    @Override
    public void execute() {
        System.out.println("Dealt " + damage + " damage using " + skillName + ".");
    }
}
