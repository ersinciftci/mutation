package org.cbioportal.mutation.web.rest;

import com.fasterxml.jackson.annotation.JsonView;
import org.cbioportal.mutation.dto.MutationEventCount;
import org.cbioportal.mutation.exception.InvalidGeneException;
import org.cbioportal.mutation.web.jsonview.View;
import org.cbioportal.mutation.model.Mutation;
import org.cbioportal.mutation.service.MutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
                                      @RequestParam List<String> hugoGeneSymbols) throws InvalidGeneException {

        return mutationService.getMutationData(geneticProfileStableIds, hugoGeneSymbols);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/mutation_events/count")
    public List<MutationEventCount> getMutationEventCount(){

        return mutationService.countMutationEvents();
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Invalid Gene in Request")
    @ExceptionHandler(InvalidGeneException.class)
    public void exceptionHandler()
    {
    }
}
