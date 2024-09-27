package methods;

public class Method6 {

    public static void main(String[] args) {

        int result1 = sum(1, 1);
        int result2 = sum(1, 1, 1);
        double result3 = sum(1, 1.0, 1);
        int result4 = sum(1, 1, 1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

    }

    static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    static int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    static double sum(int a, double b, int c) {
        return a + b + c;
    }


}
