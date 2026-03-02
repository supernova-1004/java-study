package gemini;

public class Test08FlightBooking {
    public static void main(String[] args) {
        // [1. 입력 정보 설정]
        int baseFare = 300000;         // 기본 편도 운임 (30만원)
        String seatClass = "Business"; // 좌석 등급 ("Economy", "Business", "First")
        boolean isInfant = false;      // 24개월 미만 영유아 여부
        boolean isMerit = true;        // 국가 유공자 여부

        // [2. 처리 - 최종 결제 금액 계산]
        // 계산을 위해 double 타입을 사용하면 소수점 할인이 정확해져요!
        double finalPrice = baseFare;

        System.out.println("--- [항공권 예약 정보] ---");
        System.out.println("기본 운임: " + baseFare + "원");
        System.out.println("좌석 등급: " + seatClass);

        // 규칙 1: 좌석 등급별 할증 (기본 운임에서 먼저 계산)
        if (seatClass.equals("Business")) {
            finalPrice *= 1.5; // 50% 할증
            System.out.println("> 비즈니스석 할증 적용 (x1.5)");
        } else if (seatClass.equals("First")) {
            finalPrice *= 2.0; // 100% 할증
            System.out.println("> 일등석 할증 적용 (x2.0)");
        } else {
            System.out.println("> 일반석 (추가 요금 없음)");
        }

        // 규칙 2: 대상별 할인 (할증된 금액에서 추가 계산)
        // 유공자와 영유아 할인이 중복되지 않도록 else if로 처리해봐요!
        if (isInfant) {
            finalPrice *= 0.1; // 90% 파격 할인! (금액의 10%만 내기)
            System.out.println("> 영유아 할인 적용 (90% OFF)");
        } else if (isMerit) {
            finalPrice *= 0.7; // 30% 할인 (금액의 70%만 내기)
            System.out.println("> 국가 유공자 할인 적용 (30% OFF)");
        }

        // [3. 출력 - 최종 금액은 다시 정수로!]
        int result = (int) finalPrice;

        System.out.println("-------------------------");
        System.out.println("최종 결제 금액: " + result + "원");
        System.out.println("-------------------------");
    }
}