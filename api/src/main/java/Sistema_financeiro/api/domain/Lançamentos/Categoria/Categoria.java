package Sistema_financeiro.api.domain.Lançamentos.Categoria;


import Sistema_financeiro.api.domain.Lançamentos.Lancamento;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "categoria")
@Table(name = "categoria")
@Data
@EqualsAndHashCode(of = "id")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private boolean ativo;



    @OneToMany(mappedBy = "categoria")
    private List<Lancamento> lancamentos = new ArrayList<>();

    public Categoria() {}

    public Categoria(DadosCadastroCategoria dados) {
        this.ativo = true;
        this.nome = dados.nome();
    }

    public void excluir() {
        this.ativo = false;
    }
}

