package com.mph.entitybeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="team_student")
public class TeamStudent {
	private int teamID;
	private int studentID;
	
	@Column(name="teamID")
	public int getTeamID(){
		return teamID;
	}
	public void setTeamID(int teamID){
		this.teamID = teamID;
	}
	
	@Column(name="studentID")
	public int getStudentID(){
		return studentID;
	}
	public void setStudentID(int studentID){
		this.studentID = studentID;
	}
}
