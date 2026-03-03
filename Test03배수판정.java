package data2;

public class Test03배수판정 {
	public static void main(String[] args) {
		//배수 판정?
		//- 2의배수(짝수), 3의배수 4의배수, ...
		//- 나머지 연산으로 판정
		
		int number =0;
		//boolean two = number룰 2로 나눈 나머지가 0인가요?
		boolean two = number % 2 ==0; //2의배수 판정식
		System.out.println("2의배수판정" + two);
		
		boolean three = number % 3 == 0; // 3의배수 판정식 
		System.out.println("3의배수판정" + three);
		
		boolean four = number % 4 ==0; // 4의 배수 판정식
		System.out.println("4의배수판정" + four);
		
		boolean odd = number % 2 == 1;
		//boolean odd = number % 2 !=0  -2로 나눈 나머지가 0이 아니면 홀수!
		//boolean odd = number % 2 ==1  2로 나눈 나머지가 1이면 홀수!
		//boolean odd =!two;  two가 true인 경우의 반대면 홀수!(느낌표가 앞에 붙으면 반대, 부정의 의미)
		System.out.println("홀수판정" + odd);
	}

}
