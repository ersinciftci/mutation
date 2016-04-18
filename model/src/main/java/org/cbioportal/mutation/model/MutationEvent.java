package org.cbioportal.mutation.model;

import java.math.BigInteger;


public class MutationEvent {

	private int mutationEventId;
	private byte canonicalTranscript;
	private String chr;
	private String dbSnpRs;
	private String dbSnpValStatus;
	private BigInteger endPosition;
	private float fisValue;
	private String functionalImpactScore;
	private String keyword;
	private String linkMsa;
	private String linkPdb;
	private String linkXvar;
	private String mutationType;
	private String ncbiBuild;
	private String oncotatorCodonChange;
	private String oncotatorDbsnpRs;
	private int oncotatorProteinPosEnd;
	private int oncotatorProteinPosStart;
	private String oncotatorRefseqMrnaId;
	private String oncotatorUniprotAccession;
	private String oncotatorUniprotEntryName;
	private String proteinChange;
	private String referenceAllele;
	private BigInteger startPosition;
	private String strand;
	private String tumorSeqAllele;
	private String variantType;
	private Gene gene;

	public MutationEvent() {
	}

	public int getMutationEventId() {
		return this.mutationEventId;
	}

	public void setMutationEventId(int mutationEventId) {
		this.mutationEventId = mutationEventId;
	}

	public byte getCanonicalTranscript() {
		return this.canonicalTranscript;
	}

	public void setCanonicalTranscript(byte canonicalTranscript) {
		this.canonicalTranscript = canonicalTranscript;
	}

	public String getChr() {
		return this.chr;
	}

	public void setChr(String chr) {
		this.chr = chr;
	}

	public String getDbSnpRs() {
		return this.dbSnpRs;
	}

	public void setDbSnpRs(String dbSnpRs) {
		this.dbSnpRs = dbSnpRs;
	}

	public String getDbSnpValStatus() {
		return this.dbSnpValStatus;
	}

	public void setDbSnpValStatus(String dbSnpValStatus) {
		this.dbSnpValStatus = dbSnpValStatus;
	}

	public BigInteger getEndPosition() {
		return this.endPosition;
	}

	public void setEndPosition(BigInteger endPosition) {
		this.endPosition = endPosition;
	}

	public float getFisValue() {
		return this.fisValue;
	}

	public void setFisValue(float fisValue) {
		this.fisValue = fisValue;
	}

	public String getFunctionalImpactScore() {
		return this.functionalImpactScore;
	}

	public void setFunctionalImpactScore(String functionalImpactScore) {
		this.functionalImpactScore = functionalImpactScore;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getLinkMsa() {
		return this.linkMsa;
	}

	public void setLinkMsa(String linkMsa) {
		this.linkMsa = linkMsa;
	}

	public String getLinkPdb() {
		return this.linkPdb;
	}

	public void setLinkPdb(String linkPdb) {
		this.linkPdb = linkPdb;
	}

	public String getLinkXvar() {
		return this.linkXvar;
	}

	public void setLinkXvar(String linkXvar) {
		this.linkXvar = linkXvar;
	}

	public String getMutationType() {
		return this.mutationType;
	}

	public void setMutationType(String mutationType) {
		this.mutationType = mutationType;
	}

	public String getNcbiBuild() {
		return this.ncbiBuild;
	}

	public void setNcbiBuild(String ncbiBuild) {
		this.ncbiBuild = ncbiBuild;
	}

	public String getOncotatorCodonChange() {
		return this.oncotatorCodonChange;
	}

	public void setOncotatorCodonChange(String oncotatorCodonChange) {
		this.oncotatorCodonChange = oncotatorCodonChange;
	}

	public String getOncotatorDbsnpRs() {
		return this.oncotatorDbsnpRs;
	}

	public void setOncotatorDbsnpRs(String oncotatorDbsnpRs) {
		this.oncotatorDbsnpRs = oncotatorDbsnpRs;
	}

	public int getOncotatorProteinPosEnd() {
		return this.oncotatorProteinPosEnd;
	}

	public void setOncotatorProteinPosEnd(int oncotatorProteinPosEnd) {
		this.oncotatorProteinPosEnd = oncotatorProteinPosEnd;
	}

	public int getOncotatorProteinPosStart() {
		return this.oncotatorProteinPosStart;
	}

	public void setOncotatorProteinPosStart(int oncotatorProteinPosStart) {
		this.oncotatorProteinPosStart = oncotatorProteinPosStart;
	}

	public String getOncotatorRefseqMrnaId() {
		return this.oncotatorRefseqMrnaId;
	}

	public void setOncotatorRefseqMrnaId(String oncotatorRefseqMrnaId) {
		this.oncotatorRefseqMrnaId = oncotatorRefseqMrnaId;
	}

	public String getOncotatorUniprotAccession() {
		return this.oncotatorUniprotAccession;
	}

	public void setOncotatorUniprotAccession(String oncotatorUniprotAccession) {
		this.oncotatorUniprotAccession = oncotatorUniprotAccession;
	}

	public String getOncotatorUniprotEntryName() {
		return this.oncotatorUniprotEntryName;
	}

	public void setOncotatorUniprotEntryName(String oncotatorUniprotEntryName) {
		this.oncotatorUniprotEntryName = oncotatorUniprotEntryName;
	}

	public String getProteinChange() {
		return this.proteinChange;
	}

	public void setProteinChange(String proteinChange) {
		this.proteinChange = proteinChange;
	}

	public String getReferenceAllele() {
		return this.referenceAllele;
	}

	public void setReferenceAllele(String referenceAllele) {
		this.referenceAllele = referenceAllele;
	}

	public BigInteger getStartPosition() {
		return this.startPosition;
	}

	public void setStartPosition(BigInteger startPosition) {
		this.startPosition = startPosition;
	}

	public String getStrand() {
		return this.strand;
	}

	public void setStrand(String strand) {
		this.strand = strand;
	}

	public String getTumorSeqAllele() {
		return this.tumorSeqAllele;
	}

	public void setTumorSeqAllele(String tumorSeqAllele) {
		this.tumorSeqAllele = tumorSeqAllele;
	}

	public String getVariantType() {
		return this.variantType;
	}

	public void setVariantType(String variantType) {
		this.variantType = variantType;
	}

	public Gene getGene() {
		return this.gene;
	}

	public void setGene(Gene gene) {
		this.gene = gene;
	}

}