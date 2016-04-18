package org.cbioportal.mutation.model;


public class TypeOfCancer {

	private String typeOfCancerId;
	private String clinicalTrialKeywords;
	private String dedicatedColor;
	private String name;
	private String parent;
	private String shortName;

	public TypeOfCancer() {
	}

	public String getTypeOfCancerId() {
		return this.typeOfCancerId;
	}

	public void setTypeOfCancerId(String typeOfCancerId) {
		this.typeOfCancerId = typeOfCancerId;
	}

	public String getClinicalTrialKeywords() {
		return this.clinicalTrialKeywords;
	}

	public void setClinicalTrialKeywords(String clinicalTrialKeywords) {
		this.clinicalTrialKeywords = clinicalTrialKeywords;
	}

	public String getDedicatedColor() {
		return this.dedicatedColor;
	}

	public void setDedicatedColor(String dedicatedColor) {
		this.dedicatedColor = dedicatedColor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParent() {
		return this.parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}