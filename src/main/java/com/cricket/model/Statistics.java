package com.cricket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="Statistics")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Statistics
{
  @Id
  @Column(name="StatisticsId")
  private Integer statisticsId;
  
  @Column(name="PlayerID")
  private Integer playerID;
  
  @Column(name="StatsTypeId")
  private Integer statsTypeId;
  
  @Column(name="Matches")
  private Integer matches;
  
  @Column(name="Innings")
  private Integer innings;
  
  @Column(name="BowlerInning")
  private Integer bowlerInning;

  @Column(name="NotOut")
  private Integer notOut;
  
  @Column(name="Runs")
  private Integer runs;
  
  @Column(name="BallsFaced")
  private Integer ballsFaced;
  
  @Column(name="BestScore")
  private String bestScore;
  
  @Column(name="BestScoreAgainst")
  private String bestScoreAgainst;
  
  @Column(name="BestScoreVenue")
  private String bestScoreVenue;
  
  @Column(name="Hundreds")
  private Integer hundreds;
  
  @Column(name="Fifties")
  private Integer fifties;
  
  @Column(name="Thirties")
  private Integer thirties;
  
  @Column(name="Fours")
  private Integer fours;
  
  @Column(name="Sixes")
  private Integer sixes;
  
  @Column(name="BallsBowled")
  private Integer ballsBowled;
  
  @Column(name="RunsConceded")
  private Integer runsConceded;
  
  @Column(name="Plus3")
  private Integer plus3;
  
  @Column(name="Plus5")
  private Integer plus5;
  
  @Column(name="DotBowled")
  private Integer dotBowled;
  
  @Column(name="Wickets")
  private Integer wickets;
  
  @Column(name="CATCHES")
  private Integer catches;
  
  @Column(name="BestFigures")
  private String bestFigures;
  
  @Column(name="BestFiguresAgainst")
  private String bestFiguresAgainst;
  
  @Column(name="BestFiguresVenue")
  private String bestFiguresVenue;
  
  @Transient
  private StatsType stats_type;
  
  @Transient
  private int tournament_fours;
  
  @Transient
  private int tournament_sixes;

  public Integer getStatisticsId() {
	return statisticsId;
  }

  public void setStatisticsId(Integer statisticsId) {
	this.statisticsId = statisticsId;
  }

  public Integer getPlayerID() {
	return playerID;
  }

  public void setPlayerID(Integer playerID) {
	this.playerID = playerID;
  }

  public Integer getStatsTypeId() {
	return statsTypeId;
  }

  public void setStatsTypeId(Integer statsTypeId) {
	this.statsTypeId = statsTypeId;
  }

  public Integer getMatches() {
	return matches;
  }

  public void setMatches(Integer matches) {
	this.matches = matches;
  }

  public Integer getInnings() {
	return innings;
  }

  public void setInnings(Integer innings) {
	this.innings = innings;
  }

  public Integer getBowlerInning() {
	return bowlerInning;
  }

  public void setBowlerInning(Integer bowlerInning) {
	this.bowlerInning = bowlerInning;
  }

  public Integer getNotOut() {
	return notOut;
  }

  public void setNotOut(Integer notOut) {
	this.notOut = notOut;
  }

  public Integer getRuns() {
	return runs;
  }

  public void setRuns(Integer runs) {
	this.runs = runs;
  }

  public Integer getBallsFaced() {
	return ballsFaced;
  }

  public void setBallsFaced(Integer ballsFaced) {
	this.ballsFaced = ballsFaced;
  }

  public String getBestScore() {
	return bestScore;
  }

  public void setBestScore(String bestScore) {
	this.bestScore = bestScore;
  }

  public String getBestScoreAgainst() {
	return bestScoreAgainst;
  }

  public void setBestScoreAgainst(String bestScoreAgainst) {
	this.bestScoreAgainst = bestScoreAgainst;
  }

  public String getBestScoreVenue() {
	return bestScoreVenue;
  }

  public void setBestScoreVenue(String bestScoreVenue) {
	this.bestScoreVenue = bestScoreVenue;
  }

  public Integer getHundreds() {
	return hundreds;
  }

  public void setHundreds(Integer hundreds) {
	this.hundreds = hundreds;
  }

  public Integer getFifties() {
	return fifties;
  }

  public void setFifties(Integer fifties) {
	this.fifties = fifties;
  }

  public Integer getThirties() {
	return thirties;
  }

  public void setThirties(Integer thirties) {
	this.thirties = thirties;
  }

  public Integer getFours() {
	return fours;
  }

  public void setFours(Integer fours) {
	this.fours = fours;
  }

  public Integer getSixes() {
	return sixes;
  }

  public void setSixes(Integer sixes) {
	this.sixes = sixes;
  }

  public Integer getBallsBowled() {
	return ballsBowled;
  }

  public void setBallsBowled(Integer ballsBowled) {
	this.ballsBowled = ballsBowled;
  }

  public Integer getRunsConceded() {
	return runsConceded;
  }

  public void setRunsConceded(Integer runsConceded) {
	this.runsConceded = runsConceded;
  }

  public Integer getPlus3() {
	return plus3;
  }

  public void setPlus3(Integer plus3) {
	this.plus3 = plus3;
  }

  public Integer getPlus5() {
	return plus5;
  }

  public void setPlus5(Integer plus5) {
	this.plus5 = plus5;
  }

  public Integer getDotBowled() {
	return dotBowled;
  }

  public void setDotBowled(Integer dotBowled) {
	this.dotBowled = dotBowled;
  }

  public Integer getWickets() {
	return wickets;
  }

  public void setWickets(Integer wickets) {
	this.wickets = wickets;
  }

  public Integer getCatches() {
	return catches;
  }

  public void setCatches(Integer catches) {
	this.catches = catches;
  }

  public String getBestFigures() {
	return bestFigures;
  }

  public void setBestFigures(String bestFigures) {
	this.bestFigures = bestFigures;
  }

  public String getBestFiguresAgainst() {
	return bestFiguresAgainst;
  }

  public void setBestFiguresAgainst(String bestFiguresAgainst) {
	this.bestFiguresAgainst = bestFiguresAgainst;
  }

  public String getBestFiguresVenue() {
	return bestFiguresVenue;
  }

  public void setBestFiguresVenue(String bestFiguresVenue) {
	this.bestFiguresVenue = bestFiguresVenue;
  }

  public StatsType getStats_type() {
	return stats_type;
  }

  public void setStats_type(StatsType stats_type) {
	this.stats_type = stats_type;
  }

  public int getTournament_fours() {
	return tournament_fours;
  }

  public void setTournament_fours(int tournament_fours) {
	this.tournament_fours = tournament_fours;
  }

  public int getTournament_sixes() {
	return tournament_sixes;
  }

  public void setTournament_sixes(int tournament_sixes) {
	this.tournament_sixes = tournament_sixes;
  }

  @Override
  public String toString() {
	return "Statistics [statisticsId=" + statisticsId + ", playerID=" + playerID + ", statsTypeId=" + statsTypeId
			+ ", matches=" + matches + ", innings=" + innings + ", bowlerInning=" + bowlerInning + ", notOut=" + notOut
			+ ", runs=" + runs + ", ballsFaced=" + ballsFaced + ", bestScore=" + bestScore + ", bestScoreAgainst="
			+ bestScoreAgainst + ", bestScoreVenue=" + bestScoreVenue + ", hundreds=" + hundreds + ", fifties="
			+ fifties + ", thirties=" + thirties + ", fours=" + fours + ", sixes=" + sixes + ", ballsBowled="
			+ ballsBowled + ", runsConceded=" + runsConceded + ", plus3=" + plus3 + ", plus5=" + plus5 + ", dotBowled="
			+ dotBowled + ", wickets=" + wickets + ", catches=" + catches + ", bestFigures=" + bestFigures
			+ ", bestFiguresAgainst=" + bestFiguresAgainst + ", bestFiguresVenue=" + bestFiguresVenue + ", stats_type="
			+ stats_type + ", tournament_fours=" + tournament_fours + ", tournament_sixes=" + tournament_sixes + "]";
  }
  
  

  }