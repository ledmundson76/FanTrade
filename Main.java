package com.fantrade;

public class Main {
  public static void main(String[] args) {

    Player player = new Player(
      "TEST PLAYER JUJU",
      "WR"
      "PIT"
  };

  PlayerStats stats = new PlayerStats{7, 185, 1);

  double fantasyPoints =
            FantasyScoring.calculatePPRPoints(stats);
  
        System.out.println("Player: " + player.getName());
        System.out.println("Position: " + player.getPosition());
        System.out.println("Team: " + player.getTeam());
        System.out.println("PPR Fantasy Points: " + fantasyPoints);
}
