package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)

@AllArgsConstructor // parametreli cons.
@NoArgsConstructor // parametresiz cons.
@Data //getter ve setter
@ToString
public class OuterResponseMeetPojo {

    private CreateMeetPojo object;
    private String message;
    private String httpStatus;
}
