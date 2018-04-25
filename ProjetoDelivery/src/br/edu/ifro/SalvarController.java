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

/**
 * FXML Controller class
 *
 * @author Administrador
 */
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class SalvarController implements Initializable {
@FXML
private Button btnok;


@FXML
    private void ok(ActionEvent event ) {
           if  (event.getSource() == btnok){
	System.exit(0);
    }
    
    }




    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SalvarController salvar = new SalvarController();
        // TODO
    }    
    
}
