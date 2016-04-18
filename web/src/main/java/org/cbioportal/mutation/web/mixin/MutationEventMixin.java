package org.cbioportal.mutation.web.mixin;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.web.jsonview.View;
import org.cbioportal.mutation.model.Gene;

import java.math.BigInteger;

/**
 * Created by ersin on 4/14/16.
 */
public class MutationEventMixin {

    @JsonView(View.Mutation.class)
    private int mutationEventId;

    @JsonView(View.Mutation.class)
    private byte canonicalTranscript;

    @JsonView(View.Mutation.class)
    private String chr;

    @JsonView(View.Mutation.class)
    private String dbSnpRs;

    @JsonView(View.Mutation.class)
    private String dbSnpValStatus;

    @JsonView(View.Mutation.class)
    private BigInteger endPosition;

    @JsonView(View.Mutation.class)
    private float fisValue;

    @JsonView(View.Mutation.class)
    private String functionalImpactScore;

    @JsonView(View.Mutation.class)
    private String keyword;

    @JsonView(View.Mutation.class)
    private String linkMsa;

    @JsonView(View.Mutation.class)
    private String linkPdb;

    @JsonView(View.Mutation.class)
    private String linkXvar;

    @JsonView(View.Mutation.class)
    private String mutationType;

    @JsonView(View.Mutation.class)
    private String ncbiBuild;

    @JsonView(View.Mutation.class)
    private String oncotatorCodonChange;

    @JsonView(View.Mutation.class)
    private String oncotatorDbsnpRs;

    @JsonView(View.Mutation.class)
    private int oncotatorProteinPosEnd;

    @JsonView(View.Mutation.class)
    private int oncotatorProteinPosStart;

    @JsonView(View.Mutation.class)
    private String oncotatorRefseqMrnaId;

    @JsonView(View.Mutation.class)
    private String oncotatorUniprotAccession;

    @JsonView(View.Mutation.class)
    private String oncotatorUniprotEntryName;

    @JsonView(View.Mutation.class)
    private String proteinChange;

    @JsonView(View.Mutation.class)
    private String referenceAllele;

    @JsonView(View.Mutation.class)
    private BigInteger startPosition;

    @JsonView(View.Mutation.class)
    private String strand;

    @JsonView(View.Mutation.class)
    private String tumorSeqAllele;

    @JsonView(View.Mutation.class)
    private String variantType;

    @JsonView(View.Mutation.class)
    private Gene gene;
}
