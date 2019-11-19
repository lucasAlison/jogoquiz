package br.univali.es3.jogoquiz.controller;

import br.univali.es3.jogoquiz.entity.Aluno;
import br.univali.es3.jogoquiz.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogoquiz/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepo;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Aluno> listar() {
        return alunoRepo.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Aluno> buscarPorId(@PathVariable(value = "id") long id){
        Optional<Aluno> aluno = alunoRepo.findById(id);
        if (aluno.isPresent())
            return new ResponseEntity<Aluno>(aluno.get(), HttpStatus.OK);
        else
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Aluno inserir(@Valid @RequestBody Aluno aluno) {
        return alunoRepo.save(aluno);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Aluno> alterar(@PathVariable(value = "id") long id, @Valid @RequestBody Aluno aluno){
        Optional<Aluno> oldAluno = alunoRepo.findById(id);
        if (oldAluno.isPresent()){
            Aluno newAluno = oldAluno.get();
            newAluno.setNome(aluno.getNome());
            newAluno.setCpf(aluno.getCpf());
            newAluno.setSenha(aluno.getSenha());
            alunoRepo.save(newAluno);
            return new ResponseEntity<Aluno>(newAluno, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> remover(@PathVariable(value = "id") long id){
        Optional<Aluno> aluno = alunoRepo.findById(id);
        if (aluno.isPresent()){
            alunoRepo.delete(aluno.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
