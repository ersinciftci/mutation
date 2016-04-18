package org.cbioportal.mutation.service.impl;

import org.cbioportal.mutation.repository.GeneRepository;
import org.cbioportal.mutation.service.GeneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ersin on 4/18/16.
 */
@Service
public class GeneServiceImpl implements GeneService {

    @Autowired
    private GeneRepository geneRepository;

    @Override
    public boolean isValidGenes(List<String> hugoGeneSymbols) {

        return geneRepository.isValidGenes(hugoGeneSymbols);
    }
}
