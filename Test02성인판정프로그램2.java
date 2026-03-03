package data2;

public class Test02성인판정프로그램2 {

	public static void main(String[] args) {
		/*사용자의 생년월일이 다음과 같이 주어져 있습니다.
int user = 20260303;
이 사용자의 생년월일에서 연도만 추출하여 나이를 계산하고 성인지 판정하여 출력
나이 출력
성인 여부 판정 후 출력 */
		int user = 20100303;
		int year = user / 10000; //this year =26으로 설정하는게 좋음 
		int age = 2026 - year;
		boolean adult = age >=20;
				 
		System.out.println(age);
		System.out.println("성인인가요"+adult);
		
		if (age <20 && age>15) {
			System.out.println("청소년입니다");} else if(age<=15) {
				System.out.println("응애입니다");
			}
		}

	}