package ex08.sec01.exam03;

public class Book extends LibraryMaterial {
    int publishedYear;

    Book(String title, String author) {
        super(title, author);
        this.publishedYear = 2024;
    }

    Book(String title, String author, int publishedYear) {
        super(title, author);
        this.publishedYear = publishedYear;
    }

    @Override
    public void registerMaterial() {
        System.out.println("[도서 등록] \"" + title + "\" (" + author + ") — ISBN 등록 완료");
    }

    @Override
    public void loanMaterial() {
        System.out.println("[도서 대여] \"" + title + "\" 도서가 대여되었습니다.");
    }
}