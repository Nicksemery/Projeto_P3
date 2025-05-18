package Sistema_financeiro.api.domain.Lançamentos.Categoria;

import jakarta.validation.constraints.NotNull;

public record DadosEstrangeirosCategoria(@NotNull long id) {

    public DadosEstrangeirosCategoria(Categoria categoria){
        this(categoria.getId());
    }
}
