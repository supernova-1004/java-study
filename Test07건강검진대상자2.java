package data2;

public class Test07건강검진대상자2 {
	public static void main(String [] args) {
		//건강검진 대상자 조건 
		//1. 30세 이상 2.짝수년도 출생자 + 짝수년도에 검진  3. 홀수년도 출생자 + 홀수년도에 검진
		//출생년도와 현재년도가 주어질 때, 건강검진 대상자인지 판정해서 출력. -1998년생은 대상자 아님(false) 97년생은 2025년일 경우 대상자(true)
		int birthYear = 1996;
		int presentYear = 2026;
		boolean sj = presentYear%2 == birthYear%2; 

		boolean age = presentYear - birthYear + 1  >=30 && sj;
		
		System.out.println(age);

	}

}
