/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.bl;

import entity.GameStatistics;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Student
 */
@Stateless
public class GameStatisticsFacade extends AbstractFacade<GameStatistics> implements GameStatisticsFacadeLocal {

    @PersistenceContext(unitName = "CoinTossingGameEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameStatisticsFacade() {
        super(GameStatistics.class);
    }

    @Override
    public List<String> viewGameStatsOfSpecificPlayers(String playerName) {
        String query = "SELECT g.playerName from GameStatistics g WHERE g.playerName = :playerName";
        Query queryObj = em.createQuery(query);
        queryObj.setParameter("playerName", playerName);
        List<String> playerNames = queryObj.getResultList();
        return playerNames;
    }

    @Override
    public List<String> viewNamesOfAllPlayersThatWonAgainstSiri() {
        String query = "SELECT g.playerName from GameStatistics g WHERE g.totNumGamesPlayerWon > g.totNumGamesSiriWon";
        Query queryObj = em.createQuery(query);
        List<String> names = queryObj.getResultList();
        return names;
    }
    
}
