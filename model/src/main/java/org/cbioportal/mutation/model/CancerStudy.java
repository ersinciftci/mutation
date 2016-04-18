package org.cbioportal.mutation.model;

import java.util.Date;


public class CancerStudy {

	private int cancerStudyId;
	private String cancerStudyIdentifier;
	private String citation;
	private String description;
	private String groups;
	private Date importDate;
	private String name;
	private String pmid;
	private boolean publicStudy;
	private String shortName;
	private Integer status;
	private TypeOfCancer typeOfCancer;

	public CancerStudy() {
	}

	public int getCancerStudyId() {
		return this.cancerStudyId;
	}

	public void setCancerStudyId(int cancerStudyId) {
		this.cancerStudyId = cancerStudyId;
	}

	public String getCancerStudyIdentifier() {
		return this.cancerStudyIdentifier;
	}

	public void setCancerStudyIdentifier(String cancerStudyIdentifier) {
		this.cancerStudyIdentifier = cancerStudyIdentifier;
	}

	public String getCitation() {
		return this.citation;
	}

	public void setCitation(String citation) {
		this.citation = citation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroups() {
		return this.groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public Date getImportDate() {
		return this.importDate;
	}

	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPmid() {
		return this.pmid;
	}

	public void setPmid(String pmid) {
		this.pmid = pmid;
	}

	public boolean getPublicStudy() {
		return this.publicStudy;
	}

	public void setPublicStudy(boolean publicStudy) {
		this.publicStudy = publicStudy;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public TypeOfCancer getTypeOfCancer() {
		return this.typeOfCancer;
	}

	public void setTypeOfCancer(TypeOfCancer typeOfCancer) {
		this.typeOfCancer = typeOfCancer;
	}

}