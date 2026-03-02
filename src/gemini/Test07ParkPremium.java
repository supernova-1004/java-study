package gemini;

public class Test07ParkPremium {
	public static void main(String [] args) {
		int freepass = 50000;
		int age = 67;
		int entryTime = 18;
		boolean isMember = true;
		int finalFee = freepass;
		
		System.out.println("자유이용권 50000원");
		
		if(entryTime>16) {
			finalFee = finalFee - 10000;
			System.out.println("야간할인: 10000원");
			}
		if(age < 13 || age >= 65) {
			finalFee = (int)(finalFee *0.5);
			System.out.println("노약자할인: 50%적용");
		} else if(age >= 13 && age<=18 ) {
			finalFee = (int)(finalFee *0.8);
			System.out.println("청소년할인: 20%적용");
		}
		if (isMember) {
			finalFee=finalFee - 5000;
			System.out.println("멤버십할인 5000원");
		}
		if (finalFee <0) {finalFee = 0;}
		
		
		
		System.out.println("===============");
		System.out.println("최종 티켓 가격:"+finalFee+"원");
		System.out.println("===============");
		
	}

}
