package ex07.sec01.exam01;

public class PremiumTicket extends FlightTicket {
    String seatClass;
    int loungeFee;
    String mealRequest;

    PremiumTicket(String flight, String seat, String name, String seatClass, int loungeFee) {
        super(flight, seat, name);
        this.seatClass = seatClass;
        this.loungeFee = loungeFee;
    }

    public void reserveSeat() {
        System.out.println(flight + " (프리미엄): [예약] 일반 좌석 " + seat + " 이/가 배정되었습니다.");
    }

    public void reserveSeat(String procedure) {
        System.out.println(flight + " (프리미엄): [예약] 일반 좌석 " + seat + " 이/가 배정되었습니다. (수속 " + procedure + ")");
    }

    public void reserveSeat(String procedure, String mealRequest) {
        this.mealRequest = mealRequest;
        System.out.println(flight + " (프리미엄): [예약] 비즈니스 좌석 " + seat + " 이/가 배정되었습니다. (요청: " + mealRequest + ")");
    }

    @Override
    public void information(int price) {
        System.out.println("프리미엄 항공권: 항공편: " + flight + " | 탑승객: " + name +
                " | 좌석: " + seat + " | 기본 운임: " + price +
                " 원 | 클래스: **" + seatClass + "** | 라운지 이용료: " + loungeFee + " 원");
    }
}
