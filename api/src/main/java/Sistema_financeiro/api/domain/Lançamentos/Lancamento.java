package Sistema_financeiro.api.domain.Lançamentos;


import Sistema_financeiro.api.domain.Lançamentos.Categoria.Categoria;
import Sistema_financeiro.api.domain.Pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Lancamento")
@Table(name = "Lancamento")
@Data
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private TipoLancamento tipo;

    private String descricao;
    private String data_vencimento;
    private String data_pagamento;
    private Double valor;
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "codigo_categoria")
    private Categoria categorias;

    @ManyToOne
    @JoinColumn(name = "codigo_pessoa")
    private Pessoa pessoas;


    public Lancamento() {}

    public Lancamento(DadosCadastroLancamento dados) {
        this.descricao = dados.descricao();
        this.tipo = dados.tipo();
        this.data_vencimento = dados.data_vencimento();
        this.data_pagamento = dados.data_pagamento();
        this.valor = dados.valor();
        this.observacao = dados.observacao();
    }

    public void AtualizarInformacao(DadosAtualizarLancamento dados) {
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.tipo() != null){
            this.tipo = dados.tipo();
        }
        if (dados.data_vencimento() != null) {
            this.data_vencimento = dados.data_vencimento();
        }
        if (dados.data_pagamento() != null) {
            this.data_pagamento = dados.data_pagamento();
        }
        if (dados.valor() != null){
            this.valor = dados.valor();
        }
        if (dados.observacao() != null) {
            this.observacao = dados.observacao();
        }
    }
}
