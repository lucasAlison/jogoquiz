package br.univali.es3.jogoquiz.entity;

import br.univali.es3.jogoquiz.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Professor cadastrarProfessor(Professor professor)
    {
        return professorRepository.save(professor);
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
