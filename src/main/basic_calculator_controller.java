package com.myapps.multical;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class basic_calculator_controller implements Initializable {
    calculation calculation = new calculation();
    @FXML
    Button button_zero,button_one,button_two,button_three,button_four,button_five,button_six,button_seven;
    @FXML
    Button button_eight,button_nine,decimal_point,delete_button,clear_button;
    @FXML
    Button button_add,button_subtract,button_multiply,button_divide,button_modulus,square_root,negative_sign,equals_button;
    @FXML
    Label input_label,output_label;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        calculation.initialize = true;
        calculation.input_label = input_label;
        calculation.output_label = output_label;
    }

    @FXML
    void button_zero_click(){
        calculation.operand_click("0");
    }
    @FXML
    void button_one_click(){
        calculation.operand_click("1");
    }

    @FXML
    void button_two_click(){
        calculation.operand_click("2");
    }

    @FXML
    void button_three_click(){
        calculation.operand_click("3");
    }

    @FXML
    void button_four_click(){
        calculation.operand_click("4");
    }

    @FXML
    void button_five_click(){
        calculation.operand_click("5");
    }

    @FXML
    void button_six_click(){
        calculation.operand_click("6");
    }

    @FXML
    void button_seven_click(){
        calculation.operand_click("7");
    }

    @FXML
    void button_eight_click(){
        calculation.operand_click("8");
    }

    @FXML
    void button_nine_click(){
        calculation.operand_click("9");
    }

    @FXML
    void decimal_point_click(){
        calculation.operand_click(".");
    }

    @FXML
    void delete_button_click(){
        calculation.deleteText();
    }

    @FXML
    void clear_button_click(){
        calculation.update("0");
    }

    @FXML
    void button_add_click(){
            calculation.operator_click("+");
    }

    @FXML
    void button_subtract_click(){
            calculation.operator_click("-");
    }

    @FXML
    void button_multiply_click(){
            calculation.operator_click("×");
    }

    @FXML
    void  button_divide_click(){
           calculation.operator_click("÷");
    }

    @FXML
    void button_modulus_click(){
            calculation.operator_click("%");
    }

    @FXML
    void square_root_click(){
        calculation.isSquare_root_on = true;
    }

    @FXML
    void negative_sign_click(){
        calculation.isNegative_sign_on = true;
    }

    @FXML
    void equals_button_click(){
        calculation.update(calculation.result);
    }

}
