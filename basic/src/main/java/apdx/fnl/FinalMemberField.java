package apdx.fnl;

public class FinalMemberField {

    private String field1;
    private final String field2 = "Hello!";

    // Required Argument
    private final String field3;

    // Required Arguments Constructor
    public FinalMemberField(String field3) {
        this.field3 = field3;
    }

}
