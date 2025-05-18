package Sistema_financeiro.api.domain.Pessoa;

public record DadosDetalhamentoPessoa(long id, String nome) {

    public DadosDetalhamentoPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome());
    }
}
