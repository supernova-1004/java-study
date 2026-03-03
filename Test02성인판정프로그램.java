package data2;

public class Test02성인판정프로그램 {

	public static void main(String[] args) {
		//입력
		int user = 20260303;
		
		//처리
		//-나이; 태어난 해부터 현재까지 거쳐온 연도 수(현재연도 - 태생 + 1 )
		//-나이: 태어난해부터 올해 사이의 숫자개수 = 구간(a~b) 내 숫자개수
		// = b-a+1
		int year = user / 10000;
		int age = 2026 - year +1;
		boolean adult = age >= 20;
		
		//결과
		System.out.println(age);
		System.out.println(adult);
		
		}

	}