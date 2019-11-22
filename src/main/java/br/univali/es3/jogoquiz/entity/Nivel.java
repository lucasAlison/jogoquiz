package br.univali.es3.jogoquiz.entity;

import javax.persistence.*;

@Entity
public class Nivel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome", nullable =false, unique=true)
    private String nome;

    public Long getId()
    {
        return id;
    }
    public String getNome()
    {
        return nome;
    }

    public void setNome(String name)
    {
        nome = name;
    }


}
