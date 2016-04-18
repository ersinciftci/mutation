package org.cbioportal.mutation.model;


public class Patient {

	private int internalId;
	private String stableId;
	private CancerStudy cancerStudy;

	public Patient() {
	}

	public int getInternalId() {
		return this.internalId;
	}

	public void setInternalId(int internalId) {
		this.internalId = internalId;
	}

	public String getStableId() {
		return this.stableId;
	}

	public void setStableId(String stableId) {
		this.stableId = stableId;
	}

	public CancerStudy getCancerStudy() {
		return this.cancerStudy;
	}

	public void setCancerStudy(CancerStudy cancerStudy) {
		this.cancerStudy = cancerStudy;
	}

}