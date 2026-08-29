package com.cricket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Transient;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WagonWheel implements Cloneable{

  private int playerId;
  private Team opponentTeam;
  private Ground whichVenue;
  private String matchNumber;
  private int sixDistance;
  
  @Transient
  private Player player;

public WagonWheel() {
	super();
}

public WagonWheel(int playerId, Team opponentTeam, Ground whichVenue, String matchNumber, int sixDistance,
		Player player) {
	super();
	this.playerId = playerId;
	this.opponentTeam = opponentTeam;
	this.whichVenue = whichVenue;
	this.matchNumber = matchNumber;
	this.sixDistance = sixDistance;
	this.player = player;
}

public int getPlayerId() {
	return playerId;
}

public void setPlayerId(int playerId) {
	this.playerId = playerId;
}

public Team getOpponentTeam() {
	return opponentTeam;
}

public void setOpponentTeam(Team opponentTeam) {
	this.opponentTeam = opponentTeam;
}

public Ground getWhichVenue() {
	return whichVenue;
}

public void setWhichVenue(Ground whichVenue) {
	this.whichVenue = whichVenue;
}

public String getMatchNumber() {
	return matchNumber;
}

public void setMatchNumber(String matchNumber) {
	this.matchNumber = matchNumber;
}

public int getSixDistance() {
	return sixDistance;
}

public void setSixDistance(int sixDistance) {
	this.sixDistance = sixDistance;
}

public Player getPlayer() {
	return player;
}

public void setPlayer(Player player) {
	this.player = player;
}

@Override
public WagonWheel clone() throws CloneNotSupportedException {
	WagonWheel clone = null;
    try
    {
        clone = (WagonWheel) super.clone();
    } 
    catch (CloneNotSupportedException e) 
    {
        throw new RuntimeException(e);
    }
    return clone;
}

}