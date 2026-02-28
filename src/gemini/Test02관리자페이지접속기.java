package gemini;

public class Test02관리자페이지접속기 {
    public static void main(String[] args) {
        
        // [변수 설정] 
        // 자기가 만든 변수랑 내가 제안한 변수를 하나로 합쳤어!
        String id = "admin";
        int pw = 1234;
        boolean isLoggedIn = true;
        
        // 1. 자기의 원래 논리 (아이디와 비밀번호만 체크)
        System.out.println("--- 1. 아이디/비번 체크 결과 ---");
        if (id.equals("admin") && pw == 1234) {
            System.out.println("기본 정보가 일치합니다.");
        } else {
            System.out.println("정보가 일치하지 않습니다.");
        }
        
        System.out.println(); // 줄바꿈

        // 2. 로그인 상태까지 포함한 최종 논리 (실제 관리자 접속용)
        System.out.println("--- 2. 최종 관리자 권한 체크 결과 ---");
        if (id.equals("admin") && pw == 1234 && isLoggedIn) {
            System.out.println("관리자 페이지에 접속합니다.");
        } else {
            System.out.println("접속 권한이 없습니다. (로그인 상태를 확인하세요)");
        }
    }
}