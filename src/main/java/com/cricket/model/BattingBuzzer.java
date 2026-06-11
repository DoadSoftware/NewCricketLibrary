package com.cricket.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BattingBuzzer {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("list")
    private List<Player> list;

    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    public List<Player> getList() { return list; }
    public void setList(List<Player> list) { this.list = list; }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Player {

    	@JsonProperty("player_id")
        private int playerId;
    	
        @JsonProperty("player_name")
        private String playerName;

        @JsonProperty("team_id")
        private int teamId;

        @JsonProperty("team_name")
        private String teamName;

        @JsonProperty("points")
        private int points;

        @JsonProperty("category")
        private String category;

        @JsonProperty("buzzers")
        private List<String> buzzers;

        @JsonProperty("tar")
        private int tar;

        @JsonProperty("succ")
        private int succ;

        @JsonProperty("matches_played")
        private int matchesPlayed;

        public int getPlayerId()    { return playerId; }
        public String getPlayerName()    { return playerName; }
        public int    getTeamId()        { return teamId; }
        public String getTeamName()      { return teamName; }
        public int    getPoints()        { return points; }
        public String getCategory()      { return category; }
        public List<String> getBuzzers() { return buzzers; }
        public int    getTar()           { return tar; }
        public int    getSucc()          { return succ; }
        public int    getMatchesPlayed() { return matchesPlayed; }

        public void setPlayerId(int playerId)       { this.playerId = playerId; }
        public void setPlayerName(String playerName)       { this.playerName = playerName; }
        public void setTeamId(int teamId)                  { this.teamId = teamId; }
        public void setTeamName(String teamName)           { this.teamName = teamName; }
        public void setPoints(int points)                  { this.points = points; }
        public void setCategory(String category)           { this.category = category; }
        public void setBuzzers(List<String> buzzers)       { this.buzzers = buzzers; }
        public void setTar(int tar)                        { this.tar = tar; }
        public void setSucc(int succ)                      { this.succ = succ; }
        public void setMatchesPlayed(int matchesPlayed)    { this.matchesPlayed = matchesPlayed; }
    }
}
