package com.mentorondemand.OutReachReporting.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="eventinformation")
public class EventInfo {

	//@Id
	private Long eventid;
	private String beneficiaryname;
	private String bsaelocation;
	private String eventname;
	private String council;
	private String eventdec;
	
	private String eventdate;
	private int employeeid;
	private int volunteerhrs;
	private int travelhrs;
	private int livesimpacted;
	private String bu;
	private String status;
	private String category;
	
	public String getBeneficiaryname() {
		return beneficiaryname;
	}
	public void setBeneficiaryname(String beneficiaryname) {
		this.beneficiaryname = beneficiaryname;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getEventdec() {
		return eventdec;
	}
	public void setEventdec(String eventdec) {
		this.eventdec = eventdec;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	public int getEmployeeId() {
		return employeeid;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeid = employeeId;
	}
	public int getVolunteerhrs() {
		return volunteerhrs;
	}
	public void setVolunteerhrs(int volunteerhrs) {
		this.volunteerhrs = volunteerhrs;
	}
	public int getTravelhrs() {
		return travelhrs;
	}
	public void setTravelhrs(int travelhrs) {
		this.travelhrs = travelhrs;
	}
	public int getLivesimpacted() {
		return livesimpacted;
	}
	public void setLivesimpacted(int livesimpacted) {
		this.livesimpacted = livesimpacted;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getEventId() {
		return eventid;
	}
	public void setEventId(Long eventId) {
		this.eventid = eventId;
	}
	public String getMonth() {
		return beneficiaryname;
	}
	public void setMonth(String month) {
		this.beneficiaryname = month;
	}
	public String getBsaeLocation() {
		return bsaelocation;
	}
	public void setBsaeLocation(String bsaeLocation) {
		this.bsaelocation = bsaeLocation;
	}
	public String getAddress() {
		return eventname;
	}
	public void setAddress(String address) {
		this.eventname = address;
	}
	public String getCouncil() {
		return council;
	}
	public void setCouncil(String council) {
		this.council = council;
	}
	public String getProject() {
		return eventdec;
	}
	public void setProject(String project) {
		this.eventdec = project;
	}
	public String toString() {
		return eventid +"|"+eventname;
		
	}
	
}

