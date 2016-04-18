package org.cbioportal.mutation.exception;

/**
 * Created by ersin on 4/18/16.
 */
public class InvalidGeneException extends Exception {

    public InvalidGeneException() {
        super();
    }

    public InvalidGeneException(String message) {
        super(message);
    }

    public InvalidGeneException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGeneException(Throwable cause) {
        super(cause);
    }
}
