package ex08.sec01.exam03;

public abstract class LibraryMaterial {
    String title;
    String author;

    LibraryMaterial(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void registerMaterial();
    public abstract void loanMaterial();
}