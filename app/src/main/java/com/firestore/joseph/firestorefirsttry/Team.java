package com.firestore.joseph.firestorefirsttry;

/**
 * Created by joseph on 30/12/17.
 */

public class Team {
    String teamName;
    int noPlayers;
    int position;


    public Team(String teamName, int noPlayers, int position) {
        this.teamName = teamName;
        this.noPlayers = noPlayers;
        this.position = position;
    }

    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNoPlayers() {
        return noPlayers;
    }

    public void setNoPlayers(int noPlayers) {
        this.noPlayers = noPlayers;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
