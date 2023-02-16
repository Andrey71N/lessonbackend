package lesson1;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Response {
    @JsonProperty("cuisine")
    private String cuisine;
    @JsonProperty("cuisines")
    private List<String> cuisines = null;
    @JsonProperty("confidence")
    private Double confidence;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
