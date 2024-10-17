import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 문자열 공백제거, 문자열 분리(Split)2
        // 입력 받는 것 1
        // Map 활용법 3
        // 프로젝트 템플릿 4

        // Scanner <- 표준 입력
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine(); // "인사 " " 인사" " 인사 "

        data = data.trim(); // 앞뒤 공백을 모두  삭제
        // " 인사"  "인사 " " 인사 "

        System.out.println("data = " + data);
        System.out.println("data.length() = " + data.length());

        if ( data.equals("인사") ) {
            System.out.println("PROGRAM: 안녕하세요 여러분! 반갑습니다!");
        }

    }

}
