/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author 04399704233
 */
public class PesquisarClienteController implements Initializable {

    @FXML
        Button pesquisa;
    
    
    @FXML
    void pesquisar (){
       JOptionPane.showMessageDialog (null, " PORRRAAA");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
