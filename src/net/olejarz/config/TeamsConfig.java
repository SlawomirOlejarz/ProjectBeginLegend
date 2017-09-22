package net.olejarz.config;

import net.olejarz.model.Player;
import net.olejarz.model.Team;

import java.util.ArrayList;

public class TeamsConfig {
    public ArrayList<Team> getTeams() {
        Team team1 = new Team();
        team1.setName("FKS STAL MIELEC");
        team1.setTeampower(100);

        Player player1 = new Player();
        player1.setName("Kamil Glik");
        player1.setSkill(100);
        team1.addPlayer(player1);

        Player player2 = new Player();
        player2.setName("Arkadiusz Milik");
        player2.setSkill(100);
        team1.addPlayer(player2);

        Player player3 = new Player();
        player3.setName("Robert Lewandowski");
        player3.setSkill(100);
        team1.addPlayer(player3);

        Team team2 = new Team();
        team2.setName("LEGIA WARSZAWA");
        team2.setTeampower(90);

        Player player4 = new Player();
        player4.setName("Miroslav Radovic");
        player4.setSkill(90);
        team2.addPlayer(player4);

        Player player5 = new Player();
        player5.setName("Michał Kucharczyk");
        player5.setSkill(90);
        team2.addPlayer(player5);

        Player player6 = new Player();
        player6.setName("Vadis Odjidja-Ofoe");
        player6.setSkill(90);
        team2.addPlayer(player6);

        Team team3 = new Team();
        team3.setName("CRACOVIA");
        team3.setTeampower(80);

        Player player7 = new Player();
        player7.setName("Saïdi Ntibazonkiza");
        player7.setSkill(880);
        team3.addPlayer(player7);

        Player player8 = new Player();
        player8.setName("Miro Covilo");
        player8.setSkill(80);
        team3.addPlayer(player8);

        Player player9 = new Player();
        player9.setName("Krzysztof Piątek");
        player9.setSkill(80);
        team3.addPlayer(player9);

        Team team4 = new Team();
        team4.setName("SANDECJA");
        team4.setTeampower(70);

        Player player10 = new Player();
        player10.setName("Alexandar Kolev");
        player10.setSkill(70);
        team4.addPlayer(player10);

        Player player11 = new Player();
        player11.setName("Mateusz Cetnarski");
        player11.setSkill(70);
        team4.addPlayer(player11);

        Player player12 = new Player();
        player12.setName("Wojciech Trochim");
        player12.setSkill(70);
        team4.addPlayer(player12);

//        Team[] teams;
        ArrayList<Team> teams = new ArrayList<>();
//        teams = new Team[4];
//        teams[0] = team1;
//        teams[1] = team2;
//        teams[2] = team3;
//        teams[3] = team4;
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);

        return teams;
    }
}
