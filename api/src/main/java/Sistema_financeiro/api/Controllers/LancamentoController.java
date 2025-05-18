package Sistema_financeiro.api.Controllers;


import Sistema_financeiro.api.domain.Lançamentos.*;
import Sistema_financeiro.api.domain.Lançamentos.Categoria.CategoriaRepository;
import Sistema_financeiro.api.domain.Pessoa.PessoaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("Lancamento")
public class LancamentoController {

    @Autowired
    private LancamentoRepository repository;
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping
    @Transactional
    public ResponseEntity Cadastrar(@RequestBody @Valid DadosCadastroLancamento dados, UriComponentsBuilder uriBuilder) {
        var pessoas = pessoaRepository.getReferenceById(dados.codigo_pessoa().id());
        var categorias = categoriaRepository.getReferenceById(dados.codigo_categoria().id());
        var lancamento = new Lancamento(dados, pessoas, categorias);
        repository.save(lancamento);
        var uri = uriBuilder.path("/Pessoa/{id}").buildAndExpand(lancamento.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoLancamento(lancamento));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemLancamento>> listar(@PageableDefault(size = 10, sort = {"descricao"})Pageable pageable) {
        var pagina = repository.findAll(pageable).map(DadosListagemLancamento::new);
        return ResponseEntity.ok(pagina);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var lancamento = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoLancamento(lancamento));
    }

    @PutMapping
    @Transactional
    public ResponseEntity Atualizar(@RequestBody @Valid DadosAtualizarLancamento dados) {
        var lancamento = repository.getReferenceById(dados.id());
        lancamento.AtualizarInformacao(dados);
        return ResponseEntity.ok(new DadosDetalhamentoLancamento(lancamento));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity Excluir(@PathVariable long id) {
        var lancamento = repository.getReferenceById(id);
        lancamento.excluir();
        return ResponseEntity.noContent().build();
    }
    }
