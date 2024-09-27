package methods;

public class Method5 {

    public static void main(String[] args) {

//        int amount = buyIceCream(1000);

        int amount = buyIceCream(500);

        System.out.println("아이스크림 구매 갯수 : " + amount);

    }

    static int buyIceCream(int money) {

        int PRICE = 500;
        int amount = money / PRICE;

        if ( amount == 0 ) {
            System.out.println("돈이나 제대로 주세요");
            return 0;
        }

        System.out.println("아이스크림 1개라도 구매 완료!");

        return amount;
//        System.out.println("아이스크림 구매 완료!");
    }


}
