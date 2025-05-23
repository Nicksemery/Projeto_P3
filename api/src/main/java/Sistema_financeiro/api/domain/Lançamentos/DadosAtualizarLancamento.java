package Sistema_financeiro.api.domain.Lançamentos;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosAtualizarLancamento(
        @NotNull Long id,
        String descricao,
        TipoLancamento tipo,
        LocalDate data_vencimento,
        LocalDate data_pagamento,
        BigDecimal valor,
        String observacao
) {
}
