package net.olejarz;

import net.olejarz.config.TeamsConfig;
import net.olejarz.model.Player;
import net.olejarz.model.Team;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Super Manager");
        TeamsConfig teamsConfig = new TeamsConfig();
//        Team[] teams = teamsConfig.getTeams();
        ArrayList<Team> teams = teamsConfig.getTeams();

        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getName());
            Team team = teams.get(i);
            ArrayList<Player> players = team.getPlayers();
            for (int j = 0; j < players.size(); j++) {
                Player player = players.get(j);
                System.out.println(player.getName());
            }
        }

//        Team stalmielec = teams[0];
//        ArrayList players = stalmielec.getPlayers();
//        for (int i = 0; i < players.size(); i++) {
//            Player player =(Player) players.get(i);
//            System.out.println(player.getName());
//        }
//        Team legiawarszawa = teams[1];
//        ArrayList players2 = legiawarszawa.getPlayers();
//        for (int i = 0; i < players2.size(); i++) {
//            Player player =(Player) players2.get(i);
//            System.out.println(player.getName());
//        }
    }
}
