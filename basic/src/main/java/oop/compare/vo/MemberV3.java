package oop.compare.vo;

import java.util.Objects;

public class MemberV3 {

    private int memberId;
    private String memberName;
    private String email;

    public MemberV3(int memberId, String memberName, String email) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberV3 memberV2 = (MemberV3) o;
        return this.email.equals(memberV2.email);
    }

}
