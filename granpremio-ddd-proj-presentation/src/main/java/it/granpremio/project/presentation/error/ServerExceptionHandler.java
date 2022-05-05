package it.granpremio.project.presentation.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ServerExceptionHandler {

    @ExceptionHandler(ServerApplicationError.class)
    public ResponseEntity handleException(ServerApplicationError e) {
        return ResponseEntity.status(e.getHttpStatus()).body(
                ErrorResponse.builder()
                        .code(e.getErrorCode())
                        .message(e.getErrorMessage())
                        .build()
        );
    }
}