package Sistema_financeiro.api.domain.Lançamentos.Categoria;


import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "categoria")
@Table(name = "categoria")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    public Categoria() {}

    public Categoria(DadosCadastroCategoria dados) {
        this.nome = dados.nome();
    }
}
