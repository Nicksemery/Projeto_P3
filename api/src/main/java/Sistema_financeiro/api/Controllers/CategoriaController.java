package Sistema_financeiro.api.Controllers;

import Sistema_financeiro.api.domain.Lançamentos.Categoria.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity Cadastrar(@RequestBody @Valid DadosCadastroCategoria dados) {
        var categoria = new Categoria(dados);
        repository.save(categoria);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<DadosListagemCategoria> listar() {
        return repository.findAll().stream().map(DadosListagemCategoria::new).toList();
    }
}
