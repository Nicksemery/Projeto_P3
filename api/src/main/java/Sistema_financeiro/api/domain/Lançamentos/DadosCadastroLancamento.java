package Sistema_financeiro.api.domain.Lançamentos;


import Sistema_financeiro.api.domain.Lançamentos.Categoria.DadosEstrangeirosCategoria;
import Sistema_financeiro.api.domain.Pessoa.DadosEstrangeirosPessoa;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Calendar;

public record DadosCadastroLancamento(
        @NotBlank String descricao,
        @NotNull String data_vencimento,
        String data_pagamento,
        @NotNull double valor,
        String observacao,
        @NotNull TipoLancamento tipo,
        @NotNull DadosEstrangeirosPessoa codigo_pessoa,
        @NotNull DadosEstrangeirosCategoria codigo_categoria

) {
}
