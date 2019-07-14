import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalDateTest {


    @Test
    void fromLocalDateToString() {
        //given
        LocalDate date = LocalDate.of(2012, 2, 1);

        //when
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        //then
        assertEquals("01/02/2012", formattedDate);

    }


    @Test
    void fromStringToLocalDate() {
        LocalDate expected = LocalDate.of(2012, 2, 1);

        LocalDate fromString = LocalDate.parse(
                "01/02/2012",
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        assertEquals(expected, fromString);

    }


}
