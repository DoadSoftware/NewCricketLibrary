package com.cricket.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchStatsData {

    // COMMON PLAYER / TEAM DATA
    private int playerId;
    private String player;
    private int teamId;
    private String team;

    // BATTING BREAKDOWNS
    private BestScores battingBestScores;
    private List<ByPosition> battingByPosition;
    private List<ByYear> battingByYear;
    private ModesOfDismissal battingModesOfDismissal;
    private List<VsOpponent> battingVsOpponent;
    private List<ScoreDistribution> battingScoreDistribution;
    private List<ByCountry> battingByCountry;
    private List<ByVenue> battingByVenue;

    // BOWLING BREAKDOWNS
    private BowlingBestFigures bowlingBestFigures;
    private ModeOfWickets bowlingModeOfWickets;
    private List<BowlingByYear> bowlingByYear;
    private List<BowlingByCountry> bowlingByCountry;
    private List<BowlingByVenue> bowlingByVenue;

    // CONSTRUCTOR

    public MatchStatsData() {
        super();
        this.battingBestScores = new BestScores();
        this.battingByPosition = new ArrayList<>();
        this.battingByYear = new ArrayList<>();
        this.battingModesOfDismissal = new ModesOfDismissal();
        this.battingVsOpponent = new ArrayList<>();
        this.battingScoreDistribution = new ArrayList<>();
        this.battingByCountry = new ArrayList<>();
        this.battingByVenue = new ArrayList<>();

        this.bowlingBestFigures = new BowlingBestFigures();
        this.bowlingModeOfWickets = new ModeOfWickets();
        this.bowlingByYear = new ArrayList<>();
        this.bowlingByCountry = new ArrayList<>();
        this.bowlingByVenue = new ArrayList<>();
    }

    // COMMON PLAYER / TEAM GETTERS & SETTERS

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    // TOP-LEVEL GETTERS & SETTERS

    public BestScores getBattingBestScores() {
        return battingBestScores;
    }

    public void setBattingBestScores(BestScores battingBestScores) {
        this.battingBestScores = battingBestScores;
    }

    public List<ByPosition> getBattingByPosition() {
        return battingByPosition;
    }

    public void setBattingByPosition(List<ByPosition> battingByPosition) {
        this.battingByPosition = battingByPosition;
    }

    public List<ByYear> getBattingByYear() {
        return battingByYear;
    }

    public void setBattingByYear(List<ByYear> battingByYear) {
        this.battingByYear = battingByYear;
    }

    public ModesOfDismissal getBattingModesOfDismissal() {
        return battingModesOfDismissal;
    }

    public void setBattingModesOfDismissal(ModesOfDismissal battingModesOfDismissal) {
        this.battingModesOfDismissal = battingModesOfDismissal;
    }

    public List<VsOpponent> getBattingVsOpponent() {
        return battingVsOpponent;
    }

    public void setBattingVsOpponent(List<VsOpponent> battingVsOpponent) {
        this.battingVsOpponent = battingVsOpponent;
    }

    public List<ScoreDistribution> getBattingScoreDistribution() {
        return battingScoreDistribution;
    }

    public void setBattingScoreDistribution(List<ScoreDistribution> battingScoreDistribution) {
        this.battingScoreDistribution = battingScoreDistribution;
    }

    public List<ByCountry> getBattingByCountry() {
        return battingByCountry;
    }

    public void setBattingByCountry(List<ByCountry> battingByCountry) {
        this.battingByCountry = battingByCountry;
    }

    public List<ByVenue> getBattingByVenue() {
        return battingByVenue;
    }

    public void setBattingByVenue(List<ByVenue> battingByVenue) {
        this.battingByVenue = battingByVenue;
    }

    public BowlingBestFigures getBowlingBestFigures() {
        return bowlingBestFigures;
    }

    public void setBowlingBestFigures(BowlingBestFigures bowlingBestFigures) {
        this.bowlingBestFigures = bowlingBestFigures;
    }

    public ModeOfWickets getBowlingModeOfWickets() {
        return bowlingModeOfWickets;
    }

    public void setBowlingModeOfWickets(ModeOfWickets bowlingModeOfWickets) {
        this.bowlingModeOfWickets = bowlingModeOfWickets;
    }

    public List<BowlingByYear> getBowlingByYear() {
        return bowlingByYear;
    }

    public void setBowlingByYear(List<BowlingByYear> bowlingByYear) {
        this.bowlingByYear = bowlingByYear;
    }

    public List<BowlingByCountry> getBowlingByCountry() {
        return bowlingByCountry;
    }

    public void setBowlingByCountry(List<BowlingByCountry> bowlingByCountry) {
        this.bowlingByCountry = bowlingByCountry;
    }

    public List<BowlingByVenue> getBowlingByVenue() {
        return bowlingByVenue;
    }

    public void setBowlingByVenue(List<BowlingByVenue> bowlingByVenue) {
        this.bowlingByVenue = bowlingByVenue;
    }

    // TO STRING

    @Override
    public String toString() {
        return "MatchStatsData ["
                + "playerId=" + playerId
                + ", player=" + player
                + ", teamId=" + teamId
                + ", team=" + team
                + ", battingBestScores=" + battingBestScores
                + ", battingByPosition=" + battingByPosition
                + ", battingByYear=" + battingByYear
                + ", battingModesOfDismissal=" + battingModesOfDismissal
                + ", battingVsOpponent=" + battingVsOpponent
                + ", battingScoreDistribution=" + battingScoreDistribution
                + ", battingByCountry=" + battingByCountry
                + ", battingByVenue=" + battingByVenue
                + ", bowlingBestFigures=" + bowlingBestFigures
                + ", bowlingModeOfWickets=" + bowlingModeOfWickets
                + ", bowlingByYear=" + bowlingByYear
                + ", bowlingByCountry=" + bowlingByCountry
                + ", bowlingByVenue=" + bowlingByVenue
                + "]";
    }

    // Batting_01_BestScores_and_TotalRuns
    public static class BestScores {
        private String careerBest;
        private String bestT20I;
        private String bestODI;
        private String bestTest;
        private int careerRuns;
        private int t20iRuns;
        private int odiRuns;
        private int testRuns;

        public BestScores() {
            super();
        }

        public String getCareerBest() {
            return careerBest;
        }

        public void setCareerBest(String careerBest) {
            this.careerBest = careerBest;
        }

        public String getBestT20I() {
            return bestT20I;
        }

        public void setBestT20I(String bestT20I) {
            this.bestT20I = bestT20I;
        }

        public String getBestODI() {
            return bestODI;
        }

        public void setBestODI(String bestODI) {
            this.bestODI = bestODI;
        }

        public String getBestTest() {
            return bestTest;
        }

        public void setBestTest(String bestTest) {
            this.bestTest = bestTest;
        }

        public int getCareerRuns() {
            return careerRuns;
        }

        public void setCareerRuns(int careerRuns) {
            this.careerRuns = careerRuns;
        }

        public int getT20iRuns() {
            return t20iRuns;
        }

        public void setT20iRuns(int t20iRuns) {
            this.t20iRuns = t20iRuns;
        }

        public int getOdiRuns() {
            return odiRuns;
        }

        public void setOdiRuns(int odiRuns) {
            this.odiRuns = odiRuns;
        }

        public int getTestRuns() {
            return testRuns;
        }

        public void setTestRuns(int testRuns) {
            this.testRuns = testRuns;
        }

        @Override
        public String toString() {
            return "BestScores [careerBest=" + careerBest + ", bestT20I=" + bestT20I
                    + ", bestODI=" + bestODI + ", bestTest=" + bestTest
                    + ", careerRuns=" + careerRuns + ", t20iRuns=" + t20iRuns
                    + ", odiRuns=" + odiRuns + ", testRuns=" + testRuns + "]";
        }
    }

    // Batting_02_ByPosition
    public static class ByPosition {
        private String position;
        private int matches;
        private int runs;
        private int ballsFaced;
        private int dismissals;
        private double strikeRate;
        private double average;

        public ByPosition() {
            super();
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getMatches() {
            return matches;
        }

        public void setMatches(int matches) {
            this.matches = matches;
        }

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public int getBallsFaced() {
            return ballsFaced;
        }

        public void setBallsFaced(int ballsFaced) {
            this.ballsFaced = ballsFaced;
        }

        public int getDismissals() {
            return dismissals;
        }

        public void setDismissals(int dismissals) {
            this.dismissals = dismissals;
        }

        public double getStrikeRate() {
            return strikeRate;
        }

        public void setStrikeRate(double strikeRate) {
            this.strikeRate = strikeRate;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "ByPosition [position=" + position + ", matches=" + matches
                    + ", runs=" + runs + ", ballsFaced=" + ballsFaced
                    + ", dismissals=" + dismissals + ", strikeRate=" + strikeRate
                    + ", average=" + average + "]";
        }
    }

    // Batting_03_ByYear
    public static class ByYear {
        private int year;
        private int matches;
        private int runs;
        private int ballsFaced;
        private int dismissals;
        private double strikeRate;
        private double average;

        public ByYear() {
            super();
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMatches() {
            return matches;
        }

        public void setMatches(int matches) {
            this.matches = matches;
        }

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public int getBallsFaced() {
            return ballsFaced;
        }

        public void setBallsFaced(int ballsFaced) {
            this.ballsFaced = ballsFaced;
        }

        public int getDismissals() {
            return dismissals;
        }

        public void setDismissals(int dismissals) {
            this.dismissals = dismissals;
        }

        public double getStrikeRate() {
            return strikeRate;
        }

        public void setStrikeRate(double strikeRate) {
            this.strikeRate = strikeRate;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "ByYear [year=" + year + ", matches=" + matches + ", runs=" + runs
                    + ", ballsFaced=" + ballsFaced + ", dismissals=" + dismissals
                    + ", strikeRate=" + strikeRate + ", average=" + average + "]";
        }
    }

    // Batting_04_ModesOfDismissal
    public static class ModesOfDismissal {
        private int caught;
        private int bowled;
        private int lbw;
        private int runOut;
        private int stumped;
        private int caughtAndBowled;
        private int hitWicket;
        private int totalDismissals;

        public ModesOfDismissal() {
            super();
        }

        public int getCaught() {
            return caught;
        }

        public void setCaught(int caught) {
            this.caught = caught;
        }

        public int getBowled() {
            return bowled;
        }

        public void setBowled(int bowled) {
            this.bowled = bowled;
        }

        public int getLbw() {
            return lbw;
        }

        public void setLbw(int lbw) {
            this.lbw = lbw;
        }

        public int getRunOut() {
            return runOut;
        }

        public void setRunOut(int runOut) {
            this.runOut = runOut;
        }

        public int getStumped() {
            return stumped;
        }

        public void setStumped(int stumped) {
            this.stumped = stumped;
        }

        public int getCaughtAndBowled() {
            return caughtAndBowled;
        }

        public void setCaughtAndBowled(int caughtAndBowled) {
            this.caughtAndBowled = caughtAndBowled;
        }

        public int getHitWicket() {
            return hitWicket;
        }

        public void setHitWicket(int hitWicket) {
            this.hitWicket = hitWicket;
        }

        public int getTotalDismissals() {
            return totalDismissals;
        }

        public void setTotalDismissals(int totalDismissals) {
            this.totalDismissals = totalDismissals;
        }

        @Override
        public String toString() {
            return "ModesOfDismissal [caught=" + caught + ", bowled=" + bowled
                    + ", lbw=" + lbw + ", runOut=" + runOut + ", stumped=" + stumped
                    + ", caughtAndBowled=" + caughtAndBowled + ", hitWicket=" + hitWicket
                    + ", totalDismissals=" + totalDismissals + "]";
        }
    }

    // Batting_05_VsOpponent
    public static class VsOpponent {
        private int oppositionId;
        private String opponent;
        private int matches;
        private int runs;
        private int ballsFaced;
        private int notOuts;
        private int dismissals;
        private double strikeRate;
        private double average;

        public VsOpponent() {
            super();
        }

        public int getOppositionId() {
            return oppositionId;
        }

        public void setOppositionId(int oppositionId) {
            this.oppositionId = oppositionId;
        }

        public String getOpponent() {
            return opponent;
        }

        public void setOpponent(String opponent) {
            this.opponent = opponent;
        }

        public int getMatches() {
            return matches;
        }

        public void setMatches(int matches) {
            this.matches = matches;
        }

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public int getBallsFaced() {
            return ballsFaced;
        }

        public void setBallsFaced(int ballsFaced) {
            this.ballsFaced = ballsFaced;
        }

        public int getNotOuts() {
            return notOuts;
        }

        public void setNotOuts(int notOuts) {
            this.notOuts = notOuts;
        }

        public int getDismissals() {
            return dismissals;
        }

        public void setDismissals(int dismissals) {
            this.dismissals = dismissals;
        }

        public double getStrikeRate() {
            return strikeRate;
        }

        public void setStrikeRate(double strikeRate) {
            this.strikeRate = strikeRate;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "VsOpponent [oppositionId=" + oppositionId + ", opponent=" + opponent
                    + ", matches=" + matches + ", runs=" + runs + ", ballsFaced=" + ballsFaced
                    + ", notOuts=" + notOuts + ", dismissals=" + dismissals
                    + ", strikeRate=" + strikeRate + ", average=" + average + "]";
        }
    }

    // Batting_06_ScoreDistribution
    public static class ScoreDistribution {
        private String scoreBand;
        private int occurrences;
        private int runs;
        private int ballsFaced;
        private int notOuts;

        public ScoreDistribution() {
            super();
        }

        public String getScoreBand() {
            return scoreBand;
        }

        public void setScoreBand(String scoreBand) {
            this.scoreBand = scoreBand;
        }

        public int getOccurrences() {
            return occurrences;
        }

        public void setOccurrences(int occurrences) {
            this.occurrences = occurrences;
        }

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public int getBallsFaced() {
            return ballsFaced;
        }

        public void setBallsFaced(int ballsFaced) {
            this.ballsFaced = ballsFaced;
        }

        public int getNotOuts() {
            return notOuts;
        }

        public void setNotOuts(int notOuts) {
            this.notOuts = notOuts;
        }

        @Override
        public String toString() {
            return "ScoreDistribution [scoreBand=" + scoreBand + ", occurrences=" + occurrences
                    + ", runs=" + runs + ", ballsFaced=" + ballsFaced + ", notOuts=" + notOuts + "]";
        }
    }

    // Batting_07_ByCountry
    public static class ByCountry {
        private int countryId;
        private String country;
        private int matches;
        private int runs;
        private int ballsFaced;
        private int notOuts;
        private int dismissals;
        private double strikeRate;
        private double average;

        public ByCountry() {
            super();
        }

        public int getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getMatches() {
            return matches;
        }

        public void setMatches(int matches) {
            this.matches = matches;
        }

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public int getBallsFaced() {
            return ballsFaced;
        }

        public void setBallsFaced(int ballsFaced) {
            this.ballsFaced = ballsFaced;
        }

        public int getNotOuts() {
            return notOuts;
        }

        public void setNotOuts(int notOuts) {
            this.notOuts = notOuts;
        }

        public int getDismissals() {
            return dismissals;
        }

        public void setDismissals(int dismissals) {
            this.dismissals = dismissals;
        }

        public double getStrikeRate() {
            return strikeRate;
        }

        public void setStrikeRate(double strikeRate) {
            this.strikeRate = strikeRate;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "ByCountry [countryId=" + countryId + ", country=" + country
                    + ", matches=" + matches + ", runs=" + runs + ", ballsFaced=" + ballsFaced
                    + ", notOuts=" + notOuts + ", dismissals=" + dismissals
                    + ", strikeRate=" + strikeRate + ", average=" + average + "]";
        }
    }

    // Batting_08_ByVenue
    public static class ByVenue {
        private int venueId;
        private String venue;
        private int matches;
        private int runs;
        private int ballsFaced;
        private int notOuts;
        private int dismissals;
        private double strikeRate;
        private double average;

        public ByVenue() {
            super();
        }

        public int getVenueId() {
            return venueId;
        }

        public void setVenueId(int venueId) {
            this.venueId = venueId;
        }

        public String getVenue() {
            return venue;
        }

        public void setVenue(String venue) {
            this.venue = venue;
        }

        public int getMatches() {
            return matches;
        }

        public void setMatches(int matches) {
            this.matches = matches;
        }

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public int getBallsFaced() {
            return ballsFaced;
        }

        public void setBallsFaced(int ballsFaced) {
            this.ballsFaced = ballsFaced;
        }

        public int getNotOuts() {
            return notOuts;
        }

        public void setNotOuts(int notOuts) {
            this.notOuts = notOuts;
        }

        public int getDismissals() {
            return dismissals;
        }

        public void setDismissals(int dismissals) {
            this.dismissals = dismissals;
        }

        public double getStrikeRate() {
            return strikeRate;
        }

        public void setStrikeRate(double strikeRate) {
            this.strikeRate = strikeRate;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "ByVenue [venueId=" + venueId + ", venue=" + venue + ", matches=" + matches
                    + ", runs=" + runs + ", ballsFaced=" + ballsFaced + ", notOuts=" + notOuts
                    + ", dismissals=" + dismissals + ", strikeRate=" + strikeRate
                    + ", average=" + average + "]";
        }
    }

    // Bowling_01_BestFigures_and_TotalWickets
    public static class BowlingBestFigures {
        private String careerBest;
        private String bestT20I;
        private String bestODI;
        private String bestTest;
        private int careerWickets;
        private int t20iWickets;
        private int odiWickets;
        private int testWickets;

        public BowlingBestFigures() {
            super();
        }

        public String getCareerBest() {
            return careerBest;
        }

        public void setCareerBest(String careerBest) {
            this.careerBest = careerBest;
        }

        public String getBestT20I() {
            return bestT20I;
        }

        public void setBestT20I(String bestT20I) {
            this.bestT20I = bestT20I;
        }

        public String getBestODI() {
            return bestODI;
        }

        public void setBestODI(String bestODI) {
            this.bestODI = bestODI;
        }

        public String getBestTest() {
            return bestTest;
        }

        public void setBestTest(String bestTest) {
            this.bestTest = bestTest;
        }

        public int getCareerWickets() {
            return careerWickets;
        }

        public void setCareerWickets(int careerWickets) {
            this.careerWickets = careerWickets;
        }

        public int getT20iWickets() {
            return t20iWickets;
        }

        public void setT20iWickets(int t20iWickets) {
            this.t20iWickets = t20iWickets;
        }

        public int getOdiWickets() {
            return odiWickets;
        }

        public void setOdiWickets(int odiWickets) {
            this.odiWickets = odiWickets;
        }

        public int getTestWickets() {
            return testWickets;
        }

        public void setTestWickets(int testWickets) {
            this.testWickets = testWickets;
        }

        @Override
        public String toString() {
            return "BowlingBestFigures [careerBest=" + careerBest + ", bestT20I=" + bestT20I
                    + ", bestODI=" + bestODI + ", bestTest=" + bestTest
                    + ", careerWickets=" + careerWickets + ", t20iWickets=" + t20iWickets
                    + ", odiWickets=" + odiWickets + ", testWickets=" + testWickets + "]";
        }
    }

    // Bowling_02_ModeOfWickets
    public static class ModeOfWickets {
        private int caught;
        private int caughtBehind;
        private int caughtBowled;
        private int bowled;
        private int lbw;
        private int stumped;
        private int hitWicket;
        private int totalWickets;

        public ModeOfWickets() {
            super();
        }

        public int getCaught() {
            return caught;
        }

        public void setCaught(int caught) {
            this.caught = caught;
        }

        public int getCaughtBehind() {
            return caughtBehind;
        }

        public void setCaughtBehind(int caughtBehind) {
            this.caughtBehind = caughtBehind;
        }

        public int getCaughtBowled() {
            return caughtBowled;
        }

        public void setCaughtBowled(int caughtBowled) {
            this.caughtBowled = caughtBowled;
        }

        public int getBowled() {
            return bowled;
        }

        public void setBowled(int bowled) {
            this.bowled = bowled;
        }

        public int getLbw() {
            return lbw;
        }

        public void setLbw(int lbw) {
            this.lbw = lbw;
        }

        public int getStumped() {
            return stumped;
        }

        public void setStumped(int stumped) {
            this.stumped = stumped;
        }

        public int getHitWicket() {
            return hitWicket;
        }

        public void setHitWicket(int hitWicket) {
            this.hitWicket = hitWicket;
        }

        public int getTotalWickets() {
            return totalWickets;
        }

        public void setTotalWickets(int totalWickets) {
            this.totalWickets = totalWickets;
        }

        @Override
        public String toString() {
            return "ModeOfWickets [caught=" + caught + ", caughtBehind=" + caughtBehind
                    + ", caughtBowled=" + caughtBowled + ", bowled=" + bowled + ", lbw=" + lbw
                    + ", stumped=" + stumped + ", hitWicket=" + hitWicket
                    + ", totalWickets=" + totalWickets + "]";
        }
    }

    // Bowling_03_ByYear
    public static class BowlingByYear {
        private int year;
        private int matches;
        private double overs;
        private int runsConceded;
        private int wickets;
        private double economy;
        private double average;

        public BowlingByYear() {
            super();
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMatches() {
            return matches;
        }

        public void setMatches(int matches) {
            this.matches = matches;
        }

        public double getOvers() {
            return overs;
        }

        public void setOvers(double overs) {
            this.overs = overs;
        }

        public int getRunsConceded() {
            return runsConceded;
        }

        public void setRunsConceded(int runsConceded) {
            this.runsConceded = runsConceded;
        }

        public int getWickets() {
            return wickets;
        }

        public void setWickets(int wickets) {
            this.wickets = wickets;
        }

        public double getEconomy() {
            return economy;
        }

        public void setEconomy(double economy) {
            this.economy = economy;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "BowlingByYear [year=" + year + ", matches=" + matches + ", overs=" + overs
                    + ", runsConceded=" + runsConceded + ", wickets=" + wickets
                    + ", economy=" + economy + ", average=" + average + "]";
        }
    }

    // Bowling_04_ByCountry
    public static class BowlingByCountry {
        private int countryId;
        private String country;
        private int matches;
        private double overs;
        private int runsConceded;
        private int wickets;
        private double economy;
        private double average;

        public BowlingByCountry() {
            super();
        }

        public int getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getMatches() {
            return matches;
        }

        public void setMatches(int matches) {
            this.matches = matches;
        }

        public double getOvers() {
            return overs;
        }

        public void setOvers(double overs) {
            this.overs = overs;
        }

        public int getRunsConceded() {
            return runsConceded;
        }

        public void setRunsConceded(int runsConceded) {
            this.runsConceded = runsConceded;
        }

        public int getWickets() {
            return wickets;
        }

        public void setWickets(int wickets) {
            this.wickets = wickets;
        }

        public double getEconomy() {
            return economy;
        }

        public void setEconomy(double economy) {
            this.economy = economy;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "BowlingByCountry [countryId=" + countryId + ", country=" + country
                    + ", matches=" + matches + ", overs=" + overs + ", runsConceded=" + runsConceded
                    + ", wickets=" + wickets + ", economy=" + economy + ", average=" + average + "]";
        }
    }

    // Bowling_05_ByVenue
    public static class BowlingByVenue {
        private int venueId;
        private String venue;
        private int matches;
        private double overs;
        private int runsConceded;
        private int wickets;
        private double economy;
        private double average;

        public BowlingByVenue() {
            super();
        }

        public int getVenueId() {
            return venueId;
        }

        public void setVenueId(int venueId) {
            this.venueId = venueId;
        }

        public String getVenue() {
            return venue;
        }

        public void setVenue(String venue) {
            this.venue = venue;
        }

        public int getMatches() {
            return matches;
        }

        public void setMatches(int matches) {
            this.matches = matches;
        }

        public double getOvers() {
            return overs;
        }

        public void setOvers(double overs) {
            this.overs = overs;
        }

        public int getRunsConceded() {
            return runsConceded;
        }

        public void setRunsConceded(int runsConceded) {
            this.runsConceded = runsConceded;
        }

        public int getWickets() {
            return wickets;
        }

        public void setWickets(int wickets) {
            this.wickets = wickets;
        }

        public double getEconomy() {
            return economy;
        }

        public void setEconomy(double economy) {
            this.economy = economy;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "BowlingByVenue [venueId=" + venueId + ", venue=" + venue
                    + ", matches=" + matches + ", overs=" + overs + ", runsConceded=" + runsConceded
                    + ", wickets=" + wickets + ", economy=" + economy + ", average=" + average + "]";
        }
    }
}