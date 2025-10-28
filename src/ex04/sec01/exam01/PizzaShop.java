package ex04.sec01.exam01;

public class PizzaShop {
    public static void main(String[] args) {
        System.out.println("----- 피자 가게 시스템 실습 시작 -----");
        Pizza plain = new Pizza("썬 크러스트", 10, "Plain Pizza");
        ToppingPizza cheese = new ToppingPizza("핸드 토스", 12, "CheesePizza", "모짜렐라");
        ToppingPizza pepperoni = new ToppingPizza("팬 도우", 14, "Pepperoni Pizza", "페퍼로니");

        System.out.println();
        System.out.println("-----------------");
        System.out.println();

        System.out.println("[4. 오버라이딩 (설명)]");
        plain.describe();
        cheese.describe();
        pepperoni.describe();

        System.out.println();
        System.out.println("-----------------");
        System.out.println();

        System.out.println("[3. 오버로딩 (굽기)]");
        plain.bake();
        plain.bake(15);
        pepperoni.bake();
        pepperoni.bake(20);
        pepperoni.bake(18, 350);

        System.out.println();
        System.out.println("----- 실습 종료 -----");
    }
}
