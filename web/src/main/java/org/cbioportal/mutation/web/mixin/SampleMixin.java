package org.cbioportal.mutation.web.mixin;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.web.jsonview.View;
import org.cbioportal.mutation.model.Patient;

/**
 * Created by ersin on 4/14/16.
 */
public class SampleMixin {

    @JsonView(View.Mutation.class)
    private int internalId;

    @JsonView(View.Mutation.class)
    private String sampleType;

    @JsonView(View.Mutation.class)
    private String stableId;

    private Patient patient;
}
