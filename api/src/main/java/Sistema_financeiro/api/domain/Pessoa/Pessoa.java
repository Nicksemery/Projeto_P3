package Sistema_financeiro.api.domain.Pessoa;

import Sistema_financeiro.api.domain.Lançamentos.Lancamento;
import Sistema_financeiro.api.domain.Pessoa.Endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Pessoa")
@Table(name = "Pessoa")
@Data
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Embedded
    private Endereco endereco;
    private boolean ativo;


    @OneToMany(mappedBy = "pessoa")
    private List<Lancamento> lancamentos = new ArrayList<>();


    public Pessoa() {}

    public Pessoa(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.ativo = true;
        this.endereco = new Endereco(dados.endereco());
    }

    public void AtualizarInformacao(@Valid DadosAtualizarPessoa dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.endereco() != null) {
            this.endereco.AtualizarInformacaoEndereco(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }


}
