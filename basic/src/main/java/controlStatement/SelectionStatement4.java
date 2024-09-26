package controlStatement;

public class SelectionStatement4 {

    public static void main(String[] args) {
        // ### switch - case
        int coin = 1;

        // break문 없는 switch 문
        switch (coin) {
            case 1:
                System.out.println(100);
            case 2:
                System.out.println(200);
            case 3:
                System.out.println(300);
        }
        // 100, 200, 300

        int gold = 1;

        // break 있는 switch 문
        switch (gold) {
            case 1 :
                System.out.println(100);
                break;
            case 2 :
                System.out.println(200);
                break;
            case 3 :
                System.out.println(300);
                break;
        }

        // 100

        gold = 2;

        // 변경된 switch 문
        switch (gold) {
            case 1 -> System.out.println(100);
            case 2 -> System.out.println(200);
            case 3 -> System.out.println(300);
        }

        // 200

        // 변경된 switch 문, 명령문을 2줄 이상 사용할 때에는 코드블럭({})을 사용
        switch (gold) {
            case 1 -> {
                System.out.println(1);
                System.out.println(1);
            }
            case 5 -> System.out.println(5);
            case 10 -> {
                System.out.println(10);
            }
        }

        // 활용 1
        int number = 15;

        switch (number) {
            case 1, 15:
                number = 25;
                break;
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("홀수");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("짝수");
                break;
        }

        // 활용 2
        switch ( number ) {
            case 2,4,6,8,10 -> System.out.println("짝수");
            case 1,3,5,7,9 -> System.out.println("홀수");
        }

    }

}
