package com.cricket.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cricket.dao.CricketDao;
import com.cricket.model.*;
import com.cricket.util.CricketUtil;

@Repository("cricketDao")
public class CricketDaoImpl implements CricketDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private SessionFactory sessionFactorySecondaryDb;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    private Session getSecondarySession() {
        return sessionFactorySecondaryDb.getCurrentSession();
    }

    private <T> List<T> getAll(Class<T> clazz) {
        return getSession().createQuery("FROM " + clazz.getSimpleName(), clazz).list();
    }

    private <T> T getById(Class<T> clazz, String fieldName, Object value) {
        return getSession()
                .createQuery("FROM " + clazz.getSimpleName() + " e WHERE e." + fieldName + " = :val", clazz)
                .setParameter("val", value)
                .uniqueResult();
    }

    @Override
    public Player getPlayer(String whatToProcess, String valueToProcess) {
        if (CricketUtil.PLAYER.equals(whatToProcess)) {
            return getById(Player.class, "playerId", Integer.parseInt(valueToProcess));
        }
        return null;
    }

    @Override
    public List<Player> getPlayers(String whatToProcess, String valueToProcess) {

        if (CricketUtil.TEAM.equals(whatToProcess)) {
            return getSession()
                    .createQuery("FROM Player p WHERE p.teamId = :teamId", Player.class)
                    .setParameter("teamId", Integer.parseInt(valueToProcess))
                    .list();
        }

        if (CricketUtil.GENDER_SPECIFIC_TEAM.equals(whatToProcess) && valueToProcess.contains(",")) {

            String[] parts = valueToProcess.split(",");
            int teamId = Integer.parseInt(parts[0]);
            String gender = parts[1];

            return getSession()
                    .createQuery("FROM Player p WHERE p.teamId = :teamId AND p.gender = :gender", Player.class)
                    .setParameter("teamId", teamId)
                    .setParameter("gender", gender)
                    .list();
        }

        return null;
    }

    @Override
    public List<Player> getAllPlayer() {
        return getAll(Player.class);
    }

    @Override
    public List<Player> getArchivePlayers() {
        return getSecondarySession()
                .createQuery("FROM Player", Player.class)
                .list();
    }

    @Override
    public Team getTeam(String whatToProcess, String valueToProcess) {
        if (CricketUtil.TEAM.equals(whatToProcess)) {
            return getById(Team.class, "teamId", Integer.parseInt(valueToProcess));
        }
        return null;
    }

    @Override
    public List<Team> getTeams() {
        return getAll(Team.class);
    }

    @Override public List<Ground> getGrounds() { return getAll(Ground.class); }
    @Override public List<NameSuper> getNameSupers() { return getAll(NameSuper.class); }
    @Override public List<InfobarStats> getInfobarStats() { return getAll(InfobarStats.class); }
    @Override public List<Sponsor> getSponsor() { return getAll(Sponsor.class); }
    @Override public List<FantasyImages> getFantasyImages() { return getAll(FantasyImages.class); }
    @Override public List<Bugs> getBugs() { return getAll(Bugs.class); }
    @Override public List<EverestBugs> getEverestBugs() { return getAll(EverestBugs.class); }
    @Override public List<LeaderBoard> getLeaderBoards() { return getAll(LeaderBoard.class); }
    @Override public List<Split> getSplit() { return getAll(Split.class); }
    @Override public List<Statistics> getAllStats() { return getAll(Statistics.class); }
    @Override public List<Fixture> getFixtures() { return getAll(Fixture.class); }
    @Override public List<VariousText> getVariousTexts() { return getAll(VariousText.class); }
    @Override public List<Venue> getVenues() { return getAll(Venue.class); }
    @Override public List<Dictionary> getDictionary() { return getAll(Dictionary.class); }
    @Override public List<Playoff> getPlayOff() { return getAll(Playoff.class); }
    @Override public List<Season> getSeasons() { return getAll(Season.class); }
    @Override public List<Pointers> getPointers() { return getAll(Pointers.class); }
    @Override public List<StatsType> getAllStatsType() { return getAll(StatsType.class); }
    @Override public List<Commentator> getCommentator() { return getAll(Commentator.class); }
    @Override public List<Staff> getStaff() { return getAll(Staff.class); }
    @Override public List<POTT> getPott() { return getAll(POTT.class); }
    @Override public List<Performer> getPerformer() { return getAll(Performer.class); }
    @Override public List<Weather> getWeather() { return getAll(Weather.class); }
    @Override public List<PerformanceBug> getPerformanceBugs() { return getAll(PerformanceBug.class); }

    @Override
    public Ground getGround(int groundId) {
        return getById(Ground.class, "groundId", groundId);
    }

    @Override
    public StatsType getStatsType(int statsTypeId) {
    	System.out.println("statsTypeId = " + statsTypeId);
        return getById(StatsType.class, "statsId", statsTypeId);
    }
}