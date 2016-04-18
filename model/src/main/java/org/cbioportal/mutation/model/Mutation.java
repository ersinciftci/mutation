package org.cbioportal.mutation.model;


public class Mutation {

	private MutationPK id;
	private String aminoAcidChange;
	private String bamFile;
	private String center;
	private String matchNormSeqAllele1;
	private String matchNormSeqAllele2;
	private String matchNormValidationAllele1;
	private String matchNormValidationAllele2;
	private String matchedNormSampleBarcode;
	private String mutationStatus;
	private int normalAltCount;
	private int normalRefCount;
	private String score;
	private String sequenceSource;
	private String sequencer;
	private String sequencingPhase;
	private int tumorAltCount;
	private int tumorRefCount;
	private String tumorSeqAllele1;
	private String tumorSeqAllele2;
	private String tumorValidationAllele1;
	private String tumorValidationAllele2;
	private String validationMethod;
	private String validationStatus;
	private String verificationStatus;
	private MutationEvent mutationEvent;
	private GeneticProfile geneticProfile;
	private Sample sample;

	public Mutation() {
	}

	public MutationPK getId() {
		return id;
	}

	public void setId(MutationPK id) {
		this.id = id;
	}

	public String getAminoAcidChange() {
		return this.aminoAcidChange;
	}

	public void setAminoAcidChange(String aminoAcidChange) {
		this.aminoAcidChange = aminoAcidChange;
	}

	public String getBamFile() {
		return this.bamFile;
	}

	public void setBamFile(String bamFile) {
		this.bamFile = bamFile;
	}

	public String getCenter() {
		return this.center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getMatchNormSeqAllele1() {
		return this.matchNormSeqAllele1;
	}

	public void setMatchNormSeqAllele1(String matchNormSeqAllele1) {
		this.matchNormSeqAllele1 = matchNormSeqAllele1;
	}

	public String getMatchNormSeqAllele2() {
		return this.matchNormSeqAllele2;
	}

	public void setMatchNormSeqAllele2(String matchNormSeqAllele2) {
		this.matchNormSeqAllele2 = matchNormSeqAllele2;
	}

	public String getMatchNormValidationAllele1() {
		return this.matchNormValidationAllele1;
	}

	public void setMatchNormValidationAllele1(String matchNormValidationAllele1) {
		this.matchNormValidationAllele1 = matchNormValidationAllele1;
	}

	public String getMatchNormValidationAllele2() {
		return this.matchNormValidationAllele2;
	}

	public void setMatchNormValidationAllele2(String matchNormValidationAllele2) {
		this.matchNormValidationAllele2 = matchNormValidationAllele2;
	}

	public String getMatchedNormSampleBarcode() {
		return this.matchedNormSampleBarcode;
	}

	public void setMatchedNormSampleBarcode(String matchedNormSampleBarcode) {
		this.matchedNormSampleBarcode = matchedNormSampleBarcode;
	}

	public String getMutationStatus() {
		return this.mutationStatus;
	}

	public void setMutationStatus(String mutationStatus) {
		this.mutationStatus = mutationStatus;
	}

	public int getNormalAltCount() {
		return this.normalAltCount;
	}

	public void setNormalAltCount(int normalAltCount) {
		this.normalAltCount = normalAltCount;
	}

	public int getNormalRefCount() {
		return this.normalRefCount;
	}

	public void setNormalRefCount(int normalRefCount) {
		this.normalRefCount = normalRefCount;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getSequenceSource() {
		return this.sequenceSource;
	}

	public void setSequenceSource(String sequenceSource) {
		this.sequenceSource = sequenceSource;
	}

	public String getSequencer() {
		return this.sequencer;
	}

	public void setSequencer(String sequencer) {
		this.sequencer = sequencer;
	}

	public String getSequencingPhase() {
		return this.sequencingPhase;
	}

	public void setSequencingPhase(String sequencingPhase) {
		this.sequencingPhase = sequencingPhase;
	}

	public int getTumorAltCount() {
		return this.tumorAltCount;
	}

	public void setTumorAltCount(int tumorAltCount) {
		this.tumorAltCount = tumorAltCount;
	}

	public int getTumorRefCount() {
		return this.tumorRefCount;
	}

	public void setTumorRefCount(int tumorRefCount) {
		this.tumorRefCount = tumorRefCount;
	}

	public String getTumorSeqAllele1() {
		return this.tumorSeqAllele1;
	}

	public void setTumorSeqAllele1(String tumorSeqAllele1) {
		this.tumorSeqAllele1 = tumorSeqAllele1;
	}

	public String getTumorSeqAllele2() {
		return this.tumorSeqAllele2;
	}

	public void setTumorSeqAllele2(String tumorSeqAllele2) {
		this.tumorSeqAllele2 = tumorSeqAllele2;
	}

	public String getTumorValidationAllele1() {
		return this.tumorValidationAllele1;
	}

	public void setTumorValidationAllele1(String tumorValidationAllele1) {
		this.tumorValidationAllele1 = tumorValidationAllele1;
	}

	public String getTumorValidationAllele2() {
		return this.tumorValidationAllele2;
	}

	public void setTumorValidationAllele2(String tumorValidationAllele2) {
		this.tumorValidationAllele2 = tumorValidationAllele2;
	}

	public String getValidationMethod() {
		return this.validationMethod;
	}

	public void setValidationMethod(String validationMethod) {
		this.validationMethod = validationMethod;
	}

	public String getValidationStatus() {
		return this.validationStatus;
	}

	public void setValidationStatus(String validationStatus) {
		this.validationStatus = validationStatus;
	}

	public String getVerificationStatus() {
		return this.verificationStatus;
	}

	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public MutationEvent getMutationEvent() {
		return this.mutationEvent;
	}

	public void setMutationEvent(MutationEvent mutationEvent) {
		this.mutationEvent = mutationEvent;
	}

	public GeneticProfile getGeneticProfile() {
		return this.geneticProfile;
	}

	public void setGeneticProfile(GeneticProfile geneticProfile) {
		this.geneticProfile = geneticProfile;
	}

	public Sample getSample() {
		return this.sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
	}

}