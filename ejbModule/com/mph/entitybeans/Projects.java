package com.mph.entitybeans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Projects implements Serializable {
	private int prjID;
	private int profID;
	private String prjName;
	private String prjDesc;
	private Date prjDeadline;
	
	@Id
	@GeneratedValue
	@Column(name="prjID")
	public int getPrjID() {
		return prjID;
	}
	public void setPrjID(int prjID) {
		this.prjID = prjID;
	}
	
	@Column(name="profID")
	public int getProfID(){
		return profID;
	}
	public void setProjfID(int profID) {
		this.profID = profID;
	}
	
	@Column(name="prjName")
	public String getProjName(){
		return prjName;
	}
	public void setPrjName(String prjName){
		this.prjName = prjName;
	}
	
	@Column(name="prjDesc")
	public String getPrjDesc(){
		return prjDesc;
	}
	public void setPrjDesc(String prjDesc) {
		this.prjDesc = prjDesc;
	}
	
	@Column(name="prjDeadline")
	public Date getPrjDeadline(){
		return prjDeadline;
	}
	public void setPrjDeadline(Date prjDeadline){
		this.prjDeadline = prjDeadline;
	}
}
