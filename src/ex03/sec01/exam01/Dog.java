package ex03.sec01.exam01;

public class Dog extends Animal {
    String breed;

    public Dog(String breed) {
        super("개");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(breed + ": 개이/가 일반적인 방식으로 먹이를 먹습니다.");
    }

    @Override
    public void eat(String food) {
        System.out.println(breed + ": 개이/가 " + food + "을/를 맛있게 먹습니다.");
    }

    public void eat(int energy) {
        System.out.println(breed + ": 개(" + breed + ")이/가 " + energy + " 칼로리만큼 에너지를 보충합니다.");
    }

    @Override
    public void makeSound() {
        System.out.println("소리: 멍멍!(품종: " + breed + ")");
    }
}
