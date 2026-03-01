package gemini;

public class Test03Cinema {
    public static void main(String[] args) {
        // [1. 입력 정보 설정]
        int ticketPrice = 15000;      // 기본 티켓 가격
        int age = 15;                 // 테스트용 나이 (19세 미만 할인 대상)
        String day = "월";            // 테스트용 요일 (월~목 할인 대상)
        boolean isMorning = true;     // 테스트용 조조 여부 (true면 할인)

        // [2. 처리 - 최종 결제 금액 계산]
        // 계산하기 편하게 finalPrice라는 변수에 기본 가격을 먼저 담아둬요.
        int finalPrice = ticketPrice;

        // 규칙 1: 조조 할인 (isMorning이 true이면 2,000원 할인)
        if (isMorning) {
            finalPrice = finalPrice - 2000;
            System.out.println("조조 할인 적용: -2,000원");
        }

        // 규칙 2: 평일 할인 (월, 화, 수, 목이면 1,000원 할인)
        if (day.equals("월") || day.equals("화") || day.equals("수") || day.equals("목")) {
            finalPrice = finalPrice - 1000;
            System.out.println("평일 할인 적용: -1,000원");
        }

        // 규칙 3: 나이 제한 (19세 미만이면 최종 금액에서 20% 더 할인)
        // 주의! 위에서 이미 할인된 금액(finalPrice)에서 20%를 더 깎는 거예요.
        if (age < 19) {
            // (int)를 붙여서 소수점을 없애주는 게 중요해! (형변환)
            finalPrice = (int)(finalPrice * 0.8);
            System.out.println("청소년 추가 할인 적용: 20% 할인");
        }

        // [3. 출력]
        System.out.println("---------------------------");
        System.out.println("설정된 나이: " + age + "세");
        System.out.println("설정된 요일: " + day + "요일");
        System.out.println("조조 영화 여부: " + isMorning);
        System.out.println("최종 결제 금액: " + finalPrice + "원");
        System.out.println("---------------------------");
    }
}