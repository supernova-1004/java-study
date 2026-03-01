package gemini;

public class Test05Delivery {
	public static void main(String[] args) {
		int deliFee = 3000;
		int distance = 5;
		String day = "일";
		boolean hasCoupon = true;
		
		int totalPrice = deliFee;
		
		if(distance>=3) {
			totalPrice = totalPrice + 1000;
			System.out.println("거리할증:1000원");
			}
		if(day.equals("토")||day.equals("일")) {
			totalPrice = totalPrice -500;
			System.out.println("주말할인:500원");
			}
		if(hasCoupon) {
			totalPrice = (int)(totalPrice * 0.9);
			System.out.println("쿠폰할인 10% 적용");
			
		System.out.println("최종 배달비:"+totalPrice+"원");
		
		}
	
		
		
		
	} 

}
