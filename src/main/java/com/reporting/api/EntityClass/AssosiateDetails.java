package com.reporting.api.EntityClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "associatedetails_tbl")

public class AssosiateDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Associate_id")
	private Integer Associate_id;

	@Column(name = "Associate_Name")
	private String Associate_Name;

	@Column(name = "Designation")
	private String Designation;

	@Column(name = "Location")
	private String Location;

	@Column(name = "BU")
	private String BU;

	public Integer getAssociate_id() {
		return Associate_id;
	}

	public void setAssociate_id(Integer associate_id) {
		Associate_id = associate_id;
	}

	public String getAssociate_Name() {
		return Associate_Name;
	}

	public void setAssociate_Name(String associate_Name) {
		Associate_Name = associate_Name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getBU() {
		return BU;
	}

	public void setBU(String bU) {
		BU = bU;
	}

	@Override
	public String toString() {
		return "AssosiateDetails [Associate_id=" + Associate_id + ", Associate_Name=" + Associate_Name
				+ ", Designation=" + Designation + ", Location=" + Location + ", BU=" + BU + "]";
	}

}
