package pl.sda.academy.javalon1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PropertyType {

    @JsonProperty("type")
    private String type;
}
