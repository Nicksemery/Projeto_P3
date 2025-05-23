package Sistema_financeiro.api.domain.Lançamentos;



import Sistema_financeiro.api.domain.Lançamentos.Categoria.Categoria;
import Sistema_financeiro.api.domain.Pessoa.Pessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;


public record DadosCadastroLancamento(
        @NotBlank String descricao,
        @NotNull LocalDate data_vencimento,
        LocalDate data_pagamento,
        @NotNull BigDecimal valor,
        String observacao,
        @NotNull @Valid TipoLancamento tipo,
        @NotNull @Valid Pessoa pessoa,
        @NotNull @Valid Categoria categoria
) {
}
