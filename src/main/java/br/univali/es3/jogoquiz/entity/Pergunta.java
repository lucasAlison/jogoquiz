package br.univali.es3.jogoquiz.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "pergunta", nullable =false)
    private String pergunta;

    @Column(name = "nivel", nullable =false)
    private Nivel nivel;

    @Column(name = "respostas", nullable =false)
    private ArrayList<RespostasPerguntas> respostas = new ArrayList();

    public Pergunta(String question, Nivel level)
    {
        pergunta = question;
        nivel = level;
    }
    public Long getId()
    {
        return id;
    }
    public String getPergunta()
    {
        return pergunta;
    }
    public String getNivel()
    {
        return nivel.getNome();
    }

    public ArrayList getRespostas()
    {
        return respostas;
    }
}
