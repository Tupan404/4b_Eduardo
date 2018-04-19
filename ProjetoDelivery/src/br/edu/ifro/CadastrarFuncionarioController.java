package br.edu.ifro;

import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;


public class CadastrarFuncionarioController implements Initializable {

    @FXML
    private TextField txtcod;
    @FXML
    private TextField txtfunc;
    @FXML
    private TextField txtnome;
    @FXML
    private Button btnsalvar;
    @FXML
    private Button btnlimpar;
    @FXML
    private Button btnexit;
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

    /* @FXML
     private void tfCpfKey(){
         TextFieldFormatter tff = new TextFieldFormatter ();
         txtnum.setMask("");
     }*/
     
    
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
	txtcpf.setText("");
        txtfunc.setText("");
        txtdtcont.setText("");
        txttel.setText("");
        txtnome.setText("");
        txtdtnas.setText("");
        txtsal.setText("");
        txtemail.setText("");
        txtrua.setText("");
        txtbairro.setText("");
        txtnum.setText("");
        txtcomp.setText("");
}
@FXML
 private void salvar(){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("Delivery");
       EntityManager em = emf.createEntityManager();
       
       Funcionario Funcionario1 = new Funcionario();
       Funcionario1.setFuncionario_nome(""+txtnome);
       Funcionario1.setFuncionario_nome(""+txtcpf);
       Funcionario1.setFuncionario_nome(""+txtfunc);
       Funcionario1.setFuncionario_nome(""+txtdtcont);
       Funcionario1.setFuncionario_nome(""+txttel);
       Funcionario1.setFuncionario_nome(""+txtdtnas);
       Funcionario1.setFuncionario_nome(""+txtsal);
       Funcionario1.setFuncionario_nome(""+txtemail);
       Funcionario1.setFuncionario_nome(""+txtrua);
       Funcionario1.setFuncionario_nome(""+txtbairro);
       Funcionario1.setFuncionario_nome(""+txtnum);
       Funcionario1.setFuncionario_nome(""+txtcomp);
       
   
        em.getTransaction().begin();
        em.persist(Funcionario1);
        em.getTransaction().commit();
        
       
 
     
 }
    

          
        
    }
