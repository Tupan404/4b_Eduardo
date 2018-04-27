/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.awt.Image;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 03850980227
 */
public class LoginController implements Initializable {

    @FXML
    private Button acessar;
    @FXML
    private Button btncancelar;
    @FXML
    private AnchorPane principal;

   
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    @FXML
    private void acessar(ActionEvent event) {
        
          try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception ee) {
           ee.printStackTrace();
          }
	
    }

    @FXML
    private void cancelar(ActionEvent event) {
         Stage stage = (Stage) btncancelar.getScene().getWindow();
         stage.close();
    }

    @FXML
    private void principal(MouseEvent event) {
     
    }
    
     public void start(Stage stage) {
          StackPane root = new StackPane();
        // set icon
        stage.getIcons().add(new javafx.scene.image.Image("imagens\\logo.png"));
        stage.setTitle("Wow!! Stackoverflow Icon");
        stage.setScene(new Scene(root, 300, 250));
        stage.show();
     }
    
   
    
}
