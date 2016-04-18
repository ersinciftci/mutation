package org.cbioportal.mutation.web.mixin;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.web.jsonview.View;
import org.cbioportal.mutation.model.GeneticProfile;
import org.cbioportal.mutation.model.MutationEvent;
import org.cbioportal.mutation.model.MutationPK;
import org.cbioportal.mutation.model.Sample;

/**
 * Created by ersin on 4/14/16.
 */
public class MutationMixin {

    private MutationPK id;

    @JsonView(View.Mutation.class)
    private String aminoAcidChange;

    @JsonView(View.Mutation.class)
    private String bamFile;

    @JsonView(View.Mutation.class)
    private String center;

    @JsonView(View.Mutation.class)
    private String matchNormSeqAllele1;

    @JsonView(View.Mutation.class)
    private String matchNormSeqAllele2;

    @JsonView(View.Mutation.class)
    private String matchNormValidationAllele1;

    @JsonView(View.Mutation.class)
    private String matchNormValidationAllele2;

    @JsonView(View.Mutation.class)
    private String matchedNormSampleBarcode;

    @JsonView(View.Mutation.class)
    private String mutationStatus;

    @JsonView(View.Mutation.class)
    private int normalAltCount;

    @JsonView(View.Mutation.class)
    private int normalRefCount;

    @JsonView(View.Mutation.class)
    private String score;

    @JsonView(View.Mutation.class)
    private String sequenceSource;

    @JsonView(View.Mutation.class)
    private String sequencer;

    @JsonView(View.Mutation.class)
    private String sequencingPhase;

    @JsonView(View.Mutation.class)
    private int tumorAltCount;

    @JsonView(View.Mutation.class)
    private int tumorRefCount;

    @JsonView(View.Mutation.class)
    private String tumorSeqAllele1;

    @JsonView(View.Mutation.class)
    private String tumorSeqAllele2;

    @JsonView(View.Mutation.class)
    private String tumorValidationAllele1;

    @JsonView(View.Mutation.class)
    private String tumorValidationAllele2;

    @JsonView(View.Mutation.class)
    private String validationMethod;

    @JsonView(View.Mutation.class)
    private String validationStatus;

    @JsonView(View.Mutation.class)
    private String verificationStatus;

    @JsonView(View.Mutation.class)
    private MutationEvent mutationEvent;

    @JsonView(View.Mutation.class)
    private GeneticProfile geneticProfile;

    @JsonView(View.Mutation.class)
    private Sample sample;
}
