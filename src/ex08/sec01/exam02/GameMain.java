package ex08.sec01.exam02;

public class GameMain {
    public static void main(String[] args) {
        System.out.println("----- 게임 캐릭터 및 스킬 시스템 시작 -----");

        Warrior warrior1 = new Warrior("Arthas");
        Warrior warrior2 = new Warrior("Thrall", 10);

        AttackSkill skill1 = new AttackSkill("Power Strike", 120);
        AttackSkill skill2 = new AttackSkill("Whirlwind", 200);

        warrior1.SpecialAbility();
        skill1.execute();

        warrior2.SpecialAbility();
        skill2.execute();

        System.out.println("----- 시스템 종료 -----");
    }
}
