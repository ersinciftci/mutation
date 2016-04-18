package org.cbioportal.mutation.repository;

import java.util.List;

/**
 * Created by ersin on 4/18/16.
 */
public interface GeneRepository {

    boolean isValidGenes(List<String> hugoGeneSymbol);
}
