package Sistema_financeiro.api.domain.Lançamentos.Categoria;

public record DadosListagemCategoria(
        Long id,
        String nome
) {

    public DadosListagemCategoria(Categoria categoria){
        this(categoria.getId(), categoria.getNome());
    }
}
