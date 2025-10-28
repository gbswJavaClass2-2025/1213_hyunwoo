package ex03.sec01.exam01;

public class PracticeExample {
    public static void main(String[] args) {
        Animal tiger = new Animal("호랑이");
        Dog gold = new Dog("골든 리트리버");
        System.out.println("----- 실습 시작 -----");
        System.out.println(">> Animal 객체 생성: 호랑이");
        System.out.println(">> Animal 객체 생성: 개");
        System.out.println("[1. 상속 & 2. 객체]");
        System.out.println("--- 호랑이 정보 ---");
        System.out.println("--- 개 정보 ---");
        System.out.println("[4. 오버라이딩]");
        tiger.makeSound();
        gold.makeSound();
        System.out.println();
        System.out.println("[3. 오버로딩]");
        tiger.eat();
        tiger.eat("생고기");
        tiger.eat("익힌고기");
        gold.eat();
        gold.eat("개껌");
        gold.eat(500);
    }
}