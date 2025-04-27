package Sistema_financeiro.api.domain.Lançamentos.Categoria;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroCategoria(
       @NotBlank String nome
) {
}
