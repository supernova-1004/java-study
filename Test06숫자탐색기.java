package data2;

public class Test06숫자탐색기 {
	public static void main(String [] args) {
		//1~99사이의 어떤 숫자 한개 'number' 변수 저장. 이 숫자에 7이 포함 되어 있는지 판정하여 출력하는 프로그램 만들기
		// 7이 포함 되있다면 true 없으면 false 출력
		//입력		
		int number = 51;
		
		//처리
		int ten = number / 10; //number의 10의자리;
		int one = number %10; //number의 10의자리;
		//내가한거 boolean hasSeven = number/10==7 || number%10==7;  
		boolean seven = ten ==7 || one == 7;
		//출력
		System.out.println(seven); 
	}

}
