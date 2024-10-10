package oop.toStr;

public class TeamTests {

    public static void main(String[] args) {

        Team team = new Team();
        String teamString = team.toString();

        System.out.println("teamString = " + teamString); // teamString = Team{teamName='TeamA', rank=1}

    }

}
