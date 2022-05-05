package it.granpremio.project.presentation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import it.granpremio.project.error.GranpremioNonPresenteException;
import it.granpremio.project.port.in.GranpremioUseCase;
import it.granpremio.project.presentation.error.ErrorResponse;
import it.granpremio.project.presentation.error.ServerApplicationError;
import it.granpremio.project.presentation.mapper.GranpremioMapper;
import it.granpremio.project.presentation.response.GranpremioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/granpremio")
@RequiredArgsConstructor
public class GranpremioController {

    /**------ MAPPER ------**/
    private final GranpremioMapper granpremioMapper = new GranpremioMapper();

    /**------ USE CASES ------**/
    private final GranpremioUseCase granpremioUsecase;

    @GetMapping("/{code}")
    @Operation(summary = "This service is used to search a GP",  description = "find By ID method",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Ok", content = @Content(schema = @Schema(implementation = GranpremioResponse.class))),
                    @ApiResponse(responseCode = "201", description = "Ok", content = @Content(schema = @Schema(implementation = GranpremioResponse.class))),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
                    @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
                    @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
                    @ApiResponse(responseCode = "403", description = "Security Violation", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
                    @ApiResponse(responseCode = "422", description = "Business error raised", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
                    @ApiResponse(responseCode = "500", description = "An unexpected error has occurred. The error has been logged and is being investigated.", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
            }
    )
    public ResponseEntity<GranpremioResponse> getGPByCode(@PathVariable(name = "code") Integer code){
        try{
            return ResponseEntity.ok(granpremioMapper.granpremioFromDomain2Response(
                    granpremioUsecase.getGPByCode(code)
                    )
            );
        }catch(GranpremioNonPresenteException e){
            throw new ServerApplicationError(HttpStatus.NOT_FOUND,"0000","Il codice di granpremio cercato non è presente");
        }
    }
}
