package com.fantrade;

public class FantasyScoring {

    public static double calculatePPRPoints(PlayerStats stats) {
        double points = 0;

        points += stats.getReceptions();
        points += stats.getReceivingYards() * 0.1;
        points += stats.getReceivingTouchdowns() * 6;

        return points;
    }
}
