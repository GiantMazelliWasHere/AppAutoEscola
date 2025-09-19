package br.com.fiap3espa.Auto_Escola_3espa.endereco;

public record DadosEndereco(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf,
        String cep) {
}
