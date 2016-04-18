package org.cbioportal.mutation.model;


public class Sample {

	private int internalId;
	private String sampleType;
	private String stableId;
	private Patient patient;

	public Sample() {
	}

	public int getInternalId() {
		return this.internalId;
	}

	public void setInternalId(int internalId) {
		this.internalId = internalId;
	}

	public String getSampleType() {
		return this.sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	public String getStableId() {
		return this.stableId;
	}

	public void setStableId(String stableId) {
		this.stableId = stableId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}