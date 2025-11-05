package ex08.sec01.exam01;

public abstract class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void work();
}