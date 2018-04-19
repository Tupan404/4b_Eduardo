
package br.edu.ifro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity    


public class Cliente {
    
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cliente_nome;
    private String cliente_cpf;
    private String cliente_rg;
    private String cliente_cidade;
    private String cliente_uf;
    private String cliente_numeroCasa;
    private String cliente_ruaEndereco;
    private String cliente_celular;
    
    void setRua (String rua){
        cliente_ruaEndereco = rua;
    }
    
    String getRua (){
        return cliente_ruaEndereco;
    }
    
    void setNumeroCasa (String numero){
        cliente_numeroCasa = numero;
    }
    
    String getNumero (){
        return cliente_numeroCasa ;
    }
   
   void setCliente_cidade(String cidade){
       this.cliente_cidade = cidade;
   }
   
   String getCliente_cidade(){
       return cliente_cidade;
   }
   
   void setCliente_Uf (String uf ){
       this.cliente_uf = uf;
   }
   String getUf (){
       return cliente_uf;
   }
   
     
      public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    void setNome (String nome){
         this.cliente_nome = nome;
    }
    private String getNome (){
        return this.cliente_nome;
    }
    void setCpf (String cpf){
        this.cliente_cpf = cpf;
    }
    private String getCpf (){
        return this.cliente_cpf;
    }
    
    void setRg (String rg) {
        this.cliente_rg = rg;
    }
    private String getRg (){
        return this.cliente_rg ;
       }
    
   
    void setCelular (String celular){
        this.cliente_celular = celular;
    }
    private String getCelular (){
        return this.cliente_celular;
    }
}
