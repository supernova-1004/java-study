package gemini;

public class Test02관리자페이지접속기 {
	public static void main(String [] args) {

				//사용자의 아이디(id)는 **"admin"**이고, 비밀번호(pw)는 1234입니다. (변수로 선언하세요)
				//사용자의 현재 로그인 상태를 나타내는 boolean isLoggedIn 변수를 만드세요.
				//다음 두 조건이 모두 참일 때만 **"관리자 페이지에 접속합니다."**를 출력하세요.
				//아이디가 "admin"이고 비밀번호가 1234여야 함 (문자열 비교는 id.equals("admin") 사용)
				//isLoggedIn 상태가 true여야 함
				//만약 하나라도 조건이 맞지 않으면 **"접속 권한이 없습니다."**를 출력하세요.
		String id = "admin";
		int pw = 1234;
		boolean isLoggedIn = true;
		if (id.equals("admin") && pw ==1234) {
			System.out.println("관리자 페이지에 접속합니다.");
		} else {System.out.println("접속 권한이 없습니다.");
		
		}
				
	}

}


정답
package gemini;

public class Test02AdminAccess {
    public static void main(String[] args) {
        // 1. 변수 설정 (입력)
        String id = "admin";
        int pw = 1234;
        boolean isLoggedIn = true; // 로그인 상태 여부

        // 2. 권한 확인 (처리)
        // 아이디와 비밀번호가 맞아야 함 AND(&&) 로그인 상태여야 함
        if (id.equals("admin") && pw == 1234 && isLoggedIn) {
            // 3. 결과 출력
            System.out.println("관리자 페이지에 접속합니다.");
        } else {
            System.out.println("접속 권한이 없습니다.");
        }
    }
}