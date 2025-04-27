package Sistema_financeiro.api.domain.Lançamentos;


import jakarta.validation.constraints.NotBlank;

public record DadosCadastroLancamento(
        @NotBlank String descricao,
        @NotBlank String data_vencimento,
        String data_pagamento,
        @NotBlank double valor,
        String observacao,
        @NotBlank TipoLancamento tipo

) {
}
