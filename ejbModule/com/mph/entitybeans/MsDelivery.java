package com.mph.entitybeans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="msDelivery")
public class MsDelivery implements Serializable {
	private int teamID;
	private int prjID;
	private String link;
	private int dayDiff;
	private float score;
	
	@Column(name="teamID")
	public int getTeamID(){
		return teamID;
	}
	public void setTeamID(int teamID){
		this.teamID = teamID;
	}
	
	@Column(name="prjID")
	public int getPrjID(){
		return prjID;
	}
	public void setPrjID(int prjID){
		this.prjID = prjID;
	}
	
	@Column(name="link")
	public String getLink(){
		return link;
	}
	public void setLink(String link){
		this.link = link;
	}
	
	@Column(name="score")
	public float getScore(){
		return score;
	}
	public void setScore(float score){
		this.score = score;
	}
}
