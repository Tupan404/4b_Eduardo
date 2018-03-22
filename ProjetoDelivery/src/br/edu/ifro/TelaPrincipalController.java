/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 03850980227
 */
public class TelaPrincipalController implements Initializable {

    @FXML 
    private TextField txtNumero1;
    
    @FXML
    private TextField txtNumero2;
    
    @FXML 
    private Button btnsomar;
    
    @FXML
   private TextField txtResul;
            
    @FXML
    public void somar (ActionEvent event){
   
        double num1;
        double num2; 
        
        num1 = Double.parseDouble(txtNumero1.getText());
        
        num2 = Double.parseDouble(txtNumero2.getText());
        
        double somar = num1 + num2;
        
       
        
       txtResul.setText(somar+"");
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
