package org.cbioportal.mutation.model;


public class GeneticProfile {

	private int geneticProfileId;
	private String datatype;
	private String description;
	private String geneticAlterationType;
	private String name;
	private byte[] showProfileInAnalysisTab;
	private String stableId;
	private CancerStudy cancerStudy;

	public GeneticProfile() {
	}

	public int getGeneticProfileId() {
		return this.geneticProfileId;
	}

	public void setGeneticProfileId(int geneticProfileId) {
		this.geneticProfileId = geneticProfileId;
	}

	public String getDatatype() {
		return this.datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGeneticAlterationType() {
		return this.geneticAlterationType;
	}

	public void setGeneticAlterationType(String geneticAlterationType) {
		this.geneticAlterationType = geneticAlterationType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getShowProfileInAnalysisTab() {
		return this.showProfileInAnalysisTab;
	}

	public void setShowProfileInAnalysisTab(byte[] showProfileInAnalysisTab) {
		this.showProfileInAnalysisTab = showProfileInAnalysisTab;
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