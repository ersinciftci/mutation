package org.cbioportal.mutation.service;

import org.cbioportal.mutation.exception.InvalidGeneException;
import org.cbioportal.mutation.model.Mutation;

import java.util.List;

/**
 * Created by ersin on 4/8/16.
 */
public interface MutationService {
    List<Mutation> getMutationData(List<String> geneticProfileStableIds, List<String> hugoGeneSymbols) throws InvalidGeneException;
}
