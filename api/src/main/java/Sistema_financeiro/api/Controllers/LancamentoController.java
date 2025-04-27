package Sistema_financeiro.api.Controllers;


import Sistema_financeiro.api.domain.Lançamentos.DadosCadastroLancamento;
import Sistema_financeiro.api.domain.Lançamentos.Lancamento;
import Sistema_financeiro.api.domain.Lançamentos.LancamentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Lancamento")
public class LancamentoController {

    @Autowired
    private LancamentoRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody DadosCadastroLancamento dados) {
        repository.save(new Lancamento(dados));
    }

}
