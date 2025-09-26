package br.com.fiap3espa.Auto_Escola_3espa.controller;


import br.com.fiap3espa.Auto_Escola_3espa.instrutor.DadosCadastroInstrutor;
import br.com.fiap3espa.Auto_Escola_3espa.instrutor.Instrutor;
import br.com.fiap3espa.Auto_Escola_3espa.instrutor.InstrutorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.GroupSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    @Autowired
    private InstrutorRepository repository;

    @PostMapping
    @Transactional
    public void cadastroInstrutor(@RequestBody DadosCadastroInstrutor dados){
        //System.out.println(dados);
        repository.save(new Instrutor(dados));
    }

    @GetMapping
    public void listarInstrutores(){}

    @PutMapping
    public void atualizarInstrutor(){}

    @DeleteMapping
    public void excluirInstrutor() {}

}
