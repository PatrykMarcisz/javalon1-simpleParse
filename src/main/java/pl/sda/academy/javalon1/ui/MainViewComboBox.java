package pl.sda.academy.javalon1.ui;

import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import pl.sda.academy.javalon1.service.CurrencyService;

class MainViewComboBox extends ComboBox<String> {

    MainViewComboBox(CurrencyService currencyService) {
        super(FXCollections.observableArrayList(currencyService.getCurrenciesList()));
    }
}
