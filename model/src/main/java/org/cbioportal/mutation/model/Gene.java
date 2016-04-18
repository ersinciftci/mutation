package org.cbioportal.mutation.model;


public class Gene {

	private int entrezGeneId;
	private String cytoband;
	private String hugoGeneSymbol;
	private int length;
	private String type;

	public Gene() {
	}

	public int getEntrezGeneId() {
		return this.entrezGeneId;
	}

	public void setEntrezGeneId(int entrezGeneId) {
		this.entrezGeneId = entrezGeneId;
	}

	public String getCytoband() {
		return this.cytoband;
	}

	public void setCytoband(String cytoband) {
		this.cytoband = cytoband;
	}

	public String getHugoGeneSymbol() {
		return this.hugoGeneSymbol;
	}

	public void setHugoGeneSymbol(String hugoGeneSymbol) {
		this.hugoGeneSymbol = hugoGeneSymbol;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}