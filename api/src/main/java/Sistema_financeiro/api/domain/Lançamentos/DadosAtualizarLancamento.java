package Sistema_financeiro.api.domain.Lançamentos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarLancamento(
        @NotNull long id,
        String descricao,
        TipoLancamento tipo,
        String data_vencimento,
        String data_pagamento,
        Double valor,
        String observacao
) {
}
