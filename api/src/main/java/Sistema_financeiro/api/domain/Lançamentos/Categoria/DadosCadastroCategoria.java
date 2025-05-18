package Sistema_financeiro.api.domain.Lançamentos.Categoria;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroCategoria(
       @NotNull String nome
) {
}
