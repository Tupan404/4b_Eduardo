/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * FXML Controller class
 *
 * @author 03850980227
 */
public class MenuController implements Initializable {

    @FXML
    private MenuItem CadastroCli;
    @FXML
    private MenuItem CadastroFunc;
    @FXML
    private MenuItem CadastroProd;
   
    @FXML
    private Button btnexit;
    
   
    
	
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CadastroCli(ActionEvent e) {
        
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CadastroCliente.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception ee) {
           ee.printStackTrace();
          }
	
              
           }

    @FXML
    private void CadastroFunc(ActionEvent event) {
        
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CadastroFuncionario.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception ee) {
           ee.printStackTrace();
          }
	

        
    }

    @FXML
    private void CadastroProd(ActionEvent event) {
        
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CadastrarProduts.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception ee) {
           ee.printStackTrace();
          }
	
        
    }

    @FXML
    private void exit(ActionEvent e) {
        
     if  (e.getSource() == btnexit)
	System.exit(0);
    }

    private void setResizable(boolean b) {
       setResizable(false);
    }
    
   

   
    
}
