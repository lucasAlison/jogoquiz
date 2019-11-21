package br.univali.es3.jogoquiz.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private String cpf;

    private String senha;

    public Aluno(String name,String id,String password)
    {
        nome = name;
        cpf = id;
        senha = password;
    }
    public String getNome()
    {
        return nome;
    }
    public String getCpf()
    {
        return cpf;
    }
    public String getSenha()
    {
        return senha;
    }

    public void setNome(String name)
    {
        nome = name;
    }
    public void setCpf(String name)
    {
        cpf = name;
    }
    public void setSenha(String name)
    {
        senha = name;
    }

}
