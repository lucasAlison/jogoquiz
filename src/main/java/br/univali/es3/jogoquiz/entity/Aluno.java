package br.univali.es3.jogoquiz.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome", nullable =false)
    private String nome;

    @Column(name = "cpf", nullable =false , unique= true)
    private String cpf;

    @Column(name = "senha", nullable =false)
    private String senha;

    public Aluno(String name,String id,String password)
    {
        nome = name;
        cpf = id;
        senha = password;
    }
    public Long getId()
    {
        return id;
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
