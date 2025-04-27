package Sistema_financeiro.api.Controllers;

import Sistema_financeiro.api.domain.Pessoa.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody DadosCadastroPessoa dados) {
        repository.save(new Pessoa(dados));
    }

    @GetMapping
    public Page<DadosListagemPessoa> listar(Pageable pageable) {
        return repository.findByAtivoTrue(pageable).map(DadosListagemPessoa::new);
    }

    @PutMapping
    @Transactional
    public void Atualizar(@RequestBody @Valid DadosAtualizarPessoa dados) {
        var pessoa = repository.getReferenceById(dados.id());
        pessoa.AtualizarInformacao(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void Excluir(@PathVariable long id) {
        var pessoa = repository.getReferenceById(id);
        pessoa.excluir();
    }


}
