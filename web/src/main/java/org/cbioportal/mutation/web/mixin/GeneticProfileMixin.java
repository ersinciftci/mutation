package org.cbioportal.mutation.web.mixin;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.web.jsonview.View;
import org.cbioportal.mutation.model.CancerStudy;

/**
 * Created by ersin on 4/14/16.
 */
public class GeneticProfileMixin {

    @JsonView(View.Mutation.class)
    private int geneticProfileId;

    @JsonView(View.Mutation.class)
    private String datatype;

    @JsonView(View.Mutation.class)
    private String description;

    @JsonView(View.Mutation.class)
    private String geneticAlterationType;

    @JsonView(View.Mutation.class)
    private String name;

    @JsonView(View.Mutation.class)
    private byte[] showProfileInAnalysisTab;

    @JsonView(View.Mutation.class)
    private String stableId;

    @JsonView(View.Mutation.class)
    private CancerStudy cancerStudy;
}
