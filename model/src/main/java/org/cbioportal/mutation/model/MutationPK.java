package org.cbioportal.mutation.model;

import java.io.Serializable;


public class MutationPK implements Serializable {

    private int mutationEventId;
    private int geneticProfileId;
    private int internalId;

    public int getMutationEventId() {
        return mutationEventId;
    }

    public void setMutationEventId(int mutationEventId) {
        this.mutationEventId = mutationEventId;
    }

    public int getGeneticProfileId() {
        return geneticProfileId;
    }

    public void setGeneticProfileId(int geneticProfileId) {
        this.geneticProfileId = geneticProfileId;
    }

    public int getInternalId() {
        return internalId;
    }

    public void setInternalId(int internalId) {
        this.internalId = internalId;
    }
}
