package com.mph.entitybeans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prjMilestone")
public class PrjMilestone implements Serializable {
	private int msID;
	private int prjID;
	private String msName;
	private String msDesc;
	private Date msDeadline;
	
	@Id
	@GeneratedValue
	@Column(name="msID")
	public int getMsID(){
		return msID;
	}
	public void setMsID(int msID){
		this.msID = msID;
	}
	
	@Column(name="prjID")
	public int getPrjID(){
		return prjID;
	}
	public void setPrjID(int prjID){
		this.prjID = prjID;
	}
	
	@Column(name="msName")
	public String getMsName(){
		return msName;
	}
	public void setMsName(String msName){
		this.msName = msName;
	}
	
	@Column(name="msDesc")
	public String getMsDesc(){
		return msDesc;
	}
	public void setMsDesc(String msDesc){
		this.msDesc = msDesc;
	}
	
	@Column(name="msDeadline")
	public Date getMsDeadline(){
		return msDeadline;
	}
	public void setMsDeadline(Date msDeadline){
		this.msDeadline = msDeadline;
	}
	
}
