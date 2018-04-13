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
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author 03850980227
 */
public class CadastrarFuncionarioController implements Initializable {

    @FXML
    private TextField txtcod;
   
    @FXML
    private TextField txtcpf;
    @FXML
    private TextField txtdtnas;
    @FXML
    private TextField txtsal;
    @FXML
    private TextField txtdtcont;
    @FXML
    private TextField txtemail;
    @FXML
    private TextField txttel;
    @FXML
    private TextField txtcomp;
    @FXML
    private TextField txtbairro;
    @FXML
    private TextField txtnum;
    @FXML
    private TextField txtrua;
    @FXML
    private Button btnlimpar;
    @FXML
    private Font x2;
    @FXML
    private Font x1;
    @FXML
    private TextField txtfunc;
    @FXML
    private TextField txtnome;
    @FXML
    private Font x3;
    @FXML
    private Font x21;
    
    @FXML
    private void limpar(ActionEvent e) {
        if(e.getSource()== btnlimpar) {
            limpar(); 
				}
        
    }

    private void limpar() {
   	
        
	txtnome.setText("");
        txtcpf.setText("");
        txtdtnas.setText("");
        txtfunc.setText("");
        txtsal.setText("");
        txtdtcont.setText("");
        txtemail.setText("");
        txttel.setText("");
        txtrua.setText("");
        txtnum.setText("");
        txtbairro.setText("");
        txtcomp.setText("");
        
}

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
