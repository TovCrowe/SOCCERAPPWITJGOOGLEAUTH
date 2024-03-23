package com.example.futbolbackend.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="Team")
public class TeamModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "teamname")
    private String teamName;

    @Column(nullable = false, name = "wins")
    private int wins;

    @Column(nullable = false, name = "losses")
    private int losses;

    @Column(nullable = false, name = "draws")
    private int draws;

    @Column(nullable = false, name = "points")
    private int points;

    // Constructors, getters, and setters
    public TeamModel() {}

    public TeamModel(String teamName, int wins, int losses, int draws, int points) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.points = points;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
