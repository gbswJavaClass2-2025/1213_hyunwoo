package ex07.sec01.exam01;

public class BookingSystem {
    public static void main(String[] args) {
        System.out.println("----- 비행기 예매 시스템 실습 시작 -----");

        FlightTicket ft1 = new FlightTicket("KE001", "45A", "박민준");
        PremiumTicket pt1 = new PremiumTicket("OZ202", "01C", "최서연", "비즈니스", 50000);

        System.out.println("------------------------------------");
        System.out.println("[좌석 예약]");
        System.out.print(ft1.flight + " (일반):");
        ft1.seat();
        System.out.print(ft1.flight + " (일반):");
        ft1.seat("완료");

        System.out.print(pt1.flight + " (프리미엄):");
        pt1.reserveSeat();
        System.out.print(pt1.flight + " (프리미엄):");
        pt1.reserveSeat("미완료");
        pt1.seat = "02A";
        System.out.print(pt1.flight + " (프리미엄):");
        pt1.reserveSeat("완료", "채식 기내식 요청");

        System.out.println("------------------------------------");
        System.out.println("[예약 상세 정보]");
        ft1.information(300000);
        pt1.information(1500000);

        System.out.println("----- 실습 종료 -----");
    }
}