package com.myapps.multical;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.util.Objects;

public class SmartCal extends Application {
    static Stage stage;
    double xOffset,yOffset;


    @Override
    public void start(Stage stage) throws IOException {
        SmartCal.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(SmartCal.class.getResource("fxmls/smartCal-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 719, 600);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("css/smartCal-view.css")).toExternalForm());
        stage.setMaxHeight(600);
        stage.setMaxWidth(719);
        stage.setMinHeight(600);
        stage.setMinWidth(719);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("SmartCal");
        Image icon = new Image("file:src/main/resources/com/myapps/multical/images/smartCal-view/calculatorIcon_48px.png");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();

        scene.setOnMousePressed(mousePressEvent -> {
            xOffset = stage.getX() - mousePressEvent.getScreenX();
            yOffset = stage.getY() - mousePressEvent.getScreenY();
        } );
        scene.setOnMouseDragged(mouseDragEvent -> {
            stage.setX(mouseDragEvent.getScreenX() + xOffset);
            stage.setY(mouseDragEvent.getScreenY() + yOffset);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}