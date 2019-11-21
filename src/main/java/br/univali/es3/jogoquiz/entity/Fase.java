package br.univali.es3.jogoquiz.entity;

import java.util.ArrayList;

public class Fase {

    private ArrayList<Pergunta> perguntas;

    public ArrayList getPerguntas()
    {
        return perguntas;
    }

    public void addPergunta(Pergunta pergunta)
    {
        perguntas.add(pergunta);
    }
}
