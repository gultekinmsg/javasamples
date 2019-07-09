package com.gultekinmsg.generics1;

public class Main {

    public static void main(String[] args) {

        //   ArrayList<Team> teams;
        //   Collections.sort(teams);
        Team manisa =new Team("manisa");
        Team iibf =new Team("iibf");
        Team gs =new Team("gs");

        League lig1 = new League<>("lig1");

        lig1.addTeam(manisa);
        lig1.addTeam(manisa);
        lig1.addTeam(iibf);
        lig1.addTeam(gs);

        lig1.printTeams();












    }
}
