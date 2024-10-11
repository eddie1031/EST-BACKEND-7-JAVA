package generic.limit.example.S1.tools;

import generic.limit.example.S1.Installable;
import generic.limit.example.S1.Tool;

public class HugeCrowbar extends Tool implements Installable {

    private final String name = "VERY_HUGE_CROWBAR";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void installable() {
        System.out.println("저는 설치형 입니다!");
    }

}
