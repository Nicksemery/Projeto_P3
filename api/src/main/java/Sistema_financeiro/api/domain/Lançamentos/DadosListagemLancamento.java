package Sistema_financeiro.api.domain.Lançamentos;

public record DadosListagemLancamento(
        long id,
        String descricao,
        String data_validacao,
        String data_pagamento,
        double valor,
        TipoLancamento tipo
) {

    public DadosListagemLancamento(Lancamento lancamento) {
        this(lancamento.getId(),
                lancamento.getDescricao(),
                lancamento.getData_vencimento(),
                lancamento.getData_pagamento(),
                lancamento.getValor(),
                lancamento.getTipo());
    }
}
