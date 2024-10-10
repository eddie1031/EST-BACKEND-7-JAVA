package oop.compare.vo;

public class MemberV1 {

    private int memberId;
    private String memberName;
    private String email;

    public MemberV1(int memberId, String memberName, String email) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
