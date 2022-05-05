package it.granpremio.project.presentation.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "This object contains the response")
public class GranpremioResponse {
    @ApiModelProperty(notes = "This element represent the code")
    private Integer code;
    @ApiModelProperty(notes = "This element represent the name")
    private String name;
    @ApiModelProperty(notes = "This element represent the nation")
    private String nation;
    @ApiModelProperty(notes = "This element represent the length")
    private Double length;
}
