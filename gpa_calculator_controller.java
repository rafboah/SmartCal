package com.myapps.multical;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class gpa_calculator_controller implements Initializable {

    @FXML
    TextField course1_field,course2_field,course3_field,course4_field,course5_field,course6_field,course7_field,course8_field,course9_field,course10_field;
    @FXML
    TextField creditHour1_field,creditHour2_field,creditHour3_field,creditHour4_field,creditHour5_field,creditHour6_field,creditHour7_field,creditHour8_field,creditHour9_field,creditHour10_field;
    @FXML
    ComboBox<String> comboBox1,comboBox2,comboBox3,comboBox4,comboBox5,comboBox6,comboBox7,comboBox8,comboBox9,comboBox10;
    @FXML
    Label gpa_label;

    double credit_hour1=0;
    double credit_hour2=0;
    double credit_hour3=0;
    double credit_hour4=0;
    double credit_hour5=0;
    double credit_hour6 =0,credit_hour7=0,credit_hour8=0,credit_hour9=0,credit_hour10=0;
    double points = 0,points1=0,points2=0,points3=0,points4=0,points5=0;
    double points6=0,points7=0,points8=0,points9=0,points10=0;
    double QP1=0,QP2=0,QP3=0,QP4=0,QP5=0,QP6=0,QP7=0,QP8=0,QP9=0,QP10=0;
    double totalCreditHours = 0;
    double totalQP = 0;

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String promptText = comboBox1.getPromptText();
        ObservableList<String> grades = FXCollections.observableArrayList(
                promptText,"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","D-","E","F");

        comboBox1.setItems(grades);
        comboBox2.setItems(grades);
        comboBox3.setItems(grades);
        comboBox4.setItems(grades);
        comboBox5.setItems(grades);
        comboBox6.setItems(grades);
        comboBox7.setItems(grades);
        comboBox8.setItems(grades);
        comboBox9.setItems(grades);
        comboBox10.setItems(grades);
    }

    double setPoints(String grade){
        switch(grade){
            case "A+"-> points = 4.33f;
            case "A"-> points = 4.00f;
            case "A-"-> points = 3.67f;
            case "B+"-> points = 3.33f;
            case "B"-> points = 3.00f;
            case "B-"-> points = 2.67f;
            case "C+"-> points = 2.33f;
            case "C"-> points = 2.00f;
            case "C-"-> points = 1.67f;
            case "D+"-> points = 1.33f;
            case "D"-> points = 1.00f;
            case "D-"-> points = 0.67f;
            case "E", "F" -> points = 0.00f;
        }
        return points;
    }

    double setQP(double creditHour,double points){
        return creditHour * points;
    }

    void setGPA(){
        totalCreditHours = credit_hour1+credit_hour2+credit_hour3+credit_hour4+credit_hour5+credit_hour6+credit_hour7+credit_hour8+credit_hour9+credit_hour10;
        totalQP = QP1+QP2+QP3+QP4+QP5+QP6+QP7+QP8+QP9+QP10;
        double gpa  = totalQP/totalCreditHours;
        gpa_label.setText(String.valueOf(decimalFormat.format(gpa)));
    }

    @FXML
    void setCreditHour1(){
        credit_hour1 = Double.parseDouble(creditHour1_field.textProperty().get());
        if (!(comboBox1.getValue()==null)) {
            QP1 = setQP(credit_hour1,points1);
            setGPA();
        }
    }
    @FXML
    void setComboBox1(){
        points1 = setPoints(comboBox1.getValue());
        if (!creditHour1_field.textProperty().get().isEmpty()) {
            QP1 = setQP(credit_hour1,points1);
            setGPA();
        }
    }

    @FXML
    void setCreditHour2(){
        credit_hour2 = Double.parseDouble(creditHour2_field.textProperty().get());
        if (!(comboBox2.getValue()==null)) {
            QP2 = setQP(credit_hour2,points2);
            setGPA();
        }
    }
    @FXML
    void setComboBox2(){
        points2 = setPoints(comboBox2.getValue());
        if (!creditHour2_field.textProperty().get().isEmpty()) {
            QP2 = setQP(credit_hour2,points2);
            setGPA();
        }
    }

    @FXML
    void setCreditHour3(){
        credit_hour3 = Double.parseDouble(creditHour3_field.textProperty().get());
        if (!(comboBox3.getValue()==null)) {
            QP3 = setQP(credit_hour3,points3);
            setGPA();
        }
    }
    @FXML
    void setComboBox3(){
        points3 = setPoints(comboBox3.getValue());
        if (!creditHour3_field.textProperty().get().isEmpty()) {
            QP3 = setQP(credit_hour3, points3);
            setGPA();
        }
    }
    @FXML
    void setCreditHour4(){
        credit_hour4 = Double.parseDouble(creditHour4_field.textProperty().get());
        if (!(comboBox4.getValue()==null)) {
            QP4 = setQP(credit_hour4,points4);
            setGPA();
        }
    }
    @FXML
    void setComboBox4(){
        points4 = setPoints(comboBox4.getValue());
        if (!creditHour4_field.textProperty().get().isEmpty()) {
            QP4 = setQP(credit_hour4, points4);
            setGPA();
        }
    }

    @FXML
    void setCreditHour5(){
        credit_hour5 = Double.parseDouble(creditHour5_field.textProperty().get());
        if (!(comboBox5.getValue()==null)) {
            QP5 = setQP(credit_hour5, points5);
            setGPA();
        }
    }
    @FXML
    void setComboBox5(){
        points5 = setPoints(comboBox5.getValue());
        if (!creditHour5_field.textProperty().get().isEmpty()) {
            QP5 = setQP(credit_hour5, points5);
            setGPA();
        }
    }

    @FXML
    void setCreditHour6(){
        credit_hour6 = Double.parseDouble(creditHour6_field.textProperty().get());
        if (!(comboBox6.getValue()==null)) {
            QP6 = setQP(credit_hour6, points6);
            setGPA();
        }
    }
    @FXML
    void setComboBox6(){
        points6 = setPoints(comboBox6.getValue());
        if (!creditHour6_field.textProperty().get().isEmpty()) {
            QP6 = setQP(credit_hour6, points6);
            setGPA();
        }
    }

    @FXML
    void setCreditHour7(){
        credit_hour7 = Double.parseDouble(creditHour7_field.textProperty().get());
        if (!(comboBox7.getValue()==null)) {
            QP7 = setQP(credit_hour7, points7);
            setGPA();
        }
    }
    @FXML
    void setComboBox7(){
        points7 = setPoints(comboBox7.getValue());
        if (!creditHour7_field.textProperty().get().isEmpty()) {
            QP7 = setQP(credit_hour7, points7);
            setGPA();
        }
    }

    @FXML
    void setCreditHour8(){
        credit_hour8 = Double.parseDouble(creditHour8_field.textProperty().get());
        if (!(comboBox8.getValue()==null)) {
            QP8 = setQP(credit_hour8, points8);
            setGPA();
        }
    }
    @FXML
    void setComboBox8(){
        points8 = setPoints(comboBox8.getValue());
        if (!creditHour8_field.textProperty().get().isEmpty()) {
            QP8 = setQP(credit_hour8, points8);
            setGPA();
        }
    }

    @FXML
    void setCreditHour9(){
        credit_hour9 = Double.parseDouble(creditHour9_field.textProperty().get());
        if (!(comboBox9.getValue()==null)) {
            QP9 = setQP(credit_hour9, points9);
            setGPA();
        }
    }
    @FXML
    void setComboBox9(){
        points9 = setPoints(comboBox10.getValue());
        if (!creditHour9_field.textProperty().get().isEmpty()) {
            QP9 = setQP(credit_hour9, points9);
            setGPA();
        }
    }

    @FXML
    void setCreditHour10(){
        credit_hour10 = Double.parseDouble(creditHour1_field.textProperty().get());
        if (!(comboBox10.getValue()==null)) {
            QP10 = setQP(credit_hour10, points10);
            setGPA();
        }
    }
    @FXML
    void setComboBox10(){
        points10 = setPoints(comboBox10.getValue());
        if (!creditHour10_field.textProperty().get().isEmpty()) {
            QP10 = setQP(credit_hour10, points10);
            setGPA();
        }
    }
}
