package ex08.sec01.exam03;

public class Librarian {
    LibraryMaterial material;

    Librarian(LibraryMaterial material) {
        this.material = material;
    }

    public void processRegistration() {
        material.registerMaterial();
    }

    public void processLoan() {
        material.loanMaterial();
    }
}