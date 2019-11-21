package br.univali.es3.jogoquiz.entity;

import java.util.ArrayList;

public class Pergunta {

    private String pergunta;
    private Nivel nivel;
    private ArrayList<RespostasPerguntas> respostas = new ArrayList();

    public Pergunta(String question, Nivel level)
    {
        pergunta = question;
        nivel = level;
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
