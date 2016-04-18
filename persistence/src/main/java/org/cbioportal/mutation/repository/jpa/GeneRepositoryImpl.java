package org.cbioportal.mutation.repository.jpa;

import org.cbioportal.mutation.repository.GeneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ersin on 4/18/16.
 */
@Repository
public class GeneRepositoryImpl implements GeneRepository {

    @Autowired
    private GeneJpaRepository geneJpaRepository;

    @Override
    public boolean isValidGenes(List<String> hugoGeneSymbols) {

        // We do this because existsBy is not supported yet: https://jira.spring.io/browse/DATAJPA-851
        return geneJpaRepository.countByHugoGeneSymbolIn(hugoGeneSymbols) == hugoGeneSymbols.size();
    }
}
