package br.com.fiap3espa.Auto_Escola_3espa.controller;


import br.com.fiap3espa.Auto_Escola_3espa.instrutor.DadosCadastroInstrutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    @PostMapping
    public void cadastroInstrutor(@RequestBody DadosCadastroInstrutor dados){
        System.out.println(dados);;
    }
}
