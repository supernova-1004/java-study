package gemini;

public class Test09MartSystem {
	public static void main(String [] args) {
		int totalPurchase = 150000;
		String membership = "VIP";
		boolean isFirstVisit = true;
		double finalPrice = totalPurchase;
		
				
		if(membership.equals("VIP")) {finalPrice *= 0.85;
				System.out.println("VIP할인 15% 적용");}
		else if (membership.equals("Gold")) {finalPrice *=0.9;
		System.out.println("Gold할인 10% 적용");}
		else if (membership.equals("Silver")) {finalPrice *=0.95;
		System.out.println("Silver할인 5% 적용");}
		
		if(isFirstVisit) {finalPrice -=5000;
		System.out.println("첫 방문할인 -5000원");}
		if(finalPrice <=0) {finalPrice = 0;}
		
		double savedPoint = finalPrice * 0.02;
		
		System.out.println("최종결제금액:" + (int)(finalPrice) + "원");
		System.out.println("포인트 적립:" + (int)(savedPoint) + "Point");
		
		
			
		
		
	}
}	
	
