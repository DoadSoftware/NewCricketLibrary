package com.cricket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;

@Entity
@Table(name = "StatsType")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatsType {

  @Id
  @Column(name = "STATSID")
  private Integer statsId;
	
  @Column(name = "STATSFULLNAME")
  private String statsFullName;

  @Column(name = "STATSSHORTNAME")
  private String statsShortName;

  public Integer getStatsId() {
	return statsId;
  }

  public void setStatsId(Integer statsId) {
	this.statsId = statsId;
  }

  public String getStatsFullName() {
	return statsFullName;
  }

  public void setStatsFullName(String statsFullName) {
	this.statsFullName = statsFullName;
  }

  public String getStatsShortName() {
	return statsShortName;
  }

  public void setStatsShortName(String statsShortName) {
	this.statsShortName = statsShortName;
  }

  @Override
  public String toString() {
	return "StatsType [statsId=" + statsId + ", statsFullName=" + statsFullName + ", statsShortName=" + statsShortName
			+ "]";
  }



}