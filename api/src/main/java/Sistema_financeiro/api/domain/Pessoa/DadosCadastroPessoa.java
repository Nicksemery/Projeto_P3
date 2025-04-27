package Sistema_financeiro.api.domain.Pessoa;

import Sistema_financeiro.api.domain.Pessoa.Endereco.DadosEndereco;
import Sistema_financeiro.api.domain.Pessoa.Endereco.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoa(
        @NotBlank String nome,
        @NotNull @Valid DadosEndereco endereco
) {
}
