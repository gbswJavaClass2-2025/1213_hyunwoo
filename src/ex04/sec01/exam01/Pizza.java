package ex04.sec01.exam01;

public class Pizza {
    public String dough;
    public int sizeInInch;
    public String pizza_name;

    public Pizza(String dough, int sizeInInch, String pizza_name) {
        this.dough = dough;
        this.sizeInInch = sizeInInch;
        this.pizza_name = pizza_name;
        System.out.println(">> Pizza 객체 생성: " + dough + " " + sizeInInch + "인치 피자");
    }
    public void bake() {
        System.out.println(pizza_name + ": 오븐에서 표준 시간 동안 피자를 굽습니다.");
    }
    public void bake(int time) {
        System.out.println(pizza_name + ": " + time + " 분 동 특별히 피자를 굽습니다.");
    }
    public void describe() {
        System.out.println(pizza_name + ": " + sizeInInch + "인치, " + dough + "도우를 사용한 피자입니다.");
    }
}
