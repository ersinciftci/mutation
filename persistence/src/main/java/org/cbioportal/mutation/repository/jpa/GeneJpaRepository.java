package org.cbioportal.mutation.repository.jpa;

import org.cbioportal.mutation.model.Gene;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by ersin on 4/18/16.
 */
public interface GeneJpaRepository extends Repository<Gene, Integer> {

    Long countByHugoGeneSymbolIn(List<String> hugoGeneSymbols);
}
