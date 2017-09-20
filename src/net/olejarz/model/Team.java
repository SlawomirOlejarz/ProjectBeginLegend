package net.olejarz.model;

import java.util.ArrayList;

public class Team {
    private String name;
    private int teampower;
    private ArrayList players = new ArrayList();

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public ArrayList getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeampower() {
        return teampower;
    }

    public void setTeampower(int teampower) {
        this.teampower = teampower;
    }
}
