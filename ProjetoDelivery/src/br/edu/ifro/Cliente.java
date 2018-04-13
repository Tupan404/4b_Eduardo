
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
    private String cliente_endereco;
    private String cliente_celular;
    
     
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
    private void setCpf (String cpf){
        this.cliente_cpf = cpf;
    }
    private String getCpf (){
        return this.cliente_cpf;
    }
    
    private void setRg (String rg) {
        this.cliente_rg = rg;
    }
    private String getRg (){
        return this.cliente_rg ;
       }
    
    private void setEndereco (String endereco){
        this.cliente_endereco = endereco;
    }    
    private String getEndereco (){
        return this.cliente_endereco;
    }
    private void setCelular (String celular){
        this.cliente_celular = celular;
    }
    private String getCelular (){
        return this.cliente_celular;
    }
}
