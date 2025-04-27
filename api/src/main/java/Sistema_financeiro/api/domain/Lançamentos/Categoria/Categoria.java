package Sistema_financeiro.api.domain.Lançamentos.Categoria;


import Sistema_financeiro.api.domain.Lançamentos.Lancamento;
import Sistema_financeiro.api.domain.Pessoa.DadosAtualizarPessoa;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "categoria")
@Table(name = "categoria")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @OneToMany(mappedBy = "categorias")
    private List<Lancamento> lancamentos = new ArrayList<>();

    public Categoria() {}

    public Categoria(DadosCadastroCategoria dados) {
        this.nome = dados.nome();
    }
}
