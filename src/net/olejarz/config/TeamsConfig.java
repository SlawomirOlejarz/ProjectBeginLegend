package net.olejarz.config;

import net.olejarz.model.Player;
import net.olejarz.model.Team;

public class TeamsConfig {
    public Team[] getTeams() {
        Team team1 = new Team();
        team1.setName("FKS STAL MIELEC");
        team1.setTeampower(100);

        Player player1 = new Player();
        player1.setName("Zlatan Ibrahimovic");
        player1.setSkill(90);

        team1.addPlayer(player1);

        Player player2 = new Player();
        player2.setName("Wayne Rooney");
        player2.setSkill(85);

        team1.addPlayer(player2);

        Team team2 = new Team();
        team2.setName("LEGIA WARSZAWA");
        team2.setTeampower(90);

        Team team3 = new Team();
        team3.setName("CRACOVIA");
        team3.setTeampower(90);

        Team team4 = new Team();
        team4.setName("SANDECJA");
        team4.setTeampower(90);

        Team[] teams;
        teams = new Team[4];
        teams[0] = team1;
        teams[1] = team2;
        teams[2] = team3;
        teams[3] = team4;


        return teams;
    }
}
