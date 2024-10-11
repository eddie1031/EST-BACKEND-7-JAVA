package generic.limit.example.S1.tools;

import generic.limit.example.S1.Portable;
import generic.limit.example.S1.Tool;

public class Hammer extends Tool implements Portable {

    private final String name = "HAMMER";

    @Override
    public void portable() {
        System.out.println("저는 가지고 다닐수 있습니다!");
    }

    @Override
    public String getName() {
        return this.name;
    }

}
