package oop.specification.encapsulation;

public class Student {

    // 외부에서 값을 직접 수정할 수 있음
//    public String name;
//    public int age;
//    public String schoolName;
//    public int grade;

    // 은닉화
    private String name;
    private int age;
    private String schoolName;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
