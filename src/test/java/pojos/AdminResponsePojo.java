package pojos;


import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminResponsePojo {
    private AdminCreatePojo object;
    private String message;
    private String httpStatus;


}