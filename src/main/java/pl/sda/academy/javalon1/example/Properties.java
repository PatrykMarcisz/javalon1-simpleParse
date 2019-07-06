package pl.sda.academy.javalon1.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Properties {

    @JsonProperty("foo")
    private PropertyType foo;

    @JsonProperty("bar")
    private PropertyType bar;

    @JsonProperty("baz")
    private PropertyType baz;
}
