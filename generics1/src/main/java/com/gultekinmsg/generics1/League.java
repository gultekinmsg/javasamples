package com.gultekinmsg.generics1;

import java.util.ArrayList;

public class League<T extends Team> {
    private String name;

    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already on league.");
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to the league");
        }
    }


    public void printTeams() {
        System.out.println("Teams:");
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("Team " + (i + 1) + " is " + teams.get(i).getName());
        }
    }
}