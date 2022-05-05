package it.granpremio.project.presentation.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ServerApplicationError extends RuntimeException {

    private HttpStatus httpStatus;
    private String errorCode;
    private String errorMessage;

    public ServerApplicationError(HttpStatus httpStatus, String code, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode=code;
        this.errorMessage=message;
    }
}