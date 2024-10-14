package collection;

public class ArrayPractice {

    public static void main(String[] args) {

        // 정수 배열
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        // ...

        // 자료구조 - 배열(Array)
        int[] integerArray1 = new int[5];

        integerArray1[0] = 1;
        integerArray1[1] = 2;
        integerArray1[2] = 3;
        integerArray1[3] = 4;
        integerArray1[4] = 5;

        // 출력
        System.out.println("integerArray1[0] = " + integerArray1[0]);
        System.out.println("integerArray1[1] = " + integerArray1[1]);
        System.out.println("integerArray1[2] = " + integerArray1[2]);
        System.out.println("integerArray1[3] = " + integerArray1[3]);
        System.out.println("integerArray1[4] = " + integerArray1[4]);

        // 반복문
        for ( int i = 0; i < 5; i++ ) {
            System.out.printf("integerArray1[%d] = %d\n",i , integerArray1[0]);
        }

        // 배열 만드는 여러 방법
        int[] integerArray2 = { 1, 2, 3, 4, 5 };

    }


}
