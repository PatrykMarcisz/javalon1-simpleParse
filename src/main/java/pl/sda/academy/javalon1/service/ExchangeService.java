package pl.sda.academy.javalon1.service;

import pl.sda.academy.javalon1.repository.api.ExchangeApi;
import pl.sda.academy.javalon1.nbp.dto.exchange.RateExchange;

public class ExchangeService {

    private final ExchangeApi exchangeApi;

    public ExchangeService() {
        exchangeApi = new ExchangeApi();
    }
    
    public String getBuyCourseForCurrencyAndDate(String currency, String date) {

        RateExchange data = exchangeApi.getData(currency, date);
        double bid = data.getRates().get(0).getBid();
        return String.valueOf(bid);

    }
}
