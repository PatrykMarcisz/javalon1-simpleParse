import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.sda.academy.javalon1.nbp.RateExchange;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ExchangeRateMappingTest {

    @Test
    @DisplayName("should parse correctly")
    void shouldParseCorrectly() throws IOException {
        //given
        File nbpJson = new File("src/test/resources/nbpapi.json");

        //when
        ObjectMapper mapper = new ObjectMapper();
        RateExchange result = mapper.readValue(nbpJson, RateExchange.class);

        //then
        assertEquals("C", result.getTable());
        assertEquals("dolar amerykański", result.getCurrency());
        assertEquals("USD", result.getCode());
        assertEquals(1, result.getRates().size());
        assertEquals("2016-04-04", result.getRates().get(0).getDate());
        assertEquals("064/C/NBP/2016", result.getRates().get(0).getNumber());
        assertEquals(3.6929, result.getRates().get(0).getBid());
        assertEquals(3.7675, result.getRates().get(0).getAsk());
    }
}
