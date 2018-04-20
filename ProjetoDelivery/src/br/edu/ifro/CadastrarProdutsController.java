
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


public class CadastrarProdutsController implements Initializable {

     @FXML
    private Button btnexit;
       @FXML
    private Button btnlimpar;
    @FXML
    private RadioButton  status, status1;
     @FXML
    private TextField txtcod;
    @FXML
    private TextField txtvalor;
    @FXML
    private TextField txtproduto;
    @FXML
    private TextArea txtdescricao;
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
	txtproduto.setText("");
        txtvalor.setText("");
        txtdescricao.setText("");
        status.setSelected(false);
        status1.setSelected(false);
}

    @FXML
    private void salvar(ActionEvent e) {
        if (e.getSource()== btnsalvar) {
	JOptionPane.showMessageDialog(null, "Cadastro concluido com Sucesso ");
   
        
    }
    }
    
    private void SalvarProduto (){
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("Delivery");
        EntityManager em = emf.createEntityManager();
         Produts Produts = new Produts();
          Produts.setProduto(txtproduto.getText());
           Produts.setDescricao(txtdescricao.getText());
            Produts.setProduto(txtproduto.getText());
         Produts.setValor(txtvalor.getText());
         em.getTransaction().begin();
        em.persist(Produts);
        em.getTransaction().commit();
        
    }
    
}
    

   

