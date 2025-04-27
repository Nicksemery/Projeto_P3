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

    @OneToOne
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
}
