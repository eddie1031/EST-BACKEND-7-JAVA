package oop.toStr;

public class Team {

    private String teamName = "TeamA";
    private int rank = 1;

    /*
    Object.toString()은
    인스턴스_클래스이름@해시코드값 으로 객체를 문자열화 수행

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
     */

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", rank=" + rank +
                '}';
    }

}
