/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.bl;

import entity.GameStatistics;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student
 */
@Local
public interface GameStatisticsFacadeLocal {

    void create(GameStatistics gameStatistics);

    void edit(GameStatistics gameStatistics);

    void remove(GameStatistics gameStatistics);

    GameStatistics find(Object id);

    List<GameStatistics> findAll();

    List<GameStatistics> findRange(int[] range);

    int count();
    
    // JPQL 
    List<String> viewGameStatsOfSpecificPlayers(String playerName);
    
    List<String> viewNamesOfAllPlayersThatWonAgainstSiri();
    
    
}
