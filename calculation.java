package com.myapps.multical;

import javafx.scene.control.Label;

import java.text.DecimalFormat;

public class calculation {

    Arithmetic arithmetic = new Arithmetic();
    Label input_label,output_label;
    StringBuilder first_numbers = new StringBuilder();
    StringBuilder second_numbers = new StringBuilder();
    StringBuilder input_string = new StringBuilder();
    DecimalFormat decimalFormat = new DecimalFormat("0.000000000");
    String result="", current_operator="";
    double first_number,second_number,answer;
    boolean initialize, isSquare_root_on, isNegative_sign_on;


    void setText(String input){
        input_string.append(input);
        input_label.setText(input_string.toString());
    }

    void update(String string){
        input_label.setText(string);
        output_label.setText("");
        input_string.delete(0,input_string.length());
        current_operator="";
        result = "";
        first_numbers.delete(0,first_numbers.length());
        second_numbers.delete(0,second_numbers.length());
        initialize = true;
        isSquare_root_on = false;
        isNegative_sign_on = false;
    }

    void deleteText(){
        if (!(input_string.length()==1)) {
            if (current_operator.isEmpty() && second_numbers.isEmpty()) {
                if (!first_numbers.isEmpty())
                    first_numbers.deleteCharAt(first_numbers.length() - 1);
            }
            else if (second_numbers.isEmpty())
                current_operator = "";
            else if (!second_numbers.isEmpty())
                    second_numbers.deleteCharAt(second_numbers.length() - 1);
            input_string.deleteCharAt(input_string.length() - 1);
            input_label.setText(input_string.toString());
            output_label.setText("");
            result = "";
            if (!(current_operator.isEmpty() || first_numbers.isEmpty() || second_numbers.isEmpty()))
                operation();
        }else update("0");
    }


    void output_result(){
        result = String.valueOf(decimalFormat.format(answer));
        output_label.setText(result);
    }


    void operand_click(String operand){
        if (isNegative_sign_on) {
            operand = "-" + operand;
            if (!(first_numbers.isEmpty()&&current_operator.isEmpty()))
                current_operator = "-";
            isNegative_sign_on = false;
        }
        if (isSquare_root_on) {
            operand = String.valueOf(Math.sqrt(Double.parseDouble(operand)));
            isSquare_root_on = false;
        }
        setText(operand);
        if (current_operator.isEmpty()) {
            first_numbers.append(operand);
            initialize = false;
        }
        else {
            second_numbers.append(operand);
            operation();
        }
    }


    void operator_click(String operator){
        if (!initialize) {
            if (!(result.isEmpty())) {
                input_string.delete(0,input_string.length());
                setText(result);
                first_numbers.delete(0,first_numbers.length());
                first_numbers.append(result);
                second_numbers.delete(0,second_numbers.length());
                output_label.setText("");
            }
            setText(operator);
            current_operator = operator;
        }
    }

    void operation(){
        first_number = Double.parseDouble(String.valueOf(first_numbers));
        second_number = Double.parseDouble(String.valueOf(second_numbers));
        switch (current_operator){
            case "+" -> {
                answer = arithmetic.add(first_number,second_number);
                output_result();
            }
            case "-" -> {
                answer = arithmetic.subtract(first_number,second_number);
                output_result();
            }
            case "×" -> {
                answer = arithmetic.multiply(first_number,second_number);
                output_result();
            }
            case "÷" -> {
                answer = arithmetic.divide(first_number,second_number);
                output_result();
            }
            case "%" -> {
                answer = arithmetic.modulus(first_number,second_number);
                output_result();
            }
        }
    }
}