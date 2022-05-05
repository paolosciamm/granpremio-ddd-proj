package it.granpremio.project.presentation.error;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@ApiModel(description = "This object contains the error response")
public class ErrorResponse {
    @ApiModelProperty(notes = "This element represent the code error")
    private String code;
    @ApiModelProperty(notes = "This element represent the msg error")
    private String message;
}