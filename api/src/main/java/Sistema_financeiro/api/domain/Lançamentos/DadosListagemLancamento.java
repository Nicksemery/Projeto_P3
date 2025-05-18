package Sistema_financeiro.api.domain.Lançamentos;

import Sistema_financeiro.api.domain.Lançamentos.Categoria.Categoria;
import Sistema_financeiro.api.domain.Pessoa.DadosEstrangeirosPessoa;
import Sistema_financeiro.api.domain.Pessoa.Pessoa;

public record DadosListagemLancamento(
        long id,
        String descricao,
        String data_validacao,
        String data_pagamento,
        double valor,
        String observacao,
        TipoLancamento tipo
) {

    public DadosListagemLancamento (Lancamento lancamento){
        this(lancamento.getId(),lancamento.getDescricao(),lancamento.getData_vencimento(),lancamento.getData_pagamento(),lancamento.getValor(),lancamento.getObservacao(),lancamento.getTipo());
    }
}
