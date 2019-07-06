package pl.sda.academy.javalon1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/toParse2.json");
        ExampleObject exampleObject = objectMapper.readValue(jsonFile, ExampleObject.class);
        System.out.println(exampleObject);
        System.out.println(exampleObject.getProperties().getFoo().getType());
    }

}
