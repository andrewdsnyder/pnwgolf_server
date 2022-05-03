package com.revature.pnwgolf.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scoring")
public class Scoring {

	@Id
	@Column(name = "local_date", columnDefinition = "DATE")
	private LocalDate localDate;
	
	@Column(name = "round_score")
	private int roundScore;


	@Column(name = "playerId")
	private String playerId; // to call user table

	@Column(name = "course_id")
	private int courseId; // to call course table

	@Column(name = "hole_1_score")
	private int hole1Score;

	@Column(name = "hole_2_score")
	private int hole2Score;

	@Column(name = "hole_3_score")
	private int hole3Score;

	@Column(name = "hole_4_score")
	private int hole4Score;

	@Column(name = "hole_5_score")
	private int hole5Score;

	@Column(name = "hole_6_score")
	private int hole6Score;

	@Column(name = "hole_7_score")
	private int hole7Score;

	@Column(name = "hole_8_score")
	private int hole8Score;

	@Column(name = "hole_9_score")
	private int hole9Score;

	@Column(name = "hole_10_score")
	private int hole10Score;

	@Column(name = "hole_11_score")
	private int hole11Score;

	@Column(name = "hole_12_score")
	private int hole12Score;

	@Column(name = "hole_13_score")
	private int hole13Score;

	@Column(name = "hole_14_score")
	private int hole14Score;

	@Column(name = "hole_15_score")
	private int hole15Score;

	@Column(name = "hole_16_score")
	private int hole16Score;

	@Column(name = "hole_17_score")
	private int hole17Score;

	@Column(name = "hole_18_score")
	private int hole18Score;

	@Override
	public String toString() {
		return "Scoring [roundScore=" + roundScore + ", localDate=" + localDate + ", playerId=" + playerId
				+ ", courseId=" + courseId + ", hole1Score=" + hole1Score + ", hole2Score=" + hole2Score
				+ ", hole3Score=" + hole3Score + ", hole4Score=" + hole4Score + ", hole5Score=" + hole5Score
				+ ", hole6Score=" + hole6Score + ", hole7Score=" + hole7Score + ", hole8Score=" + hole8Score
				+ ", hole9Score=" + hole9Score + ", hole10Score=" + hole10Score + ", hole11Score=" + hole11Score
				+ ", hole12Score=" + hole12Score + ", hole13Score=" + hole13Score + ", hole14Score=" + hole14Score
				+ ", hole15Score=" + hole15Score + ", hole16Score=" + hole16Score + ", hole17Score=" + hole17Score
				+ ", hole18Score=" + hole18Score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseId, hole10Score, hole11Score, hole12Score, hole13Score, hole14Score, hole15Score,
				hole16Score, hole17Score, hole18Score, hole1Score, hole2Score, hole3Score, hole4Score, hole5Score,
				hole6Score, hole7Score, hole8Score, hole9Score, localDate, playerId, roundScore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scoring other = (Scoring) obj;
		return courseId == other.courseId && hole10Score == other.hole10Score && hole11Score == other.hole11Score
				&& hole12Score == other.hole12Score && hole13Score == other.hole13Score
				&& hole14Score == other.hole14Score && hole15Score == other.hole15Score
				&& hole16Score == other.hole16Score && hole17Score == other.hole17Score
				&& hole18Score == other.hole18Score && hole1Score == other.hole1Score && hole2Score == other.hole2Score
				&& hole3Score == other.hole3Score && hole4Score == other.hole4Score && hole5Score == other.hole5Score
				&& hole6Score == other.hole6Score && hole7Score == other.hole7Score && hole8Score == other.hole8Score
				&& hole9Score == other.hole9Score && Objects.equals(localDate, other.localDate)
				&& playerId == other.playerId && roundScore == other.roundScore;
	}

	public int getRoundScore() {
		return roundScore;
	}

	public void setRoundScore(int roundScore) {
		this.roundScore = roundScore;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getHole1Score() {
		return hole1Score;
	}

	public void setHole1Score(int hole1Score) {
		this.hole1Score = hole1Score;
	}

	public int getHole2Score() {
		return hole2Score;
	}

	public void setHole2Score(int hole2Score) {
		this.hole2Score = hole2Score;
	}

	public int getHole3Score() {
		return hole3Score;
	}

	public void setHole3Score(int hole3Score) {
		this.hole3Score = hole3Score;
	}

	public int getHole4Score() {
		return hole4Score;
	}

	public void setHole4Score(int hole4Score) {
		this.hole4Score = hole4Score;
	}

	public int getHole5Score() {
		return hole5Score;
	}

	public void setHole5Score(int hole5Score) {
		this.hole5Score = hole5Score;
	}

	public int getHole6Score() {
		return hole6Score;
	}

	public void setHole6Score(int hole6Score) {
		this.hole6Score = hole6Score;
	}

	public int getHole7Score() {
		return hole7Score;
	}

	public void setHole7Score(int hole7Score) {
		this.hole7Score = hole7Score;
	}

	public int getHole8Score() {
		return hole8Score;
	}

	public void setHole8Score(int hole8Score) {
		this.hole8Score = hole8Score;
	}

	public int getHole9Score() {
		return hole9Score;
	}

	public void setHole9Score(int hole9Score) {
		this.hole9Score = hole9Score;
	}

	public int getHole10Score() {
		return hole10Score;
	}

	public void setHole10Score(int hole10Score) {
		this.hole10Score = hole10Score;
	}

	public int getHole11Score() {
		return hole11Score;
	}

	public void setHole11Score(int hole11Score) {
		this.hole11Score = hole11Score;
	}

	public int getHole12Score() {
		return hole12Score;
	}

	public void setHole12Score(int hole12Score) {
		this.hole12Score = hole12Score;
	}

	public int getHole13Score() {
		return hole13Score;
	}

	public void setHole13Score(int hole13Score) {
		this.hole13Score = hole13Score;
	}

	public int getHole14Score() {
		return hole14Score;
	}

	public void setHole14Score(int hole14Score) {
		this.hole14Score = hole14Score;
	}

	public int getHole15Score() {
		return hole15Score;
	}

	public void setHole15Score(int hole15Score) {
		this.hole15Score = hole15Score;
	}

	public int getHole16Score() {
		return hole16Score;
	}

	public void setHole16Score(int hole16Score) {
		this.hole16Score = hole16Score;
	}

	public int getHole17Score() {
		return hole17Score;
	}

	public void setHole17Score(int hole17Score) {
		this.hole17Score = hole17Score;
	}

	public int getHole18Score() {
		return hole18Score;
	}

	public void setHole18Score(int hole18Score) {
		this.hole18Score = hole18Score;
	}

	public Scoring(int roundScore, LocalDate localDate, int courseId, int hole1Score, int hole2Score, int hole3Score,
			int hole4Score, int hole5Score, int hole6Score, int hole7Score, int hole8Score, int hole9Score,
			int hole10Score, int hole11Score, int hole12Score, int hole13Score, int hole14Score, int hole15Score,
			int hole16Score, int hole17Score, int hole18Score) {
		super();
		this.roundScore = roundScore;
		this.localDate = localDate;
		this.courseId = courseId;
		this.hole1Score = hole1Score;
		this.hole2Score = hole2Score;
		this.hole3Score = hole3Score;
		this.hole4Score = hole4Score;
		this.hole5Score = hole5Score;
		this.hole6Score = hole6Score;
		this.hole7Score = hole7Score;
		this.hole8Score = hole8Score;
		this.hole9Score = hole9Score;
		this.hole10Score = hole10Score;
		this.hole11Score = hole11Score;
		this.hole12Score = hole12Score;
		this.hole13Score = hole13Score;
		this.hole14Score = hole14Score;
		this.hole15Score = hole15Score;
		this.hole16Score = hole16Score;
		this.hole17Score = hole17Score;
		this.hole18Score = hole18Score;
	}

	public Scoring(int roundScore, LocalDate localDate,  int courseId, String playerId, int hole1Score, int hole2Score,
			int hole3Score, int hole4Score, int hole5Score, int hole6Score, int hole7Score, int hole8Score,
			int hole9Score, int hole10Score, int hole11Score, int hole12Score, int hole13Score, int hole14Score,
			int hole15Score, int hole16Score, int hole17Score, int hole18Score) {
		super();
		this.roundScore = roundScore;
		this.localDate = localDate;
		this.playerId = playerId;
		this.courseId = courseId;
		this.hole1Score = hole1Score;
		this.hole2Score = hole2Score;
		this.hole3Score = hole3Score;
		this.hole4Score = hole4Score;
		this.hole5Score = hole5Score;
		this.hole6Score = hole6Score;
		this.hole7Score = hole7Score;
		this.hole8Score = hole8Score;
		this.hole9Score = hole9Score;
		this.hole10Score = hole10Score;
		this.hole11Score = hole11Score;
		this.hole12Score = hole12Score;
		this.hole13Score = hole13Score;
		this.hole14Score = hole14Score;
		this.hole15Score = hole15Score;
		this.hole16Score = hole16Score;
		this.hole17Score = hole17Score;
		this.hole18Score = hole18Score;
	}
}
