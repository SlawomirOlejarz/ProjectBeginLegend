package net.olejarz;

import net.olejarz.config.TeamsConfig;
import net.olejarz.model.Player;
import net.olejarz.model.Team;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Super Manager");
        TeamsConfig teamsConfig = new TeamsConfig();
        Team[] teams = teamsConfig.getTeams();


        if (teams[0].getTeampower() > teams[1].getTeampower()) {
            System.out.println("Wygrywa " + teams[0].getName() + " 5:1");
        } else {
            System.out.println("Wygrywa " + teams[1].getName() + " 5:1");
        }
        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i].getName());
        }

        Team stalmielec = teams[0];
        ArrayList players = stalmielec.getPlayers();
        for (int i = 0; i < players.size(); i++) {
            Player player =(Player) players.get(i);
            System.out.println(player.getName());
        }

    }
}
