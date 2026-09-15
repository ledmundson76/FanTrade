package com.fantrade;

public class PlayerStats {
    private int receptions;
    private int receivingYards;
    private int receivingTouchdowns;

    public PlayerStats(int receptions, int receivingYards, int receivingTouchdowns) {
        this.receptions = receptions;
        this.receivingYards = receivingYards;
        this.receivingTouchdowns = receivingTouchdowns;
    }

    public int getReceptions() {
        return receptions;
    }

    public int getReceivingYards() {
        return receivingYards;
    }

    public int getReceivingTouchdowns() {
        return receivingTouchdowns;
    }
}
