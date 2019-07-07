package pl.sda.academy.javalon1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import pl.sda.academy.javalon1.example.ExampleObject;
import pl.sda.academy.javalon1.nbp.RateExchange;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //zad1();
        String currencyUsd = "USD";
        RateExchange rateExchangeForUrl = getRateExchangeForParams(currencyUsd, "2016-04-04");
        double bid = rateExchangeForUrl.getRates().get(0).getBid();

        RateExchange rateExchangeForUrl2 = getRateExchangeForParams("GBP", "2016-04-04");
        double bid2 = rateExchangeForUrl2.getRates().get(0).getBid();

        System.out.println(bid);
        System.out.println(bid2);

    }

    public static String getBuyCourseForCurrencyAndDate(String currency, String date) throws IOException {
        RateExchange rateExchangeForUrl2 = getRateExchangeForParams(currency, date);
        double bid = rateExchangeForUrl2.getRates().get(0).getBid();
        return String.valueOf(bid);

    }

    private static RateExchange getRateExchangeForParams(String currency, String date) throws IOException {
        String urlForNbp = createUrlForNbp(currency, date);
        String dataFromNbp = downloadData(urlForNbp);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(dataFromNbp, RateExchange.class);
    }

    private static String createUrlForNbp(String currency, String date) {
        return "http://api.nbp.pl/api/exchangerates/rates/c/" +
                currency +
                "/" + date +
                "/?format=json";
    }

    private static String downloadData(String url) throws IOException {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        return result.toString();
    }

    private static void zad1() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/toParse.json");
        ExampleObject exampleObject = objectMapper.readValue(jsonFile, ExampleObject.class);
        System.out.println(exampleObject);
        System.out.println(exampleObject.getProperties().getFoo().getType());
    }

}
