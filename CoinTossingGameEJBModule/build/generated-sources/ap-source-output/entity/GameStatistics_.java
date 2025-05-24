package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-23T23:19:57")
@StaticMetamodel(GameStatistics.class)
public class GameStatistics_ { 

    public static volatile ListAttribute<GameStatistics, String> listofPlayerGuess;
    public static volatile SingularAttribute<GameStatistics, String> playerName;
    public static volatile SingularAttribute<GameStatistics, Integer> totNumGamesSiriWon;
    public static volatile SingularAttribute<GameStatistics, Integer> totNumGamesPlayerWon;
    public static volatile SingularAttribute<GameStatistics, Long> id;
    public static volatile ListAttribute<GameStatistics, String> listofSiriToss;
    public static volatile SingularAttribute<GameStatistics, Date> creationDate;
    public static volatile SingularAttribute<GameStatistics, Integer> playerId;
    public static volatile SingularAttribute<GameStatistics, Integer> totNumGamesPlayed;

}