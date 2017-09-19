package net.olejarz;

public class Main {

    public static void main(String[] args) {
        System.out.println("Super Manager");

        Team team1 = new Team();
        team1.setName("FKS STAL MIELEC");
        team1.setTeampower(100);

        Team team2 = new Team();
        team2.setName("LEGIA WARSZAWA");
        team2.setTeampower(90);

        Team team3 = new Team();
        team3.setName("CRACOVIA");
        team3.setTeampower(90);

        if(team1.getTeampower() > team2.getTeampower()){
            System.out.println("Wygrywa " + team1.getName() + " 5:1");
        } else {
            System.out.println("Wygrywa " + team2.getName() + " 5:1");
        }
    }
}
