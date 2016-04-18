package org.cbioportal.mutation.service.impl;

import org.cbioportal.mutation.model.Mutation;
import org.cbioportal.mutation.repository.MutationRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ersin on 4/15/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class MutationServiceImplTest {

    @InjectMocks
    private MutationServiceImpl mutationService;

    @Mock
    private MutationRepository mutationRepository;

    @Test
    public void getMutationData() throws Exception {

        List<String> geneticProfileStableIdList = new ArrayList<String>();
        geneticProfileStableIdList.add("STABLE_ID_1");
        geneticProfileStableIdList.add("STABLE_ID_2");

        List<String> hugoGeneSymbolList = new ArrayList<String>();
        hugoGeneSymbolList.add("BRAF");
        hugoGeneSymbolList.add("EGFR");
        hugoGeneSymbolList.add("ZFPM1");

        List<Mutation> expectedMutationList = new ArrayList<Mutation>();
        Mutation expectedMutation = new Mutation();
        expectedMutationList.add(expectedMutation);

        Mockito.when(mutationRepository.getMutationData(geneticProfileStableIdList, hugoGeneSymbolList))
                .thenReturn(expectedMutationList);

        List<Mutation> resultMutationList = mutationService.getMutationData(
                geneticProfileStableIdList, hugoGeneSymbolList);

        Assert.assertEquals(1, resultMutationList.size());
        Assert.assertEquals(expectedMutationList.get(0), resultMutationList.get(0));

    }
}