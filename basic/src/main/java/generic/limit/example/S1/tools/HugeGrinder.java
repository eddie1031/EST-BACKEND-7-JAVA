package generic.limit.example.S1.tools;

import generic.limit.example.S1.Installable;
import generic.limit.example.S1.Tool;

public class HugeGrinder extends Tool implements Installable {

    private String name = "HUGE_GRINDER";

    @Override
    public void installable() {
        System.out.println("저는 설치형 입니다.");
    }

    @Override
    public String getName() {
        return name;
    }

}
