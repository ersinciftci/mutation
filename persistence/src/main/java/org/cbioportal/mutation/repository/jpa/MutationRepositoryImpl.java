package org.cbioportal.mutation.repository.jpa;

import org.cbioportal.mutation.repository.MutationRepository;
import org.cbioportal.mutation.model.Mutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ersin on 4/14/16.
 */
@Repository
public class MutationRepositoryImpl implements MutationRepository {

    @Autowired
    private MutationJpaRepository mutationJpaRepository;

    @Override
    public List<Mutation> getMutationData(List<String> geneticProfileStableIds, List<String> hugoGeneSymbols) {

        return mutationJpaRepository.findByGeneticProfileStableIdInAndMutationEventGeneHugoGeneSymbolIn(
                geneticProfileStableIds, hugoGeneSymbols);
    }
}
