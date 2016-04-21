package org.cbioportal.mutation.repository;

import org.cbioportal.mutation.dto.MutationEventCount;
import org.cbioportal.mutation.model.Mutation;

import java.util.List;

/**
 * Created by ersin on 4/13/16.
 */
public interface MutationRepository {

    List<Mutation> getMutationData(List<String> geneticProfileStableIds, List<String> hugoGeneSymbols);
    List<MutationEventCount> countMutationEvents();
}
