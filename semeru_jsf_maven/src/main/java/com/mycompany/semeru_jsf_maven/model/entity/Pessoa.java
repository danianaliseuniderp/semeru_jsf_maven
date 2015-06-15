
package com.mycompany.semeru_jsf_maven.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable{ 
    private static final long SerialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "IdPessoa", nullable = false)
    private Integer IdPessoa;
    @Column(name="Name",nullable = false,length = 80)
    private String nome;
    @Column(name="Email",nullable = false,length = 80)
    private String email;
     @Column(name="Telefone",nullable = false,length = 15)
    private String telefone;
      @Column(name="Cpf",nullable = false,length = 14)
    private String cpf;
       @Column(name="Data de Nascimento",nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datadenascimento;
        @Column(name="Data de Cadastro",nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datadecadastro;

    public Pessoa() {
    }

    public Integer getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(Integer IdPessoa) {
        this.IdPessoa = IdPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public Date getDatadecadastro() {
        return datadecadastro;
    }

    public void setDatadecadastro(Date datadecadastro) {
        this.datadecadastro = datadecadastro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.IdPessoa != null ? this.IdPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.IdPessoa != other.IdPessoa && (this.IdPessoa == null || !this.IdPessoa.equals(other.IdPessoa))) {
            return false;
        }
        return true;
    }
        
        
     
}
