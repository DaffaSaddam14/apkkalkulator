/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {
    
    Float data = 0f;
    int operation = -1;
    
    @FXML
    private Label label;
    @FXML
    private Button tujuh;
    @FXML
    private Button delapan;
    @FXML
    private Button empat;
    @FXML
    private Button satu;
    @FXML
    private Button lima;
    @FXML
    private Button dua;
    @FXML
    private Button sembilan;
    @FXML
    private Button tambah;
    @FXML
    private Button enam;
    @FXML
    private Button tiga;
    @FXML
    private Button clear;
    @FXML
    private Button nol;
    @FXML
    private Button hasil;
    @FXML
    private Button kurang;
    @FXML
    private Button kali;
    @FXML
    private Button bagi;
    @FXML
    private TextField display;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == satu){
            display.setText(display.getText() + "1");
        } else if(event.getSource() == dua){
            display.setText(display.getText() + "2");
        } else if(event.getSource() == tiga){
            display.setText(display.getText() + "3");
        } else if(event.getSource() == empat){
            display.setText(display.getText() + "4");
        } else if(event.getSource() == lima){
            display.setText(display.getText() + "5");
        } else if(event.getSource() == enam){
            display.setText(display.getText() + "6");
        } else if(event.getSource() == tujuh){
            display.setText(display.getText() + "7");
        } else if(event.getSource() == delapan){
            display.setText(display.getText() + "8");
        } else if(event.getSource() == sembilan){
            display.setText(display.getText() + "9");
        } else if(event.getSource() == nol){
            display.setText(display.getText() + "0");
        } else if(event.getSource() == clear){
            display.setText("");
        } else if(event.getSource() == tambah)
        {
            data = Float.parseFloat(display.getText());
            operation = 1;
            display.setText("");
        } else if(event.getSource() == kurang)
        {
            data = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
        } else if(event.getSource() == kali)
        {
            data = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");
        } else if(event.getSource() == bagi)
        {
            data = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
        } else if(event.getSource() == hasil)
        {
            Float secondOperand = Float.parseFloat(display.getText());
            switch(operation)
            {
                case 1:
                    Float ans = data + secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 2:
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 3:
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 4:
                    ans = 0f;
                    try{
                        ans = data / secondOperand;
                    }catch(Exception e){display.setText("Error");}
                    display.setText(String.valueOf(ans));break;
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
