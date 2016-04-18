package org.cbioportal.mutation.web.mixin;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.web.jsonview.View;
import org.cbioportal.mutation.model.TypeOfCancer;

import java.util.Date;

/**
 * Created by ersin on 4/14/16.
 */
public class CancerStudyMixin {

    @JsonView(View.Mutation.class)
    private int cancerStudyId;

    @JsonView(View.Mutation.class)
    private String cancerStudyIdentifier;

    @JsonView(View.Mutation.class)
    private String citation;

    @JsonView(View.Mutation.class)
    private String description;

    @JsonView(View.Mutation.class)
    private String groups;

    @JsonView(View.Mutation.class)
    private Date importDate;

    @JsonView(View.Mutation.class)
    private String name;

    @JsonView(View.Mutation.class)
    private String pmid;

    @JsonView(View.Mutation.class)
    private byte public_;

    @JsonView(View.Mutation.class)
    private String shortName;

    @JsonView(View.Mutation.class)
    private Integer status;

    @JsonView(View.Mutation.class)
    private TypeOfCancer typeOfCancer;
}
