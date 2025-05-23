package Sistema_financeiro.api.domain.Lançamentos;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosDetalhamentoLancamento(Long id,
                                          String descricao,
                                          LocalDate data_vencimento,
                                          LocalDate data_pagamento,
                                          BigDecimal valor,
                                          String observacao,
                                          TipoLancamento tipo
                                          ) {

    public DadosDetalhamentoLancamento (Lancamento lancamento){
        this(lancamento.getId(),lancamento.getDescricao(),lancamento.getData_vencimento(), lancamento.getData_pagamento(),lancamento.getValor(),lancamento.getObservacao(),lancamento.getTipo());
    }
}
