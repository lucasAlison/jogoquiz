package br.univali.es3.jogoquiz.controller;

import br.univali.es3.jogoquiz.entity.Professor;
import br.univali.es3.jogoquiz.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogoquiz/professor")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepo;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Professor> listar() {
        return professorRepo.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Professor> buscarPorId(@PathVariable(value = "id") long id){
        Optional<Professor> professor = professorRepo.findById(id);
        if (professor.isPresent())
            return new ResponseEntity<Professor>(professor.get(), HttpStatus.OK);
        else
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Professor inserir(@Valid @RequestBody Professor professor) {
        return professorRepo.save(professor);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Professor> alterar(@PathVariable(value = "id") long id, @Valid @RequestBody Professor professor){
        Optional<Professor> oldProfessor = professorRepo.findById(id);
        if (oldProfessor.isPresent()){
            Professor newProfessor = oldProfessor.get();
            newProfessor.setNome(professor.getNome());
            newProfessor.setCpf(professor.getCpf());
            newProfessor.setSenha(professor.getSenha());
            professorRepo.save(newProfessor);
            return new ResponseEntity<Professor>(newProfessor, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> remover(@PathVariable(value = "id") long id){
        Optional<Professor> professor = professorRepo.findById(id);
        if (professor.isPresent()){
            professorRepo.delete(professor.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
