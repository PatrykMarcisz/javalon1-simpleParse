package pl.sda.academy.javalon1.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pl.sda.academy.javalon1.Main;

public class Application extends javafx.application.Application {
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        TextField textField = new TextField();
        textField.setText("ABC");

        VBox vbox = new VBox();
        vbox.getChildren().addAll(textField, btn);

        Button btn2 = new Button();
        TextField textField2 = new TextField();
        String[] params = new String[1];
        textField2.setText(Main.getBuyCourseForCurrencyAndDate("GBP", "2016-04-04"));
        HBox hbox = new HBox();
        hbox.getChildren().addAll(textField2,btn2);

        VBox root = new VBox();
        root.getChildren().addAll(vbox, hbox);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
