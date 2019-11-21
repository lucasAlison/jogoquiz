package br.univali.es3.jogoquiz.entity;

import java.util.ArrayList;

public class Trilha {

    private String nome;
    private ConteudoJogo conteudo;
    private Nivel nivel;
    private ArrayList<Fase> fases = new ArrayList();
    private float pontuacao;

    public Trilha(String name,ConteudoJogo content ,Nivel level, float score)
    {
        nome = name;
        conteudo = content;
        nivel = level;
        pontuacao = score;
    }
    public String getNome()
    {
        return nome;
    }

    public String getConteudoJogo()
    {
        return conteudo.getNome();
    }

    public String getNivel()
    {
        return nivel.getNome();
    }

    public float getPontuacao()
    {
        return pontuacao;
    }

    public ArrayList getFases()
    {
        return fases;
    }

    public void addFases(Fase fase)
    {
        fases.add(fase);
    }


}
