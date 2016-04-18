package org.cbioportal.mutation.service;

import java.util.List;

/**
 * Created by ersin on 4/18/16.
 */
public interface GeneService {

    boolean isValidGenes(List<String> hugoGeneSymbols);
}
