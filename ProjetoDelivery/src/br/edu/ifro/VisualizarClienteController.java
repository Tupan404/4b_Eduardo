
package br.edu.ifro;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VisualizarClienteController implements Initializable {

  @FXML
  TextField txtnome;
  @FXML
  TextField txtcpf;
  @FXML
  TextField txtrg;
  @FXML
  TextField txtcelular;
  @FXML
  TextField txtemail;
  @FXML
  TextField txtcidade;
  @FXML
  TextField txtuf;
  @FXML
  TextField txtrua;
  @FXML
  TextField txtnum;
  @FXML
  TextField txtbairro;
  @FXML
  TextField txtcomp;
  @FXML
  Button alterarImagem;
  @FXML
  Button btnsalvar;
  @FXML
  Button btncancelar;
  @FXML
  Button btneditar;
  @FXML
  Button btnexcluir;
    @FXML
    private Font x1;
    @FXML
    private Font x21;
    @FXML
    private Font x211;
    private Label lblIamge;
    @FXML
    private ImageView Imagem;

  @FXML
  public void salvar (){
      
  }
  @FXML
  public void cancelar (){
      
  }
  @FXML
  public void excluir (){
      
  }
  @FXML
  public void editar (){
      
  }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }    

    @FXML
    private void alterar(ActionEvent event) {
        
        
        JFileChooser fileChooser = new JFileChooser();
   
        fileChooser.showOpenDialog(fileChooser);
        fileChooser.setDialogTitle("Procurar Imagem");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg","png");
        
        fileChooser.setFileFilter(filter);
        int retorno = fileChooser.showOpenDialog(fileChooser);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            
            File file = fileChooser.getSelectedFile();
            
            Image image = new Image("exit.png");            
            Imagem.setImage(image);
        }
        
        
    }
    }
    
 
   

