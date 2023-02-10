package com.josh.bracket.tournament;

import javax.persistence.*;

@Entity
public class Result {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int t1Goals;
    private int t2Goals;
    private boolean isDraw;
    private boolean isPenalties;
    private int t1PenaltyGoals;
    private int t2PenaltyGoals;
    @OneToOne
    private Team winner;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getT1Goals() {
        return t1Goals;
    }

    public void setT1Goals(int t1Goals) {
        this.t1Goals = t1Goals;
    }

    public int getT2Goals() {
        return t2Goals;
    }

    public void setT2Goals(int t2Goals) {
        this.t2Goals = t2Goals;
    }

    public boolean isDraw() {
        return isDraw;
    }

    public void setDraw(boolean draw) {
        isDraw = draw;
    }

    public boolean isPenalties() {
        return isPenalties;
    }

    public void setPenalties(boolean penalties) {
        isPenalties = penalties;
    }

    public int getT1PenaltyGoals() {
        return t1PenaltyGoals;
    }

    public void setT1PenaltyGoals(int t1PenaltyGoals) {
        this.t1PenaltyGoals = t1PenaltyGoals;
    }

    public int getT2PenaltyGoals() {
        return t2PenaltyGoals;
    }

    public void setT2PenaltyGoals(int t2PenaltyGoals) {
        this.t2PenaltyGoals = t2PenaltyGoals;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }
}
