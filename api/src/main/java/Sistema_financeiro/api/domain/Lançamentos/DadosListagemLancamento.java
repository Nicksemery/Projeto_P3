package Sistema_financeiro.api.domain.Lançamentos;

import java.time.LocalDate;

public record DadosListagemLancamento(
        long id,
        String descricao,
        LocalDate data_vencimento,
        LocalDate data_pagamento,
        double valor,
        String observacao,
        TipoLancamento tipo
) {

    public DadosListagemLancamento (Lancamento lancamento){
        this(lancamento.getId(),lancamento.getDescricao(),lancamento.getData_vencimento(),lancamento.getData_pagamento(),lancamento.getValor(),lancamento.getObservacao(),lancamento.getTipo());
    }
}
