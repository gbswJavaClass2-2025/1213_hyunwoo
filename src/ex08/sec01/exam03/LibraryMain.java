package ex08.sec01.exam03;

public class LibraryMain {
    public static void main(String[] args) {
        System.out.println("----- 도서관 자료 관리 시스템 시작 -----");

        Book b1 = new Book("책", "홍길동");
        Book b2 = new Book("자료구조", "이순신", 2022);
        Magazine m1 = new Magazine("잡지", "동길홍", 58);

        Librarian lib1 = new Librarian(b1);
        Librarian lib2 = new Librarian(m1);

        lib1.processRegistration();
        lib1.processLoan();

        lib2.processRegistration();
        lib2.processLoan();

        System.out.println("----- 시스템 종료 -----");
    }
}