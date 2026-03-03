package data2;

public class Test05비만판정기 {
	public static void main(String [] args) {
		//BMI 수치 계산 하고 과체중 여부 판정하는 프로그램 만들기
		// 180cm, 체중 80kg 인 사람의 BMI수치를 구하여 출력하고 과체중을 판정하여 출력
		// 저체중 18.5 미만, 정상 18.5~22.9, 과체중 23~24.9 비만 25이상
		//1번문제 : 키와 몸무게로 BMI 수치 구하기
		//2번문제 : BMI 수치로 과체중 판정하기
		//1번풀이
		double cm = 180;
		double kg = 80;
		
		//double bmi =kg / 키제곱;
		//double bmi = kg / ((cm / 100))* (cm/100)); // 되긴되는코드
		double m = cm / 100;
		double bmi = kg /(m*m); //괄호를 빼고 싶으면 kg/m/m와 같이 써야함. 
		
		System.out.println(bmi);
		//2번풀이
		//double over = bmi의 값이 23~24.9 사이인가? [의사코드 - 코드가 되기 직전의 한글]
		boolean over = bmi >=23 && bmi<=24.9;
		System.out.println(over);
		
		
/*내가푼것
 * 		int height = 180;
		int weight = 80;
		double BMI = weight / (height/100.0)*(height/100.0);
		
		boolean  lowB = BMI <18.5;
		boolean normal = 18.5<= BMI && BMI <=22.9;
		boolean overweight = 23 <=BMI && BMI <=24.9;
		boolean obesity = 25<= BMI;
		
		System.out.println(BMI);
		System.out.println(overweight); */
	}

}
