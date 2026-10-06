package com.cricket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;

@Entity
@Table(name = "SubsStatsType")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubsStatsType {

  @Id
  @Column(name = "SUBSSTATSID")
  private Integer subsStatsId;
	
  @Column(name = "SUBSSTATSFULLNAME")
  private String subsStatsFullName;

  @Column(name = "SUBSSTATSSHORTNAME")
  private String subsStatsShortName;
  

  public Integer getSubsStatsId() {
	return subsStatsId;
  }

  public void setSubsStatsId(Integer subsStatsId) {
	this.subsStatsId = subsStatsId;
  }

  public String getSubsStatsFullName() {
	return subsStatsFullName;
  }

  public void setSubsStatsFullName(String subsStatsFullName) {
	this.subsStatsFullName = subsStatsFullName;
  }

  public String getSubsStatsShortName() {
	return subsStatsShortName;
  }

  public void setSubsStatsShortName(String subsStatsShortName) {
	this.subsStatsShortName = subsStatsShortName;
  }

}