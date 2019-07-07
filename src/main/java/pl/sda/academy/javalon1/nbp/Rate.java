package pl.sda.academy.javalon1.nbp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rate {
    @JsonProperty("no")
    private String number;
    @JsonProperty("effectiveDate")
    private String date;
    @JsonProperty("bid")
    private double bid;
    @JsonProperty("ask")
    private double ask;
}

interface A{
    void fun();
};

class FirstImpl implements A{

    public void fun() {
        System.out.println("first");
    }
}

class SecondImpl implements A {

    public void fun() {
        System.out.println("second");
    }
}

class Main{
    public static void main(String[] args) {
        FirstImpl impl = new FirstImpl();
        SecondImpl impl2 = new SecondImpl();

        A a = impl2;
        a.fun();

        a = impl;
        a.fun();
    }

}
