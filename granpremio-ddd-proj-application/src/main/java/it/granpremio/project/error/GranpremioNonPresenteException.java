package it.granpremio.project.error;

import lombok.Getter;

public class GranpremioNonPresenteException extends RuntimeException {

    public GranpremioNonPresenteException() {
        super();
    }

    public GranpremioNonPresenteException(String message) {
        super(message);
    }

    public GranpremioNonPresenteException(String message, Throwable cause) {
        super(message, cause);
    }
}
