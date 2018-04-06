
package br.edu.ifro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity    @GeneratedValue (strategy = GenerationType.IDENTITY)

public class Cliente {
    
    @Id
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
