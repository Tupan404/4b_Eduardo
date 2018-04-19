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
    private TextField txtcelular;
    @FXML
    private TextField txtnome;
    @FXML
    private TextField txtcpf;
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
    private TextField txtcidade;
    @FXML
    private TextField txtuf;
    @FXML
    private Button btnsalvar;
    
   
    @FXML 
    private void salvar (){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Delivery");
        EntityManager em = emf.createEntityManager();
        
        Cliente Cliente = new Cliente();
        
        Cliente.setNome(txtnome.getText());
        Cliente.setCpf (txtcpf.getText());
        Cliente.setRg(txtrg.getText());
        Cliente.setCliente_cidade (txtnum.getText());
        Cliente.setCliente_Uf (txtuf.getText());
        Cliente.setRua(txtrua.getText());
        Cliente.setNumeroCasa (txtnum.getText());
        Cliente.setCelular (txtcelular.getText());
        em.getTransaction().begin();
        em.persist(Cliente);
        em.getTransaction().commit();
    
    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
