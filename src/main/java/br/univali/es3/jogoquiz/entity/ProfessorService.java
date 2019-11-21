package br.univali.es3.jogoquiz.entity;

import java.io.File;
import java.util.ArrayList;

public class ProfessorService {

    public Boolean cadastrarProfessor(Professor professor)
    {
        return true;
    }

    public Boolean cadastrarPerguntas(ArrayList<Pergunta> perguntas)
    {
        return true;
    }

    public Boolean cadastrarTrilhas(Trilha trilha)
    {
        return true;
    }

    public Boolean importarAlunos(File alunos)
    {
        return true;
    }

    public Boolean login(String cpf, String senha)
    {
        return true;
    }

   /* public Progresso relatorioAluno(Aluno aluno)
    {
        return progresso
    }
    */

   public ArrayList<Progresso> relatorioAlunos()
   {
       ArrayList<Progresso> t = new ArrayList();
       return t;
   }

  /* public File exportarRelatorio(Progresso progresso)
   {
       return file;
   }
   */

}
