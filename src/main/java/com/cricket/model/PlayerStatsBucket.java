package com.cricket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * One aggregated bar-graph-ready bucket - e.g. "3rd Position", "2026", "LLCSeason1",
 * "As Captain", "vs AFGHANISTAN". Built by CricketFunctions.buildStatsBucket().
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStatsBucket {

  private String groupLabel;

  private int groupOrder;

  private int matches;

  private int innings;

  private int notOuts;

  private int runs;

  private int balls;

  private int highestScore;

  private boolean highestScoreNotOut;

  private int hundreds;

  private int fifties;

  private int thirties;

  private int fours;

  private int sixes;

  private double average;

  private double strikeRate;

  public String getGroupLabel() {
	return groupLabel;
  }

  public void setGroupLabel(String groupLabel) {
	this.groupLabel = groupLabel;
  }

  public int getGroupOrder() {
	return groupOrder;
  }

  public void setGroupOrder(int groupOrder) {
	this.groupOrder = groupOrder;
  }

  public int getMatches() {
	return matches;
  }

  public void setMatches(int matches) {
	this.matches = matches;
  }

  public int getInnings() {
	return innings;
  }

  public void setInnings(int innings) {
	this.innings = innings;
  }

  public int getNotOuts() {
	return notOuts;
  }

  public void setNotOuts(int notOuts) {
	this.notOuts = notOuts;
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

  public int getHighestScore() {
	return highestScore;
  }

  public void setHighestScore(int highestScore) {
	this.highestScore = highestScore;
  }

  public boolean isHighestScoreNotOut() {
	return highestScoreNotOut;
  }

  public void setHighestScoreNotOut(boolean highestScoreNotOut) {
	this.highestScoreNotOut = highestScoreNotOut;
  }

  public int getHundreds() {
	return hundreds;
  }

  public void setHundreds(int hundreds) {
	this.hundreds = hundreds;
  }

  public int getFifties() {
	return fifties;
  }

  public void setFifties(int fifties) {
	this.fifties = fifties;
  }

  public int getThirties() {
	return thirties;
  }

  public void setThirties(int thirties) {
	this.thirties = thirties;
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

  public double getAverage() {
	return average;
  }

  public void setAverage(double average) {
	this.average = average;
  }

  public double getStrikeRate() {
	return strikeRate;
  }

  public void setStrikeRate(double strikeRate) {
	this.strikeRate = strikeRate;
  }

  @Override
  public String toString() {
	return "PlayerStatsBucket [groupLabel=" + groupLabel + ", groupOrder=" + groupOrder + ", matches=" + matches
			+ ", innings=" + innings + ", notOuts=" + notOuts + ", runs=" + runs + ", balls=" + balls
			+ ", highestScore=" + highestScore + ", highestScoreNotOut=" + highestScoreNotOut + ", hundreds="
			+ hundreds + ", fifties=" + fifties + ", thirties=" + thirties + ", fours=" + fours + ", sixes=" + sixes
			+ ", average=" + average + ", strikeRate=" + strikeRate + "]";
  }

}