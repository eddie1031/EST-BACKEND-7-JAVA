package exceptions.example.S1;

import exceptions.example.S1.objs.ForeignPeople;
import exceptions.example.S1.objs.LocalPeople;

public class Situation {

    public static void main(String[] args) {
        scene1();
        scene2();
    }

    static void scene1() {

        LocalPeople koreanPeople = new LocalPeople();
        ForeignPeople american = new ForeignPeople();

        koreanPeople.communicate(american, "안녕하세요!");

    }

    static void scene2() {

        LocalPeople koreanPeople = new LocalPeople(true);
        ForeignPeople american = new ForeignPeople(true);

        koreanPeople.communicate(american, "안녕하세요!");

    }

}
