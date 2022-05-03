package com.revature.pnwgolf.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.revature.pnwgolf.models.Scoring;

public interface ScoringDao extends CrudRepository<Scoring, Integer> {
	
	//Optional<Scoring> findScoringByPlayerId(String playerId);
	
	@Query(nativeQuery=true, value="SELECT * FROM scoring s WHERE s.player_id = :playerId")
	List<Scoring> findScoringByPlayerId(String playerId);
	
	@Query(nativeQuery=true, value="SELECT * FROM scoring s WHERE course_id=? and s.player_id = :playerId")
    List<Scoring> findScoringByCourseIdAndPlayerId();
	
	public Scoring addScore(Scoring scoring);
	  public void updateScoring(Scoring scoring);
	  public boolean deleteScoring(int id);
}
