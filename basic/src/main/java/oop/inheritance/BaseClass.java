package oop.inheritance;

public class BaseClass {

    private String uniqueName = "BaseClass";

    public String name = "BaseClass";
    protected String nickname = "super";

    public void introduce() {
        System.out.printf("name = %s, nickname = %s\n", name, nickname);
    }

    public void getUniqueName() {
        System.out.println("uniqueName = " + uniqueName);
    }

}
