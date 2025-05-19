package Sistema_financeiro.api.domain.Lançamentos;



import Sistema_financeiro.api.domain.Lançamentos.Categoria.DadosEstrangeirosCategoria;
import Sistema_financeiro.api.domain.Pessoa.DadosEstrangeirosPessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record DadosCadastroLancamento(
        @NotBlank String descricao,
        @NotNull LocalDate data_vencimento,
        LocalDate data_pagamento,
        @NotNull double valor,
        String observacao,
        @NotNull TipoLancamento tipo,
        @NotNull @Valid DadosEstrangeirosPessoa pessoa,
        @NotNull @Valid DadosEstrangeirosCategoria categoria
) {
}
