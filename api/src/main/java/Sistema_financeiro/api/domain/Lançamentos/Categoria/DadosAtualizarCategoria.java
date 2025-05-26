package Sistema_financeiro.api.domain.Lançamentos.Categoria;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarCategoria(
        @NotNull Long id,
        String nome) {
}
