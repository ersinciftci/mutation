package org.cbioportal.mutation.web.rest;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.web.jsonview.View;
import org.cbioportal.mutation.model.Mutation;
import org.cbioportal.mutation.service.MutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ersin on 4/8/16.
 */
@RestController
public class MutationController {

    @Autowired
    private MutationService mutationService;

    @JsonView(View.Mutation.class)
    @RequestMapping(method = RequestMethod.GET, value = "/mutations")
    public List<Mutation> getMutation(@RequestParam List<String> geneticProfileStableIds,
                                      @RequestParam List<String> hugoGeneSymbols) {

        return mutationService.getMutationData(geneticProfileStableIds, hugoGeneSymbols);
    }
}
