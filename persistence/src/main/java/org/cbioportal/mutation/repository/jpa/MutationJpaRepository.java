package org.cbioportal.mutation.repository.jpa;

import org.cbioportal.mutation.dto.MutationEventCount;
import org.cbioportal.mutation.model.Mutation;
import org.cbioportal.mutation.model.MutationPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by ersin on 4/13/16.
 */
public interface MutationJpaRepository extends Repository<Mutation, MutationPK> {

    List<Mutation> findByGeneticProfileStableIdInAndMutationEventGeneHugoGeneSymbolIn(
            Collection<String> geneticProfileIds, Collection<String> hugoGeneSymbols);

    @Query("select new org.cbioportal.mutation.dto.MutationEventCount(m.id.mutationEventId, count(m.id.mutationEventId)) from Mutation m group by m.id.mutationEventId")
    List<MutationEventCount> countMutationEvents();
}
