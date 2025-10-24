package ex01.sec01.exam01;

public class People {
    int age = 30;
    String name = "홍길동";
    String hometown = "율도국";
    String gender = "남자";
    People(int age, String name, String hometown, String gender){
        this.age = age;
        this.name = name;
        this.hometown = hometown;
        this.gender = gender;
    }
    public void PeopleInfo() {
        System.out.println("나이 : " + this.age);
        System.out.println("이름 : " + this.name);
        System.out.println("고향 : " + this.hometown);
        System.out.println("설별 : " + this.gender);
    }
}
