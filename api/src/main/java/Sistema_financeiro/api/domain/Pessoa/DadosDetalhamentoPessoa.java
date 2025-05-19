package Sistema_financeiro.api.domain.Pessoa;

import Sistema_financeiro.api.domain.Pessoa.Endereco.Endereco;

public record DadosDetalhamentoPessoa(long id, String nome, Endereco endereco) {

    public DadosDetalhamentoPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getEndereco());
    }
}
