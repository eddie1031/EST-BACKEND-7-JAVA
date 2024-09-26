package controlStatement;

public class Break1 {

    public static void main(String[] args) {

        // # 제어문
        // ## 분기문
        // ### break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Count " + i);
        }
        //Count 0
        //Count 1
        //Count 2
        //Count 3
        //Count 4

        // 중첩 반복문에서 break를 사용하면 해당하는 반복문만 종료
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ( j == 2 ) {
                    break;
                }
                System.out.println("j = " + j);
            }
            System.out.println();
        }
//        j = 0
//        j = 1
//
//        j = 0
//        j = 1
//
//        j = 0
//        j = 1
//
//        j = 0
//        j = 1
//
//        j = 0
//        j = 1

    }

}
