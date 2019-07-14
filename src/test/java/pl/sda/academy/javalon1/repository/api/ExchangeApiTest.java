package pl.sda.academy.javalon1.repository.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeApiTest {

    @Test
    void createUrlForNbp() {

        String expected = "http://api.nbp.pl/api/exchangerates/rates/c/usd/2016-04-04/?format=json";

        ExchangeApi api = new ExchangeApi();
        String link = api.createUrlForNbp("usd", "2016-04-04");

        assertEquals(expected, link);


    }
}