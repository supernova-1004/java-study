package gemini;

public class Test01놀이공원입장료계산기 {
    public static void main(String[] args) {
        // [입력]
        int entryFee = 30000;      // 기본 입장료
        int age = 15;             // 테스트용 나이 (자기 마음대로 바꿔봐!)
        boolean isMember = true;  // 테스트용 회원 여부 (true 또는 false)

        // [처리]
        // 최종 결제 금액을 담을 변수를 미리 만들어둡니다.
        int finalPrice = entryFee;

        // 1. 자기의 원래 논리를 다듬어서 합쳤어!
        // (나이가 8세 미만 혹은 65세 이상) 이거나 (유료 회원인 경우)
        if ((age < 8 || age >= 65) || isMember) {
            // 할인 적용: 50% 할인
            finalPrice = entryFee / 2;
            System.out.println("축하합니다! 할인 대상자입니다. (50% 할인 적용)");
        } else {
            System.out.println("일반 대상자입니다. (할인 없음)");
        }

        // 2. 출력
        System.out.println("나이: " + age + "세");
        System.out.println("회원 여부: " + isMember);
        System.out.println("최종 결제 금액: " + finalPrice + "원");
    }
}