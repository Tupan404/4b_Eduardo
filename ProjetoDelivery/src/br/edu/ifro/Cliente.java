
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
    private String nome;

      public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    void setNome (String nome){
         this.nome = nome;
    }
    private String getNome (){
        return this.nome;
    }
    
}
