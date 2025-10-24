package ex03.sec01.exam01;

public class Animal {
    String species;
    public Animal(String species) {
        this.species = species;
    }
    public Animal() {
    }
    public void eat() {
        System.out.println(species + ": " + species + "이/가 일반적인 방식으로 먹이를 먹습니다.");
    }
    public void eat(String prey) {
        System.out.println(species + ": " + species + "이/가 " + prey + "을/를 맛있게 먹습니다.");
    }
    public void makeSound() {
        System.out.println(species + "소리: " + species + "이/가 알 수 없는 소리를 냅니다.");
    }
}
