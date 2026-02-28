package gemini;

public class Test01놀이공원입장료계산기 {
	public static void main(String [] args) {
		//[요구사항] 기본 입장료는 30,000원입니다. 나이(age)와 유료 회원 여부(isMember) 변수를 만드세요. 
		//다음 조건 중 하나라도 만족하면 입장료를 50% 할인(15,000원) 합니다.
		//나이가 8세 미만이거나 65세 이상인 경우,  유료 회원인 경우 (isMember가 true)최종 결제 금액을 출력하세요
		
		//입력
		int etFee = 30000; //입장료
		int count = 0
		
		//처리
		int totalFee = etFee * count;

		int isMember = 0;
		if (isMember) {int discountFee = etFee / 2};
				
		
		int age = 0;
		if (age < 8 || age > 65) {int discountFee};
		
		//출력
		System.out.println(totalFee);
	}

}


정답
package gemini;

public class Test01AmusementPark {
    public static void main(String[] args) {
        // [입력]
        int entryFee = 30000; // 기본 입장료
        int age = 70;         // 테스트용 나이 (예: 70세)
        boolean isMember = false; // 테스트용 회원 여부 (예: 비회원)

        // [처리]
        // 최종 결제 금액을 담을 변수를 미리 만들어둡니다. (기본료로 초기화)
        int finalPrice = entryFee;

        // 조건: (나이가 8세 미만 OR 65세 이상) OR (유료 회원인 경우)
        // 이 중 하나라도 true면 할인 대상입니다.
        if ((age < 8 || age >= 65) || isMember) {
            // 할인 적용: 50% 할인
            finalPrice = entryFee / 2;
            System.out.println("할인 대상자입니다. (50% 할인 적용)");
        } else {
            System.out.println("일반 대상자입니다. (할인 없음)");
        }

        // [출력]
        System.out.println("최종 결제 금액: " + finalPrice + "원");
    }
}