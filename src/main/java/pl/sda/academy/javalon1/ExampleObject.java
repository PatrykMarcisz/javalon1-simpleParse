package pl.sda.academy.javalon1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
public class ExampleObject {

    @JsonProperty("type")
    private String type;

    @JsonProperty("properties")
    private Properties properties;

}
