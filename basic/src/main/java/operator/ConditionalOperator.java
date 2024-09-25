package operator;

public class ConditionalOperator {

    public static void main(String[] args) {

        // # 조건 연산자

        // 조건 ? 참일때 : 거짓일때;
        boolean isFinishedWork = true;

        String canIgoHome = isFinishedWork
                ? "Yes!"
                : "No";


        System.out.println("canIgoHome = " + canIgoHome); // ?

        int remainedWork = 10;
        String couldIGoHome = remainedWork < 10
                ? "Yes"
                : "No";

        System.out.println("couldIGoHome = " + couldIGoHome); // ?

    }

}
