package Sistema_financeiro.api.domain.Lançamentos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizarLancamento(
        @NotNull long id,
        String descricao,
        TipoLancamento tipo,
        LocalDate data_vencimento,
        LocalDate data_pagamento,
        Double valor,
        String observacao
) {
}
