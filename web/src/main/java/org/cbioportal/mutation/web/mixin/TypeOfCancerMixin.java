package org.cbioportal.mutation.web.mixin;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.web.jsonview.View;

/**
 * Created by ersin on 4/14/16.
 */
public class TypeOfCancerMixin {

    @JsonView(View.Mutation.class)
    private String typeOfCancerId;

    @JsonView(View.Mutation.class)
    private String clinicalTrialKeywords;

    @JsonView(View.Mutation.class)
    private String dedicatedColor;

    @JsonView(View.Mutation.class)
    private String name;

    @JsonView(View.Mutation.class)
    private String parent;

    @JsonView(View.Mutation.class)
    private String shortName;
}
