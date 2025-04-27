package Sistema_financeiro.api.domain.Pessoa;

import Sistema_financeiro.api.domain.Pessoa.Endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPessoa(
        @NotNull long id,
        String nome,
        DadosEndereco endereco
) {
}
