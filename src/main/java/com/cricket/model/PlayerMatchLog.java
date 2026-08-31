package com.cricket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerMatchLog {

  private int playerId;

  private String matchFileName;

  private String matchDate;

  private int year;

  private int seasonId;

  private String seasonDescription;

  private String tournament;

  private int batterPosition;

  private int runs;

  private int balls;

  private int fours;

  private int sixes;

  private String status;

  private boolean notOut;

  private boolean captain;

  private boolean wicketKeeper;

  private String venue;

  private Team team;

  private Team opponentTeam;

  public int getPlayerId() {
	return playerId;
  }

  public void setPlayerId(int playerId) {
	this.playerId = playerId;
  }

  public String getMatchFileName() {
	return matchFileName;
  }

  public void setMatchFileName(String matchFileName) {
	this.matchFileName = matchFileName;
  }

  public String getMatchDate() {
	return matchDate;
  }

  public void setMatchDate(String matchDate) {
	this.matchDate = matchDate;
  }

  public int getYear() {
	return year;
  }

  public void setYear(int year) {
	this.year = year;
  }

  public int getSeasonId() {
	return seasonId;
  }

  public void setSeasonId(int seasonId) {
	this.seasonId = seasonId;
  }

  public String getSeasonDescription() {
	return seasonDescription;
  }

  public void setSeasonDescription(String seasonDescription) {
	this.seasonDescription = seasonDescription;
  }

  public String getTournament() {
	return tournament;
  }

  public void setTournament(String tournament) {
	this.tournament = tournament;
  }

  public int getBatterPosition() {
	return batterPosition;
  }

  public void setBatterPosition(int batterPosition) {
	this.batterPosition = batterPosition;
  }

  public int getRuns() {
	return runs;
  }

  public void setRuns(int runs) {
	this.runs = runs;
  }

  public int getBalls() {
	return balls;
  }

  public void setBalls(int balls) {
	this.balls = balls;
  }

  public int getFours() {
	return fours;
  }

  public void setFours(int fours) {
	this.fours = fours;
  }

  public int getSixes() {
	return sixes;
  }

  public void setSixes(int sixes) {
	this.sixes = sixes;
  }

  public String getStatus() {
	return status;
  }

  public void setStatus(String status) {
	this.status = status;
  }

  public boolean isNotOut() {
	return notOut;
  }

  public void setNotOut(boolean notOut) {
	this.notOut = notOut;
  }

  public boolean isCaptain() {
	return captain;
  }

  public void setCaptain(boolean captain) {
	this.captain = captain;
  }

  public boolean isWicketKeeper() {
	return wicketKeeper;
  }

  public void setWicketKeeper(boolean wicketKeeper) {
	this.wicketKeeper = wicketKeeper;
  }

  public String getVenue() {
	return venue;
  }

  public void setVenue(String venue) {
	this.venue = venue;
  }

  public Team getTeam() {
	return team;
  }

  public void setTeam(Team team) {
	this.team = team;
  }

  public Team getOpponentTeam() {
	return opponentTeam;
  }

  public void setOpponentTeam(Team opponentTeam) {
	this.opponentTeam = opponentTeam;
  }

  @Override
  public String toString() {
	return "PlayerMatchLog [playerId=" + playerId + ", matchFileName=" + matchFileName + ", matchDate=" + matchDate
			+ ", year=" + year + ", seasonId=" + seasonId + ", seasonDescription=" + seasonDescription
			+ ", tournament=" + tournament + ", batterPosition=" + batterPosition + ", runs=" + runs + ", balls="
			+ balls + ", fours=" + fours + ", sixes=" + sixes + ", status=" + status + ", notOut=" + notOut
			+ ", captain=" + captain + ", wicketKeeper=" + wicketKeeper + ", venue=" + venue + ", team=" + team
			+ ", opponentTeam=" + opponentTeam + "]";
  }

}