package com.revature.pnwgolf.services;

import java.util.List;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.pnwgolf.models.Scoring;
import com.revature.pnwgolf.repository.ScoringDao;


@Service
public class ScoringService {
	private ScoringDao scoringDao;
	
	public ScoringService() {
		
	}
	
	@Autowired
	public ScoringService(ScoringDao scoringDao) {
		this.scoringDao = scoringDao;
	}
	
	@Transactional
	public void addNewScore(Scoring scoring) {
		Scoring newScoring = new Scoring(
				
				scoring.getRoundScore(),
				scoring.getLocalDate(),
				scoring.getCourseId(),
				scoring.getPlayerId(),
				scoring.getHole1Score(),
				scoring.getHole2Score(),
				scoring.getHole3Score(),
				scoring.getHole4Score(),
				scoring.getHole5Score(),
				scoring.getHole6Score(),
				scoring.getHole7Score(),
				scoring.getHole8Score(),
				scoring.getHole9Score(),
				scoring.getHole10Score(),
				scoring.getHole11Score(),
				scoring.getHole12Score(),
				scoring.getHole13Score(),
				scoring.getHole14Score(),
				scoring.getHole15Score(),
				scoring.getHole16Score(),
				scoring.getHole17Score(),
				scoring.getHole18Score()
				);
		Scoring persistedScoring = scoringDao.save(newScoring);
		if(persistedScoring == null) {
			throw new PersistenceException("The score could not be persisted");
		}
	
	}
	@Transactional
	public List<Scoring> getScoringByPlayerId(String playerId){
		return scoringDao.findScoringByPlayerId(playerId);
	}
	
	@Transactional
	public List<Scoring> getScoringByCourseIdAndPlayerId(){
		return scoringDao.findScoringByCourseIdAndPlayerId();
	}
}

