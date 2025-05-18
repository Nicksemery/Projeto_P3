package Sistema_financeiro.api.domain.Pessoa;

import jakarta.validation.constraints.NotNull;

public record DadosEstrangeirosPessoa(@NotNull long id) {

    public DadosEstrangeirosPessoa (Pessoa pessoa){
        this(pessoa.getId());
    }
}
