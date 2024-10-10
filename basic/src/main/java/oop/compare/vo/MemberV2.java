package oop.compare.vo;

import java.util.Objects;

public class MemberV2 {

    private int memberId;
    private String memberName;
    private String email;

    public MemberV2(int memberId, String memberName, String email) {
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
        MemberV2 memberV2 = (MemberV2) o;
        return memberId == memberV2.memberId
                && Objects.equals(memberName, memberV2.memberName)
                && Objects.equals(email, memberV2.email);
    }

}
