package Sistema_financeiro.api.domain.Lançamentos;

public record DadosDetalhamentoLancamento(long id, String descricao, String data_vencimento, String data_pagamento, double valor, String observacao, TipoLancamento tipo) {

    public DadosDetalhamentoLancamento (Lancamento lancamento){
        this(lancamento.getId(),lancamento.getDescricao(),lancamento.getData_vencimento(), lancamento.getData_pagamento(),lancamento.getValor(),lancamento.getObservacao(),lancamento.getTipo());
    }
}
