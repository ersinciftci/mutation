package org.cbioportal.mutation.web.mixin;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.web.jsonview.View;

/**
 * Created by ersin on 4/14/16.
 */
public class GeneMixin {

    @JsonView(View.Mutation.class)
    private int entrezGeneId;

    @JsonView(View.Mutation.class)
    private String cytoband;

    @JsonView(View.Mutation.class)
    private String hugoGeneSymbol;

    @JsonView(View.Mutation.class)
    private int length;

    @JsonView(View.Mutation.class)
    private String type;
}
