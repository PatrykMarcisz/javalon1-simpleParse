package pl.sda.academy.javalon1.service;

import pl.sda.academy.javalon1.repository.api.CurrencyApi;
import pl.sda.academy.javalon1.nbp.dto.currencies.Currency;
import pl.sda.academy.javalon1.nbp.dto.currencies.CurrencyExchange;

import java.util.List;
import java.util.stream.Collectors;

public class CurrencyService {

    private final CurrencyApi currencyApi;

    public CurrencyService() {
        currencyApi = new CurrencyApi();
    }

    public List<String> getCurrenciesList() {

        CurrencyExchange data = currencyApi.getData();
        return data.getRates()
                .stream()
                .map(x -> x.getCode())
                .collect(Collectors.toList());
    }
}
