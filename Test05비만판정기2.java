package data2;

public class Test05비만판정기2 {
	public static void main(String [] args) {
		//BMI 수치 계산 하고 과체중 여부 판정하는 프로그램 만들기
		// 180cm, 체중 80kg 인 사람의 BMI수치를 구하여 출력하고 과체중을 판정하여 출력
		// 저체중 18.5 미만, 정상 18.5~22.9, 과체중 23~24.9 비만 25이상
		int height = 180;
		int weight = 80;
		double BMI = weight / (height/100.0)*(height/100.0);
		
		boolean  lowB = BMI <18.5;
		boolean normal = 18.5<= BMI && BMI <=22.9;
		boolean overweight = 23 <=BMI && BMI <=24.9;
		boolean obesity = 25<= BMI;
		
		System.out.println(BMI);
		System.out.println(overweight);
	}

}
