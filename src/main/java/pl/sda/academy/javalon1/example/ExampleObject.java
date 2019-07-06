package pl.sda.academy.javalon1.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExampleObject {

    @JsonProperty("type")
    private String type;

    @JsonProperty("properties")
    private Properties properties;

}
