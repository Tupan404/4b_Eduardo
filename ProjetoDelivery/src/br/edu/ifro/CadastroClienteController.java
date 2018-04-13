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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author 04399704233
 */
public class CadastroClienteController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtcod;
    @FXML
    private Font x2;
    @FXML
    private Font x1;
    @FXML
    private TextField txtcelular;
    @FXML
    private TextField txtnome;
    @FXML
    private Font x3;
    @FXML
    private Font x21;
    @FXML
    private TextField txcpf;
    @FXML
    private TextField txtemail;
    @FXML
    private TextField txtcomp;
    @FXML
    private TextField txtbairro;
    @FXML
    private TextField txtnum;
    @FXML
    private TextField txtrua;
    @FXML
    private TextField txtrg;
    @FXML
    private Font x211;
    @FXML
    private TextField txtcidade;
    @FXML
    private TextField txtuf;
    @FXML
    private Button btnsalvar;
    
    @FXML 
    private void salvar (){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Delivery");
        EntityManager em = emf.createEntityManager();
        
        Cliente a = new Cliente();
        
       /* a.setNome(txtnome.getText());
        a.setCpf(txcpf.getText());
        a.setRg(txt)
        a.setEndereco
        a.setCelular
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();*/
    
    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
