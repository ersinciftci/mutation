package org.cbioportal.mutation.dto;

/**
 * Created by ersin on 4/21/16.
 */
public class MutationEventCount {

    private int mutationEventId;
    private Long count;

    public MutationEventCount(int mutationEventId, Long count) {
        this.mutationEventId = mutationEventId;
        this.count = count;
    }

    public int getMutationEventId() {
        return mutationEventId;
    }

    public void setMutationEventId(int mutationEventId) {
        this.mutationEventId = mutationEventId;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
