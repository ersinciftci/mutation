package org.cbioportal.mutation.repository.jpa;

import org.cbioportal.mutation.model.Mutation;
import org.cbioportal.mutation.model.MutationPK;
import org.springframework.data.repository.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by ersin on 4/13/16.
 */
public interface MutationJpaRepository extends Repository<Mutation, MutationPK> {

    List<Mutation> findByGeneticProfileStableIdInAndMutationEventGeneHugoGeneSymbolIn(
            Collection<String> geneticProfileIds, Collection<String> hugoGeneSymbols);
}
