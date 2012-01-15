package com.mph.entitybeans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teams")
public class Teams implements Serializable {
	private int teamID;
	private int prjID;
		// means 1 teamID 1projectID
	private String teamName;
	private int members;
		// current member count
	private int score;
		// final score with penalty applied
	
	@Id
	@GeneratedValue
	@Column(name="teamID")
	public int getTeamID (){
		return teamID;
	}
	public void setTeamID (int teamID){
		this.teamID = teamID ;
	}
	
	@Column(name="prjID")
	public int getPrjID (){
		return prjID;
	}
	public void setPrjID (int prjID){
		this.prjID = prjID ;
	}
	
	@Column(name="teamName")
	public String getTeamName (){
		return teamName;
	}
	public void setTeamName (String teamName){
		this.teamName = teamName ;
	}
	
	@Column(name="members")
	public int getMembers (){
		return members;
	}
	public void setMembers (){
		this.members++ ;
	}
	
	@Column(name="score")
	public int getScore (){
		return score;
	}
	public void setScore (int score){
		this.score = score ;
	}
}
