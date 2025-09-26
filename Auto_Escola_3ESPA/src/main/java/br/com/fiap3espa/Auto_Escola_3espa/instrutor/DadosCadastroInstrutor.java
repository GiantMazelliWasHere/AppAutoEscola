package br.com.fiap3espa.Auto_Escola_3espa.instrutor;

import br.com.fiap3espa.Auto_Escola_3espa.endereco.DadosEndereco;

public record DadosCadastroInstrutor(
        String nome,
        String email,
        String cnh,
        Especialidade especialidade,
        DadosEndereco endereco) {
}
