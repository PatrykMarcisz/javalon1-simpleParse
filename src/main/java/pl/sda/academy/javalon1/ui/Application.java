package pl.sda.academy.javalon1.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pl.sda.academy.javalon1.service.ExchangeService;

public class Application extends javafx.application.Application {

    public void start(Stage primaryStage) {

        ExchangeService exchangeService = new ExchangeService();

        primaryStage.setTitle("Hello World!");

        VBox root = new VBox();

        TextField currency = new TextField();
        TextField date = new TextField();
        Button runButton = new Button("GO");
        Text result = new Text();

        runButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String currencyValue = currency.getText();
                String dateValue = date.getText();

                String buyCourse = exchangeService.getBuyCourseForCurrencyAndDate(currencyValue, dateValue);
                result.setText(buyCourse);
            }
        });

        root.getChildren().addAll(currency, date, runButton, result);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
