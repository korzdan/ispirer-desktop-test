package com.greeting.greetingdesktop;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import java.util.Locale;
import java.util.ResourceBundle;

public class GreetingController {

    private ResourceBundle resourceBundle;

    @FXML
    private Label greetingLabel;

    @FXML
    private Button greetingButton;

    @FXML
    private Menu menu;

    @FXML
    private MenuItem belarusianItem;

    @FXML
    private MenuItem englishItem;

    @FXML
    private MenuItem russianItem;

    @FXML
    void initialize() {
        loadLang("en");
    }

    @FXML
    private void setBelarusianLang() {
        loadLang("be");
    }

    @FXML
    private void setRussianLang() {
        loadLang("ru");
    }

    @FXML
    private void setEnglishLang() {
        loadLang("en");
    }

    @FXML
    private void greet() {
        greetingLabel.setText(resourceBundle.getString("label"));
    }

    private void loadLang(String lang) {
        Locale locale = new Locale(lang);
        resourceBundle = ResourceBundle.getBundle("com/greeting/greetingdesktop/lang", locale);
        greetingLabel.setText("");
        initializeElements();
    }

    private void initializeElements() {
        greetingButton.setText(resourceBundle.getString("button"));
        menu.setText(resourceBundle.getString("menuBar"));
        belarusianItem.setText(resourceBundle.getString("belarusianMenuItem"));
        englishItem.setText(resourceBundle.getString("englishMenuItem"));
        russianItem.setText(resourceBundle.getString("russianMenuItem"));
    }

}