package Sistema_financeiro.api.domain.Pessoa;

import Sistema_financeiro.api.domain.Pessoa.Endereco.Endereco;

public record DadosListagemPessoa(
        long id,
        String nome,
        Endereco endereco
) {

    public DadosListagemPessoa (Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getEndereco());
}
}

