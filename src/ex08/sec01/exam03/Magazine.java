package ex08.sec01.exam03;

public class Magazine extends LibraryMaterial {
    int issueNumber;

    Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void registerMaterial() {
        System.out.println("[잡지 등록] \"" + title + "\" (" + author + ") — 정기 간행물 번호 등록 완료");
    }

    @Override
    public void loanMaterial() {
        System.out.println("[잡지 대여] \"" + title + "\" 최신호는 대여가 불가합니다.");
    }
}