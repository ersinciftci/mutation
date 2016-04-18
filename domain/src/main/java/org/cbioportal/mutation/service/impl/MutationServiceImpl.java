package org.cbioportal.mutation.service.impl;

import org.cbioportal.mutation.repository.MutationRepository;
import org.cbioportal.mutation.model.Mutation;
import org.cbioportal.mutation.service.MutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ersin on 4/8/16.
 */
@Service
public class MutationServiceImpl implements MutationService {

    @Autowired
    private MutationRepository mutationRepository;

    @Override
    public List<Mutation> getMutationData(List<String> geneticProfileStableIds, List<String> hugoGeneSymbols) {
        return mutationRepository.getMutationData(geneticProfileStableIds, hugoGeneSymbols);
    }
}
