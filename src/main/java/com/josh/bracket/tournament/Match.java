package com.josh.bracket.tournament;

import javax.persistence.*;

@Entity
@Table(name = "T_MATCH")
public class Match {

    @Id
    private Long id;

    @OneToOne
    private Team team1;

    @OneToOne
    private Team team2;
    @Enumerated(EnumType.STRING)
    private MatchType matchType;
    @OneToOne
    private Result result;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
