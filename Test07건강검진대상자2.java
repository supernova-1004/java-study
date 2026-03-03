package data2;

public class Test07건강검진대상자2 {
	public static void main(String [] args) {
		//건강검진 대상자 조건 
		//1. 30세 이상 2.짝수년도 출생자 + 짝수년도에 검진  3. 홀수년도 출생자 + 홀수년도에 검진
		//출생년도와 현재년도가 주어질 때, 건강검진 대상자인지 판정해서 출력. -1998년생은 대상자 아님(false) 97년생은 2025년일 경우 대상자(true)
		
		//입력
		int birth = 1995;
		int year = 2026;
		
		int age =  year - birth +1;
		
				
		//계산과정을 생략하고 결과만 가지고 조합
		boolean over30 = age >=30; // 결과먼저 시작
		boolean birthEven = birth %2 ==0;
		boolean birthOdd = !birthEven;
		boolean yearEven = year % 2== 0;
		boolean yearOdd = !yearEven;
		
		//boolean result = 30세 이상 && 나머지조건;
		//boolean result = 30세 이상 && ((짝수년도생 &&짝수년도) || (홀수년도생 && 홀수년도));
		boolean result = over30 && ((birthEven && yearEven) || (birthOdd && yearOdd));
		
		//출력
		System.out.println(result);

	}

}
