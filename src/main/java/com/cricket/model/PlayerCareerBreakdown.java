package com.cricket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Full result returned by CricketFunctions.getPlayerCareerBreakdown().
 * matchLogs = raw match-by-match rows (for tables / drill-down).
 * The *WiseStats lists are already bucketed and sorted - feed straight into a bar graph.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerCareerBreakdown {

  private Player player;

  private PlayerStatsBucket overallStats;

  private List<PlayerMatchLog> matchLogs;

  private List<PlayerStatsBucket> positionWiseStats;

  private PlayerStatsBucket captainStats;

  private PlayerStatsBucket nonCaptainStats;

  private List<PlayerStatsBucket> yearWiseStats;

  private List<PlayerStatsBucket> seasonWiseStats;

  private List<PlayerStatsBucket> opponentWiseStats;

  public Player getPlayer() {
	return player;
  }

  public void setPlayer(Player player) {
	this.player = player;
  }

  public PlayerStatsBucket getOverallStats() {
	return overallStats;
  }

  public void setOverallStats(PlayerStatsBucket overallStats) {
	this.overallStats = overallStats;
  }

  public List<PlayerMatchLog> getMatchLogs() {
	return matchLogs;
  }

  public void setMatchLogs(List<PlayerMatchLog> matchLogs) {
	this.matchLogs = matchLogs;
  }

  public List<PlayerStatsBucket> getPositionWiseStats() {
	return positionWiseStats;
  }

  public void setPositionWiseStats(List<PlayerStatsBucket> positionWiseStats) {
	this.positionWiseStats = positionWiseStats;
  }

  public PlayerStatsBucket getCaptainStats() {
	return captainStats;
  }

  public void setCaptainStats(PlayerStatsBucket captainStats) {
	this.captainStats = captainStats;
  }

  public PlayerStatsBucket getNonCaptainStats() {
	return nonCaptainStats;
  }

  public void setNonCaptainStats(PlayerStatsBucket nonCaptainStats) {
	this.nonCaptainStats = nonCaptainStats;
  }

  public List<PlayerStatsBucket> getYearWiseStats() {
	return yearWiseStats;
  }

  public void setYearWiseStats(List<PlayerStatsBucket> yearWiseStats) {
	this.yearWiseStats = yearWiseStats;
  }

  public List<PlayerStatsBucket> getSeasonWiseStats() {
	return seasonWiseStats;
  }

  public void setSeasonWiseStats(List<PlayerStatsBucket> seasonWiseStats) {
	this.seasonWiseStats = seasonWiseStats;
  }

  public List<PlayerStatsBucket> getOpponentWiseStats() {
	return opponentWiseStats;
  }

  public void setOpponentWiseStats(List<PlayerStatsBucket> opponentWiseStats) {
	this.opponentWiseStats = opponentWiseStats;
  }

}