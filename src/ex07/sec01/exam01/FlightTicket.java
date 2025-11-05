package ex07.sec01.exam01;

public class FlightTicket {
    String flight;
    String seat;
    String name;

    FlightTicket(String flight, String seat, String name) {
        this.flight = flight;
        this.seat = seat;
        this.name = name;
        System.out.println(">>FlightTicket 객체 생성: " + flight + ", 탑승객: " + name);
    }
    public void seat() {
        System.out.println(" [예약] 일반 좌석 " + seat + " 이/가 배정되었습니다.");
    }
    public void seat(String Procedure) {
        System.out.println(" [예약] 일반 좌석 " + seat + " 이/가 배정되었습니다. (탐승 수속 " + Procedure + ")");
    }
    public void information(int price) {
        System.out.println("일반 항공권: 항공편: " + flight + " | 탑승객: " + name + " | 좌석: " + seat + " | 기본 운임: " + price + " 원");
    }
}
