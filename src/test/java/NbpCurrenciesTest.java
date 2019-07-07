import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import pl.sda.academy.javalon1.nbp.dto.currencies.CurrencyExchange;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NbpCurrenciesTest {

    @Test
    void shouldDownloadCurrencies() throws IOException {
        //given
        File nbpJson = new File("src/test/resources/nbpcurrencies.json");

        //when
        ObjectMapper mapper = new ObjectMapper();
        CurrencyExchange[] result = mapper.readValue(nbpJson, CurrencyExchange[].class);

        //then
        assertEquals("C", result[0].getTable());
    }
}
