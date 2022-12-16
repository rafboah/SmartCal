package com.myapps.multical;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SmartCalController {
@FXML
    BorderPane borderPane;
@FXML
    AnchorPane anchorPane;
@FXML
    Label basic_calculator, gpa_calculator, unit_converter;
@FXML
    ImageView closeButton;
@FXML
    ImageView minimizeButton;

    public void setView(String fxml_url, String css_url) throws IOException{
        anchorPane = FXMLLoader.load(Objects.requireNonNull(SmartCal.class.getResource(fxml_url)));
        anchorPane.getStylesheets().add(Objects.requireNonNull(getClass().getResource(css_url)).toExternalForm());
        borderPane.setCenter(anchorPane);
    }

    @FXML
    void close(){
            Platform.exit();
            }
    @FXML
    void minimize(){
        Stage stage=(Stage)minimizeButton.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    void basic_calculator_click() throws IOException {
        setView("fxmls/basic_calculator-view.fxml","css/basic_calculator-view.css");
    }

    @FXML
    void gpa_calculator_click() throws IOException {
        setView("fxmls/gpa_calculator-view.fxml","css/basic_calculator-view.css");
    }

    @FXML
    void unit_converter_click() throws IOException {
        setView("fxmls/unit_converter-view.fxml","css/unit_converter-view.css");
    }

}