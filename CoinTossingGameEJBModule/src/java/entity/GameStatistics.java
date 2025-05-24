/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Student
 */
@Entity
public class GameStatistics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Integer playerId;
    
    private String playerName;
    
    private Integer totNumGamesPlayed;
    
    private Integer totNumGamesSiriWon;
    
    private Integer totNumGamesPlayerWon;
    
    @ElementCollection
    @CollectionTable(name = "SIRI_TOSS_TBL")
    private List<String> listofSiriToss;
    
    @ElementCollection
    @CollectionTable(name = "PLAYER_GUESS_TBL")
    private List<String> listofPlayerGuess;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public GameStatistics() {
    }

    public GameStatistics(Integer playerId, String playerName, Integer totNumGamesPlayed, Integer totNumGamesSiriWon, Integer totNumGamesPlayerWon, List<String> listofSiriToss, List<String> listofPlayerGuess) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.totNumGamesPlayed = totNumGamesPlayed;
        this.totNumGamesSiriWon = totNumGamesSiriWon;
        this.totNumGamesPlayerWon = totNumGamesPlayerWon;
        this.listofSiriToss = listofSiriToss;
        this.listofPlayerGuess = listofPlayerGuess;
        this.creationDate = new Date();
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getTotNumGamesPlayed() {
        return totNumGamesPlayed;
    }

    public void setTotNumGamesPlayed(Integer totNumGamesPlayed) {
        this.totNumGamesPlayed = totNumGamesPlayed;
    }

    public Integer getTotNumGamesSiriWon() {
        return totNumGamesSiriWon;
    }

    public void setTotNumGamesSiriWon(Integer totNumGamesSiriWon) {
        this.totNumGamesSiriWon = totNumGamesSiriWon;
    }

    public Integer getTotNumGamesPlayerWon() {
        return totNumGamesPlayerWon;
    }

    public void setTotNumGamesPlayerWon(Integer totNumGamesPlayerWon) {
        this.totNumGamesPlayerWon = totNumGamesPlayerWon;
    }

    public List<String> getListofSiriToss() {
        return listofSiriToss;
    }

    public void setListofSiriToss(List<String> listofSiriToss) {
        this.listofSiriToss = listofSiriToss;
    }

    public List<String> getListofPlayerGuess() {
        return listofPlayerGuess;
    }

    public void setListofPlayerGuess(List<String> listofPlayerGuess) {
        this.listofPlayerGuess = listofPlayerGuess;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GameStatistics)) {
            return false;
        }
        GameStatistics other = (GameStatistics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.GameStatistics[ id=" + id + " ]";
    }
    
}
