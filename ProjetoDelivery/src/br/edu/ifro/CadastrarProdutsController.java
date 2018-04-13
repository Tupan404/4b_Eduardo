
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class CadastrarProdutsController implements Initializable {

     @FXML
    private Button btnexit;
    @FXML
    private Font x2;
    @FXML
    private Font x1;
    @FXML
    private Font x3;
    @FXML
    private Button btnlimpar;
    @FXML
    private Font x4;
    @FXML
    private TextField txtcod;
    @FXML
    private TextField txtvalor;
    @FXML
    private TextField txtprod;
    @FXML
    private TextArea txtdesc;
    private TextField txtquant;
    @FXML
    private Button btnsalvar;
     @FXML
    private void exit(ActionEvent e) {
        
     if  (e.getSource() == btnexit)
	System.exit(0);
    }
    
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void limpar(ActionEvent e) {
        if(e.getSource()== btnlimpar) {
            limpar(); 
				}
        
    }

    private void limpar() {
   	txtcod.setText("");
	txtprod.setText("");
        txtvalor.setText("");
        txtdesc.setText("");
    
}

    @FXML
    private void salvar(ActionEvent e) {
        if (e.getSource()== btnsalvar) {
	JOptionPane.showMessageDialog(null, "Cadastro concluido com Sucesso ");
   
        
    }
    }
    
}
    

   

