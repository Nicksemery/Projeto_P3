package Sistema_financeiro.api.Controllers;

import Sistema_financeiro.api.domain.Lançamentos.Categoria.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosCadastroCategoria dados) {
        repository.save(new Categoria(dados));
    }

    @GetMapping
    public List<DadosListagemCategoria> listar() {
        return repository.findAll().stream().map(DadosListagemCategoria::new).toList();
    }
}
