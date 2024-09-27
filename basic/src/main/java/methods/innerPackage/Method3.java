package methods.innerPackage;

import methods.Method1;

public class Method3 {

    public static void main(String[] args) {

//        Method2.printTest();
        Method1.printTest(); // public

        System.out.println();

        Method1.printTest4();
        /*
        public
        default(Package)
        private
        Method2.printTest
         */

    }

}
