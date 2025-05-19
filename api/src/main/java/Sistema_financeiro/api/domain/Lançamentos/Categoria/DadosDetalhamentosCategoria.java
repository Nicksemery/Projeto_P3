package Sistema_financeiro.api.domain.Lançamentos.Categoria;

public record DadosDetalhamentosCategoria(Long id, String nome) {

    public DadosDetalhamentosCategoria (Categoria categoria) {
        this(categoria.getId(), categoria.getNome());
    }
}
