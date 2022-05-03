package com.revature.pnwgolf.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course  {
	
	@Id
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="state")
	private String state;
	
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="par")
    private int par;
	
	@Column(name="hole_1")
	private int hole1;

	@Column(name="hole_2")
	private int hole2;
	
	@Column(name="hole_3")
	private int hole3;
	
	@Column(name="hole_4")
	private int hole4;
	
	@Column(name="hole_5")
	private int hole5;
	
	@Column(name="hole_6")
	private int hole6;
	
	@Column(name="hole_7")
	private int hole7;
	
	@Column(name="hole_8")
	private int hole8;
	
	@Column(name="hole_9")
	private int hole9;
	
	@Column(name="hole_10")
	private int hole10;
	
	@Column(name="hole_11")
	private int hole11;
	
	@Column(name="hole_12")
	private int hole12;
	
	@Column(name="hole_13")
	private int hole13;
	
	@Column(name="hole_14")
	private int hole14;
	
	@Column(name="hole_15")
	private int hole15;
	
	@Column(name="hole_16")
	private int hole16;
	
	@Column(name="hole_17")
	private int hole17;
	
	@Column(name="hole_18")
	private int hole18;
	



}