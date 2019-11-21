package br.univali.es3.jogoquiz.entity;

import java.util.ArrayList;

public class Progresso {

    private Aluno aluno;
    private ArrayList<Pergunta> perguntasCorretas = new ArrayList();
    private ArrayList<Pergunta> perguntasIncorretas = new ArrayList();
    private ArrayList<Trilha> trilhas = new ArrayList();

    public Progresso(Aluno student)
    {
        aluno = student;
    }
    public Aluno getAluno()
    {
        return aluno;
    }

    public int getNumeroPerguntasCorretas()
    {
        return perguntasCorretas.size();
    }

    public int getNumeroPerguntasIncorretas()
    {
        return perguntasIncorretas.size();
    }

    public ArrayList getTrilhas()
    {
        return trilhas;
    }

    public void adicionaTrilha(Trilha trilha)
    {
        trilhas.add(trilha);
    }

    public void adicionaPerguntaCorreta(Pergunta pergunta)
    {
        perguntasCorretas.add(pergunta);
    }

    public void adicionaPerguntaIncorreta(Pergunta pergunta)
    {
        perguntasIncorretas.add(pergunta);
    }
}
