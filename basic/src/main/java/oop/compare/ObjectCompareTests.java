package oop.compare;

import oop.compare.vo.MemberV1;
import oop.compare.vo.MemberV2;
import oop.compare.vo.MemberV3;

public class ObjectCompareTests {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }

    // 객체 값을 비교 1
    @SuppressWarnings("all")
    static void test1() {

        System.out.println("ObjectCompareTests.test1");

        MemberV1 member1 = new MemberV1(1, "홍길동", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "홍길동", "admin@example.com");

        int member1Id = member1.getMemberId();
        int member2Id = member2.getMemberId();

        System.out.println("result1 = " + (member1Id == member2Id));

        String member1Name = member1.getMemberName(); // 홍길동
        String newMemberName = new String("홍길동");

        boolean result2 = member1Name == newMemberName;

        System.out.println("result2 = " + result2);

    }

    static void test2() {

        System.out.println("ObjectCompareTests.test2");

        MemberV1 member1 = new MemberV1(1, "홍길동", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "홍길동", "admin@example.com");

        boolean result1 = member1 == member2;

        System.out.println("result1 = " + result1);

        MemberV1 member3 = member1;

        boolean result2 = member3 == member1; // true
        System.out.println("result2 = " + result2);

    }

    static void test3() {

        System.out.println("ObjectCompareTests.test3");

        MemberV2 member1 = new MemberV2(1, "홍길동", "admin@example.com");
        MemberV2 member2 = new MemberV2(1, "홍길동", "admin@example.com");
        MemberV1 member3 = new MemberV1(1, "홍길동", "admin@example.com");

        boolean equals1 = member1.equals(member2);
        boolean equals2 = member1.equals(
                new MemberV1(1, "홍길동", "admin@example.com")
        );
        System.out.println("equals = " + equals1);
        System.out.println("equals = " + equals2);

    }

    static void test4() {

        System.out.println("ObjectCompareTests.test4");

        MemberV3 member1 = new MemberV3(1, "홍길동", "admin@example.com");
        MemberV3 member2 = new MemberV3(2, "김길동", "admin@example.com");

        boolean equals1 = member1.equals(member2);

        System.out.println("equals = " + equals1);

    }

}
