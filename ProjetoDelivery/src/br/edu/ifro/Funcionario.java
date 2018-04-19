/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)    
    private Integer id;
    private String funcionario_nome;
    private String funcionario_funcao;
    private Double funcionario_salario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuncionario_nome() {
        return funcionario_nome;
    }

    public void setFuncionario_nome(String funcionario_nome) {
        this.funcionario_nome = funcionario_nome;
    }

    public String getFuncionario_funcao() {
        return funcionario_funcao;
    }   

    public void setFuncionario_funcao(String funcionario_funcao) {
        this.funcionario_funcao = funcionario_funcao;
    }

    public Double getFuncionario_salario() {
        return funcionario_salario;
    }

    public void setFuncionario_salario(Double funcionario_salario) {
        this.funcionario_salario = funcionario_salario;
    }

    public String getFuncionario_cpf() {
        return funcionario_cpf;
    }

    public void setFuncionario_cpf(String funcionario_cpf) {
        this.funcionario_cpf = funcionario_cpf;
    }

    public String getFuncionario_rg() {
        return funcionario_rg;
    }

    public void setFuncionario_rg(String funcionario_rg) {
        this.funcionario_rg = funcionario_rg;
    }

    public String getFuncionario_datanasc() {
        return funcionario_datanasc;
    }

    public void setFuncionario_datanasc(String funcionario_datanasc) {
        this.funcionario_datanasc = funcionario_datanasc;
    }

    public String getFuncionario_email() {
        return funcionario_email;
    }

    public void setFuncionario_email(String funcionario_email) {
        this.funcionario_email = funcionario_email;
    }

    public String getFuncionario_telefone() {
        return funcionario_telefone;
    }

    public void setFuncionario_telefone(String funcionario_telefone) {
        this.funcionario_telefone = funcionario_telefone;
    }

    public String getFuncionario_bairro() {
        return funcionario_bairro;
    }

    public void setFuncionario_bairro(String funcionario_bairro) {
        this.funcionario_bairro = funcionario_bairro;
    }

    public String getFuncionario_comp() {
        return funcionario_comp;
    }

    public void setFuncionario_comp(String funcionario_comp) {
        this.funcionario_comp = funcionario_comp;
    }

    public String getFuncionario_numero() {
        return funcionario_numero;
    }

    public void setFuncionario_numero(String funcionario_numero) {
        this.funcionario_numero = funcionario_numero;
    }

    public String getFuncionario_rua() {
        return funcionario_rua;
    }

    public void setFuncionario_rua(String funcionario_rua) {
        this.funcionario_rua = funcionario_rua;
    }
    private String funcionario_cpf;
    private String funcionario_rg;
    private String funcionario_datanasc;
    private String funcionario_email;
    private String funcionario_telefone;
    private String funcionario_bairro;
    private String funcionario_comp;
    private String funcionario_numero;
    private String funcionario_rua;
    
    
    
}