package gemini;

public class Test04Currency {
    public static void main(String[] args) {
        // 원화를 달러로 변환하는 프로그램
        int krwPrice = 9600;
        double exchangeRate = 1350.50; // 1달러당 환율 (소수점 중요!)

        // 1. 달러는 소수점 아래(센트)가 중요하므로 double을 사용해!
        double usdPrice = krwPrice / exchangeRate;

        // 2. 출력할 때 소수점 자릿수를 지정해줘요.
        System.out.println("원화 금액: " + krwPrice + "원");
        System.out.println("현재 환율: " + exchangeRate);
        
        // %.2f는 소수점 둘째 자리까지 보여달라는 뜻이야!
        System.out.printf("달러 환산 금액: $%.2f\n", usdPrice);
    }
}