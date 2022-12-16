package com.myapps.multical;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class unit_converter_controller{

    @FXML
    TabPane tabPane;
    @FXML
    Tab length_tab, area_tab, volume_tab, mass_tab, temperature_tab, speed_tab, time_tab, data_tab;
    @FXML
    TextField millimetres_textField, centimetres_textField, metres_textField, inches_textField, kilometres_textField, usGallons_textField, grams_textField;
    @FXML
    TextField yards_textField, miles_textField, nauticalMiles_textField, mils_textField, feet_textField, cubicFeet_textField, ukGallons_textField;
    @FXML
    TextField acres_textField, ares_textField, hectares_textField, squareCentimetres_textField, squareFeet_textField, cubicInches_textField, bits_textField;
    @FXML
    TextField squareMetres_textField, squareInches_textField, millilitres_textField, litres_textField, cubicMetres_textField;
    @FXML
    TextField milligrams_textField, kilograms_textField, ounces_textField, pounds_textField, ukTons_textField, usTons_textField, celsius_textField;
    @FXML
    TextField fahrenheit_textField, kelvin_textField, metres_per_hour_textField, metres_per_second_textField, kilometres_per_hour_textField, knots_textField;
    @FXML
    TextField kilometres_per_second_textField, miles_per_hour_textField, miles_per_second_textField, milliseconds_textField, seconds_textField;
    @FXML
    TextField minutes_textField, hour_textField, day_textField, week_textField, bytes_textField, kilobytes_textField, megabytes_textField, gigabytes_textField, terabytes_textField;



    @FXML
    void millimetres_entered(){
        String result;
        double value = Double.parseDouble(millimetres_textField.getText());

        result = String.valueOf(value*0.1);
        centimetres_textField.setText(result);

        result = String.valueOf(value*0.000001);
        kilometres_textField.setText(result);

        result = String.valueOf(value*0.001);
        metres_textField.setText(result);

        result = String.valueOf(value*0.0393701);
        inches_textField.setText(result);

        result = String.valueOf(value*0.00328084);
        feet_textField.setText(result);

        result = String.valueOf(value*0.00109361);
        yards_textField.setText(result);

        result = String.valueOf(value/1609344);
        miles_textField.setText(result);

        result = String.valueOf(value/1852000);
        nauticalMiles_textField.setText(result);

        result = String.valueOf(value*39.3700787402);
        mils_textField.setText(result);
    }

    @FXML
    void centimetres_entered(){
        String result;
        double value = Double.parseDouble(centimetres_textField.getText());

        result = String.valueOf(value*10);
        millimetres_textField.setText(result);

        result = String.valueOf(value/100000);
        kilometres_textField.setText(result);

        result = String.valueOf(value/100);
        metres_textField.setText(result);

        result = String.valueOf(value*0.393701);
        inches_textField.setText(result);

        result = String.valueOf(value*0.0328084);
        feet_textField.setText(result);

        result = String.valueOf(value*0.0109361);
        yards_textField.setText(result);

        result = String.valueOf(value/160900);
        miles_textField.setText(result);

        result = String.valueOf(value/185200);
        nauticalMiles_textField.setText(result);

        result = String.valueOf(value*393.701);
        mils_textField.setText(result);
    }

    @FXML
    void metres_entered(){
        String result;
        double value = Double.parseDouble(metres_textField.getText());

        result = String.valueOf(value*100);
        centimetres_textField.setText(result);

        result = String.valueOf(value*0.001);
        kilometres_textField.setText(result);

        result = String.valueOf(value*1000);
        millimetres_textField.setText(result);

        result = String.valueOf(value*39.3701);
        inches_textField.setText(result);

        result = String.valueOf(value*3.28084);
        feet_textField.setText(result);

        result = String.valueOf(value*1.09361);
        yards_textField.setText(result);

        result = String.valueOf(value/1609);
        miles_textField.setText(result);

        result = String.valueOf(value*0.000539957);
        nauticalMiles_textField.setText(result);

        result = String.valueOf(value*39370);
        mils_textField.setText(result);
    }
    @FXML
    void kilometres_entered(){
        String result;
        double value = Double.parseDouble(kilometres_textField.getText());

        result = String.valueOf(value*100000);
        centimetres_textField.setText(result);

        result = String.valueOf(value*1000);
        metres_textField.setText(result);

        result = String.valueOf(value*39370.1);
        inches_textField.setText(result);

        result = String.valueOf(value*3280.84);
        feet_textField.setText(result);

        result = String.valueOf(value*1093.61);
        yards_textField.setText(result);

        result = String.valueOf(value/1.609);
        miles_textField.setText(result);

        result = String.valueOf(value/1.852);
        nauticalMiles_textField.setText(result);

        result = String.valueOf(value*39370000);
        mils_textField.setText(result);
    }
    @FXML
    void inches_entered(){
        String result;
        double value = Double.parseDouble(inches_textField.getText());

        result = String.valueOf(value*2.54);
        centimetres_textField.setText(result);

        result = String.valueOf(value/39370);
        kilometres_textField.setText(result);

        result = String.valueOf(value*0.0254);
        metres_textField.setText(result);

        result = String.valueOf(value*0.0833333);
        feet_textField.setText(result);

        result = String.valueOf(value*0.0277778);
        yards_textField.setText(result);

        result = String.valueOf(value/63360);
        miles_textField.setText(result);

        result = String.valueOf(value/72910);
        nauticalMiles_textField.setText(result);

        result = String.valueOf(value*1000);
        mils_textField.setText(result);
    }
    @FXML
    void feet_entered(){
        String result;
        double value = Double.parseDouble(feet_textField.getText());

        result = String.valueOf(value*30.48);
        centimetres_textField.setText(result);

        result = String.valueOf(value*0.0003048);
        kilometres_textField.setText(result);

        result = String.valueOf(value*0.3048);
        metres_textField.setText(result);

        result = String.valueOf(value*12);
        inches_textField.setText(result);

        result = String.valueOf(value*0.333333);
        yards_textField.setText(result);

        result = String.valueOf(value/5280);
        miles_textField.setText(result);

        result = String.valueOf(value/6076);
        nauticalMiles_textField.setText(result);

        result = String.valueOf(value*12000);
        mils_textField.setText(result);
    }
    @FXML
    void yards_entered(){
        String result;
        double value = Double.parseDouble(yards_textField.getText());

        result = String.valueOf(value*91.44);
        centimetres_textField.setText(result);

        result = String.valueOf(value*0.0009144);
        kilometres_textField.setText(result);

        result = String.valueOf(value*0.9144);
        metres_textField.setText(result);

        result = String.valueOf(value*36);
        inches_textField.setText(result);

        result = String.valueOf(value*3);
        feet_textField.setText(result);

        result = String.valueOf(value/1760);
        miles_textField.setText(result);

        result = String.valueOf(value/2025);
        nauticalMiles_textField.setText(result);

        result = String.valueOf(value*36000);
        mils_textField.setText(result);
    }
    @FXML
    void miles_entered(){
        String result;
        double value = Double.parseDouble(miles_textField.getText());

        result = String.valueOf(value*160934);
        centimetres_textField.setText(result);

        result = String.valueOf(value*1.60934);
        kilometres_textField.setText(result);

        result = String.valueOf(value*1609.34);
        metres_textField.setText(result);

        result = String.valueOf(value*63360);
        inches_textField.setText(result);

        result = String.valueOf(value*5280);
        feet_textField.setText(result);

        result = String.valueOf(value*1760);
        yards_textField.setText(result);

        result = String.valueOf(value/1.151);
        nauticalMiles_textField.setText(result);

        result = String.valueOf(value*63360000);
        mils_textField.setText(result);
    }
    @FXML
    void nauticalMiles_entered(){
        String result;
        double value = Double.parseDouble(nauticalMiles_textField.getText());

        result = String.valueOf(value*185200);
        centimetres_textField.setText(result);

        result = String.valueOf(value*1.852);
        kilometres_textField.setText(result);

        result = String.valueOf(value*1852);
        metres_textField.setText(result);

        result = String.valueOf(value*72913.4);
        inches_textField.setText(result);

        result = String.valueOf(value*6076.12);
        feet_textField.setText(result);

        result = String.valueOf(value*2025.37);
        yards_textField.setText(result);

        result = String.valueOf(value/1.151);
        miles_textField.setText(result);

        result = String.valueOf(value*72910000);
        mils_textField.setText(result);
    }
    @FXML
    void mils_entered(){
        String result;
        double value = Double.parseDouble(mils_textField.getText());

        result = String.valueOf(value*0.00254);
        centimetres_textField.setText(result);

        result = String.valueOf(value*0.0000000254);
        kilometres_textField.setText(result);

        result = String.valueOf(value*0.0000254);
        metres_textField.setText(result);

        result = String.valueOf(value*0.001);
        inches_textField.setText(result);

        result = String.valueOf(value*0.000083333);
        feet_textField.setText(result);

        result = String.valueOf(value/36000);
        yards_textField.setText(result);

        result = String.valueOf(value/63360000);
        miles_textField.setText(result);

        result = String.valueOf(value/72910000);
        nauticalMiles_textField.setText(result);

    }

    @FXML
    void acres_entered(){
        String result;
        double value = Double.parseDouble(acres_textField.getText());

        result = String.valueOf(value*40.4686);
        ares_textField.setText(result);

        result = String.valueOf(value*0.404686);
        hectares_textField.setText(result);

        result = String.valueOf(value*40470000);
        squareCentimetres_textField.setText(result);

        result = String.valueOf(value*43560);
        squareFeet_textField.setText(result);

        result = String.valueOf(value*6273000);
        squareInches_textField.setText(result);

        result = String.valueOf(value*4046.86);
        squareMetres_textField.setText(result);
    }

    @FXML
    void ares_entered(){
        String result;
        double value = Double.parseDouble(ares_textField.getText());

        result = String.valueOf(value*0.0247105);
        acres_textField.setText(result);

        result = String.valueOf(value*0.01);
        hectares_textField.setText(result);

        result = String.valueOf(value*1000000);
        squareCentimetres_textField.setText(result);

        result = String.valueOf(value*1076.39);
        squareFeet_textField.setText(result);

        result = String.valueOf(value*155000);
        squareInches_textField.setText(result);

        result = String.valueOf(value*100);
        squareMetres_textField.setText(result);
    }

    @FXML
    void hectares_entered(){
        String result;
        double value = Double.parseDouble(hectares_textField.getText());

        result = String.valueOf(value*2.47105);
        acres_textField.setText(result);

        result = String.valueOf(value*100);
        ares_textField.setText(result);

        result = String.valueOf(value*100000000);
        squareCentimetres_textField.setText(result);

        result = String.valueOf(value*107639);
        squareFeet_textField.setText(result);

        result = String.valueOf(value*15500000);
        squareInches_textField.setText(result);

        result = String.valueOf(value*10000);
        squareMetres_textField.setText(result);
    }
    @FXML
    void squareCentimetres_entered(){
        String result;
        double value = Double.parseDouble(squareCentimetres_textField.getText());

        result = String.valueOf(value/40470000);
        acres_textField.setText(result);

        result = String.valueOf(value/1000000);
        ares_textField.setText(result);

        result = String.valueOf(value/100000000);
        hectares_textField.setText(result);

        result = String.valueOf(value/929);
        squareFeet_textField.setText(result);

        result = String.valueOf(value/6.452);
        squareInches_textField.setText(result);

        result = String.valueOf(value/10000);
        squareMetres_textField.setText(result);
    }
    @FXML
    void squareFeet_entered(){
        String result;
        double value = Double.parseDouble(squareFeet_textField.getText());

        result = String.valueOf(value/43560);
        acres_textField.setText(result);

        result = String.valueOf(value/1076);
        ares_textField.setText(result);

        result = String.valueOf(value/929);
        squareCentimetres_textField.setText(result);

        result = String.valueOf(value/107600);
        hectares_textField.setText(result);

        result = String.valueOf(value*144);
        squareInches_textField.setText(result);

        result = String.valueOf(value/10.764);
        squareMetres_textField.setText(result);
    }
    @FXML
    void squareInches_entered(){
        String result;
        double value = Double.parseDouble(squareInches_textField.getText());

        result = String.valueOf(value/155000);
        ares_textField.setText(result);

        result = String.valueOf(value/15500000);
        hectares_textField.setText(result);

        result = String.valueOf(value*6.452);
        squareCentimetres_textField.setText(result);

        result = String.valueOf(value/144);
        squareFeet_textField.setText(result);

        result = String.valueOf(value/6.2730000);
        acres_textField.setText(result);

        result = String.valueOf(value/1550);
        squareMetres_textField.setText(result);

    }
    @FXML
    void squareMetres_entered(){
        String result;
        double value = Double.parseDouble(squareMetres_textField.getText());

        result = String.valueOf(value*0.01);
        ares_textField.setText(result);

        result = String.valueOf(value/10000);
        hectares_textField.setText(result);

        result = String.valueOf(value*10000);
        squareCentimetres_textField.setText(result);

        result = String.valueOf(value*10.7639);
        squareFeet_textField.setText(result);

        result = String.valueOf(value*1550);
        squareInches_textField.setText(result);

        result = String.valueOf(value/4047);
        acres_textField.setText(result);
    }
    @FXML
    void millilitres_entered(){
        String result;
        double value = Double.parseDouble(millilitres_textField.getText());

        result = String.valueOf(value*0.001);
        litres_textField.setText(result);

        result = String.valueOf(value/28320);
        cubicFeet_textField.setText(result);

        result = String.valueOf(value/16.387);
        cubicInches_textField.setText(result);

        result = String.valueOf(value*0.000006);
        cubicMetres_textField.setText(result);

        result = String.valueOf(value/4546);
        ukGallons_textField.setText(result);

        result = String.valueOf(value/3785);
        usGallons_textField.setText(result);
    }
    @FXML
    void litres_entered(){
        String result;
        double value = Double.parseDouble(litres_textField.getText());

        result = String.valueOf(value*1000);
        millilitres_textField.setText(result);

        result = String.valueOf(value/28.317);
        cubicFeet_textField.setText(result);

        result = String.valueOf(value/61.024);
        cubicInches_textField.setText(result);

        result = String.valueOf(value*0.001);
        cubicMetres_textField.setText(result);

        result = String.valueOf(value/4.546);
        ukGallons_textField.setText(result);

        result = String.valueOf(value/3.785);
        usGallons_textField.setText(result);
    }
    @FXML
    void cubicMetres_entered(){
        String result;
        double value = Double.parseDouble(cubicMetres_textField.getText());

        result = String.valueOf(value*1000);
        litres_textField.setText(result);

        result = String.valueOf(value*35.3147);
        cubicFeet_textField.setText(result);

        result = String.valueOf(value*61023.7);
        cubicInches_textField.setText(result);

        result = String.valueOf(value*1000000);
        millilitres_textField.setText(result);

        result = String.valueOf(value*220);
        ukGallons_textField.setText(result);

        result = String.valueOf(value*264.2);
        usGallons_textField.setText(result);
    }
    @FXML
    void cubicInches_entered(){
        String result;
        double value = Double.parseDouble(cubicInches_textField.getText());

        result = String.valueOf(value/61.024);
        litres_textField.setText(result);

        result = String.valueOf(value/1728);
        cubicFeet_textField.setText(result);

        result = String.valueOf(value*16.387);
        millilitres_textField.setText(result);

        result = String.valueOf(value/61020);
        cubicMetres_textField.setText(result);

        result = String.valueOf(value/277.4);
        ukGallons_textField.setText(result);

        result = String.valueOf(value/231);
        usGallons_textField.setText(result);
    }
    @FXML
    void cubicFeet_entered(){
        String result;
        double value = Double.parseDouble(cubicFeet_textField.getText());

        result = String.valueOf(value*28.317);
        litres_textField.setText(result);

        result = String.valueOf(value*28316.8);
        millilitres_textField.setText(result);

        result = String.valueOf(value*1728);
        cubicInches_textField.setText(result);

        result = String.valueOf(value/35.315);
        cubicMetres_textField.setText(result);

        result = String.valueOf(value*6.229);
        ukGallons_textField.setText(result);

        result = String.valueOf(value*7.481);
        usGallons_textField.setText(result);
    }
    @FXML
    void ukGallons_entered(){
        String result;
        double value = Double.parseDouble(ukGallons_textField.getText());

        result = String.valueOf(value*4.546);
        litres_textField.setText(result);

        result = String.valueOf(value/6.229);
        cubicFeet_textField.setText(result);

        result = String.valueOf(value*277.419);
        cubicInches_textField.setText(result);

        result = String.valueOf(value/220);
        cubicMetres_textField.setText(result);

        result = String.valueOf(value*4546.09);
        millilitres_textField.setText(result);

        result = String.valueOf(value*1.201);
        usGallons_textField.setText(result);
    }
    @FXML
    void usGallons_entered(){
        String result;
        double value = Double.parseDouble(usGallons_textField.getText());

        result = String.valueOf(value*3.78541);
        litres_textField.setText(result);

        result = String.valueOf(value/7.48);
        cubicFeet_textField.setText(result);

        result = String.valueOf(value*231);
        cubicInches_textField.setText(result);

        result = String.valueOf(value/264.2);
        cubicMetres_textField.setText(result);

        result = String.valueOf(value/1.201);
        ukGallons_textField.setText(result);

        result = String.valueOf(value*3785.41);
        millilitres_textField.setText(result);
    }
    @FXML
    void milligrams_entered(){
        String result;
        double value = Double.parseDouble(milligrams_textField.getText());

        result = String.valueOf(value*0.001);
        grams_textField.setText(result);

        result = String.valueOf(value/1000000);
        kilograms_textField.setText(result);

        result = String.valueOf(value/28350);
        ounces_textField.setText(result);

        result = String.valueOf(value/453600);
        pounds_textField.setText(result);

        result = String.valueOf(value/907200000);
        usTons_textField.setText(result);

        result = String.valueOf(value/101600000);
        ukTons_textField.setText(result);
    }
    @FXML
    void grams_entered(){
        String result;
        double value = Double.parseDouble(grams_textField.getText());

        result = String.valueOf(value*1000);
        milligrams_textField.setText(result);

        result = String.valueOf(value/1000);
        kilograms_textField.setText(result);

        result = String.valueOf(value*0.035274);
        ounces_textField.setText(result);

        result = String.valueOf(value/453.6);
        pounds_textField.setText(result);

        result = String.valueOf(value/907200);
        usTons_textField.setText(result);

        result = String.valueOf(value/1016000);
        ukTons_textField.setText(result);
    }
    @FXML
    void kilograms_entered(){
        String result;
        double value = Double.parseDouble(kilograms_textField.getText());

        result = String.valueOf(value*1000);
        grams_textField.setText(result);

        result = String.valueOf(value*1000000);
        milligrams_textField.setText(result);

        result = String.valueOf(value*35.274);
        ounces_textField.setText(result);

        result = String.valueOf(value*2.205);
        pounds_textField.setText(result);

        result = String.valueOf(value/907.2);
        usTons_textField.setText(result);

        result = String.valueOf(value/1016);
        ukTons_textField.setText(result);
    }
    @FXML
    void ounces_entered(){
        String result;
        double value = Double.parseDouble(ounces_textField.getText());

        result = String.valueOf(value*28.35);
        grams_textField.setText(result);

        result = String.valueOf(value/35.274);
        kilograms_textField.setText(result);

        result = String.valueOf(value*28350);
        milligrams_textField.setText(result);

        result = String.valueOf(value/16);
        pounds_textField.setText(result);

        result = String.valueOf(value/32000);
        usTons_textField.setText(result);

        result = String.valueOf(value/35840);
        ukTons_textField.setText(result);
    }
    @FXML
    void pounds_entered(){
        String result;
        double value = Double.parseDouble(pounds_textField.getText());

        result = String.valueOf(value*453.6);
        grams_textField.setText(result);

        result = String.valueOf(value/2.205);
        kilograms_textField.setText(result);

        result = String.valueOf(value*16);
        ounces_textField.setText(result);

        result = String.valueOf(value*453592);
        milligrams_textField.setText(result);

        result = String.valueOf(value/2000);
        usTons_textField.setText(result);

        result = String.valueOf(value/2240);
        ukTons_textField.setText(result);
    }
    @FXML
    void ukTons_entered(){
        String result;
        double value = Double.parseDouble(ukTons_textField.getText());

        result = String.valueOf(value*1016000);
        grams_textField.setText(result);

        result = String.valueOf(value*1016.05);
        kilograms_textField.setText(result);

        result = String.valueOf(value*35840);
        ounces_textField.setText(result);

        result = String.valueOf(value*2240);
        pounds_textField.setText(result);

        result = String.valueOf(value*1.12);
        usTons_textField.setText(result);

        result = String.valueOf(value*1016000000);
        milligrams_textField.setText(result);
    }
    @FXML
    void usTons_entered(){
        String result;
        double value = Double.parseDouble(usTons_textField.getText());

        result = String.valueOf(value*907185);
        grams_textField.setText(result);

        result = String.valueOf(value*907.185);
        kilograms_textField.setText(result);

        result = String.valueOf(value*32000);
        ounces_textField.setText(result);

        result = String.valueOf(value*2000);
        pounds_textField.setText(result);

        result = String.valueOf(value*907200000);
        milligrams_textField.setText(result);

        result = String.valueOf(value/1.12);
        ukTons_textField.setText(result);
    }
    @FXML
    void celsius_entered(){
        String result;
        double value = Double.parseDouble(celsius_textField.getText());

        result = String.valueOf((value*1.8)+32);
        fahrenheit_textField.setText(result);

        result = String.valueOf(value+273.15);
        kelvin_textField.setText(result);
    }
    @FXML
    void fahrenheit_entered(){
        String result;
        double value = Double.parseDouble(fahrenheit_textField.getText());

        result = String.valueOf((value-32)*(5/9d));
        celsius_textField.setText(result);

        result = String.valueOf(((value-32)*(5/9d))+273.15);
        kelvin_textField.setText(result);
    }
    @FXML
    void kelvin_entered(){
        String result;
        double value = Double.parseDouble(kelvin_textField.getText());

        result = String.valueOf(((value-273.15)*1.8)+32);
        fahrenheit_textField.setText(result);

        result = String.valueOf(value-273.15);
        celsius_textField.setText(result);
    }
    @FXML
    void MpHr_entered(){
        String result;
        double value = Double.parseDouble(metres_per_hour_textField.getText());

        result = String.valueOf(value*0.44704);
        metres_per_second_textField.setText(result);

        result = String.valueOf(value*1.60934);
        kilometres_per_hour_textField.setText(result);

        result = String.valueOf(value*0.001);
        kilometres_per_second_textField.setText(result);

        result = String.valueOf(value/1609);
        miles_per_hour_textField.setText(result);

        result = String.valueOf(value/5794000);
        miles_per_second_textField.setText(result);

        result = String.valueOf(value/1852);
        knots_textField.setText(result);
    }
    @FXML
    void MpS_entered(){
        String result;
        double value = Double.parseDouble(metres_per_second_textField.getText());

        result = String.valueOf(value*3600);
        metres_per_hour_textField.setText(result);

        result = String.valueOf(value*3.6);
        kilometres_per_hour_textField.setText(result);

        result = String.valueOf(value*0.001);
        kilometres_per_second_textField.setText(result);

        result = String.valueOf(value*2.237);
        miles_per_hour_textField.setText(result);

        result = String.valueOf(value/1609);
        miles_per_second_textField.setText(result);

        result = String.valueOf(value*1.94384);
        knots_textField.setText(result);
    }
    @FXML
    void KpHr_entered(){
        String result;
        double value = Double.parseDouble(kilometres_per_hour_textField.getText());

        result = String.valueOf(value/3.6);
        metres_per_second_textField.setText(result);

        result = String.valueOf(value*1000);
        metres_per_hour_textField.setText(result);

        result = String.valueOf(value/3600);
        kilometres_per_second_textField.setText(result);

        result = String.valueOf(value/1.609);
        miles_per_hour_textField.setText(result);

        result = String.valueOf(value/5794);
        miles_per_second_textField.setText(result);

        result = String.valueOf(value/1.852);
        knots_textField.setText(result);
    }
    @FXML
    void KpS_entered(){
        String result;
        double value = Double.parseDouble(kilometres_per_second_textField.getText());

        result = String.valueOf(value*1000);
        metres_per_second_textField.setText(result);

        result = String.valueOf(value*3600);
        kilometres_per_hour_textField.setText(result);

        result = String.valueOf(value*360000000);
        metres_per_hour_textField.setText(result);

        result = String.valueOf(value*2236.94);
        miles_per_hour_textField.setText(result);

        result = String.valueOf(value/1.609);
        miles_per_second_textField.setText(result);

        result = String.valueOf(value/1943.84);
        knots_textField.setText(result);
    }
    @FXML
    void MipHr_entered(){
        String result;
        double value = Double.parseDouble(miles_per_hour_textField.getText());

        result = String.valueOf(value/2.237);
        metres_per_second_textField.setText(result);

        result = String.valueOf(value*1.60934);
        kilometres_per_hour_textField.setText(result);

        result = String.valueOf(value/2237);
        kilometres_per_second_textField.setText(result);

        result = String.valueOf(value*1609.34);
        metres_per_hour_textField.setText(result);

        result = String.valueOf(value/3600);
        miles_per_second_textField.setText(result);

        result = String.valueOf(value/1.151);
        knots_textField.setText(result);
    }
    @FXML
    void MipS_entered(){
        String result;
        double value = Double.parseDouble(miles_per_second_textField.getText());

        result = String.valueOf(value*1609.34);
        metres_per_second_textField.setText(result);

        result = String.valueOf(value*5793.64);
        kilometres_per_hour_textField.setText(result);

        result = String.valueOf(value*1.60934);
        kilometres_per_second_textField.setText(result);

        result = String.valueOf(value*3600);
        miles_per_hour_textField.setText(result);

        result = String.valueOf(value*5793638.4);
        metres_per_hour_textField.setText(result);

        result = String.valueOf(value*3128.31);
        knots_textField.setText(result);
    }
    @FXML
    void knots_entered(){
        String result;
        double value = Double.parseDouble(knots_textField.getText());

        result = String.valueOf(value/1.944);
        metres_per_second_textField.setText(result);

        result = String.valueOf(value*1.852);
        kilometres_per_hour_textField.setText(result);

        result = String.valueOf(value/1944);
        kilometres_per_second_textField.setText(result);

        result = String.valueOf(value*1.15078);
        miles_per_hour_textField.setText(result);

        result = String.valueOf(value/3128);
        miles_per_second_textField.setText(result);

        result = String.valueOf(value*1852);
        metres_per_hour_textField.setText(result);
    }
    @FXML
    void milliseconds_entered(){
        String result;
        double value = Double.parseDouble(milliseconds_textField.getText());

        result = String.valueOf(value*0.001);
        seconds_textField.setText(result);

        result = String.valueOf(value/60000);
        minutes_textField.setText(result);

        result = String.valueOf(value/3600000);
        hour_textField.setText(result);

        result = String.valueOf(value/86400000);
        day_textField.setText(result);

        result = String.valueOf(value/604800000);
        week_textField.setText(result);
    }
    @FXML
    void seconds_entered(){
        String result;
        double value = Double.parseDouble(seconds_textField.getText());

        result = String.valueOf(value*1000);
        milliseconds_textField.setText(result);

        result = String.valueOf(value/60);
        minutes_textField.setText(result);

        result = String.valueOf(value/3600);
        hour_textField.setText(result);

        result = String.valueOf(value/86400);
        day_textField.setText(result);

        result = String.valueOf(value/604800);
        week_textField.setText(result);
    }
    @FXML
    void minutes_entered(){
        String result;
        double value = Double.parseDouble(minutes_textField.getText());

        result = String.valueOf(value*60);
        seconds_textField.setText(result);

        result = String.valueOf(value*60000);
        milliseconds_textField.setText(result);

        result = String.valueOf(value/60);
        hour_textField.setText(result);

        result = String.valueOf(value/1440);
        day_textField.setText(result);

        result = String.valueOf(value/10080);
        week_textField.setText(result);
    }
    @FXML
    void hour_entered(){
        String result;
        double value = Double.parseDouble(hour_textField.getText());

        result = String.valueOf(value*3600);
        seconds_textField.setText(result);

        result = String.valueOf(value*60);
        minutes_textField.setText(result);

        result = String.valueOf(value*3600000);
        milliseconds_textField.setText(result);

        result = String.valueOf(value/24);
        day_textField.setText(result);

        result = String.valueOf(value/168);
        week_textField.setText(result);
    }
    @FXML
    void day_entered(){
        String result;
        double value = Double.parseDouble(day_textField.getText());

        result = String.valueOf(value*86400);
        seconds_textField.setText(result);

        result = String.valueOf(value*1440);
        minutes_textField.setText(result);

        result = String.valueOf(value*24);
        hour_textField.setText(result);

        result = String.valueOf(value*86400000);
        milliseconds_textField.setText(result);

        result = String.valueOf(value/7);
        week_textField.setText(result);
    }
    @FXML
    void week_entered(){
        String result;
        double value = Double.parseDouble(week_textField.getText());

        result = String.valueOf(value*604800);
        seconds_textField.setText(result);

        result = String.valueOf(value*10080);
        minutes_textField.setText(result);

        result = String.valueOf(value*168);
        hour_textField.setText(result);

        result = String.valueOf(value*7);
        day_textField.setText(result);

        result = String.valueOf(value*604800000);
        milliseconds_textField.setText(result);
    }
    @FXML
    void bits_entered(){}
    @FXML
    void bytes_entered(){}
    @FXML
    void kilobytes_entered(){}
    @FXML
    void megabytes_entered(){}
    @FXML
    void gigabytes_entered(){}
    @FXML
    void terabytes_entered(){}

}
