package Sistema_financeiro.api.Controllers;


import Sistema_financeiro.api.domain.Lançamentos.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Lancamento")
public class LancamentoController {

    @Autowired
    private LancamentoRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosCadastroLancamento dados) {
        repository.save(new Lancamento(dados));
    }

    @GetMapping
    public Page<DadosListagemLancamento> Listar(Pageable pageable) {
       return repository.findAll(pageable).map(DadosListagemLancamento::new);
    }

    @PutMapping
    @Transactional
    public void Atualizar(@RequestBody @Valid DadosAtualizarLancamento dados) {
        var lancamanto = repository.getReferenceById(dados.id());
        lancamanto.AtualizarInformacao(dados);
    }

    @DeleteMapping
    @Transactional
    public void deletar(@PathVariable long id) {
        repository.deleteById(id);
    }

}
