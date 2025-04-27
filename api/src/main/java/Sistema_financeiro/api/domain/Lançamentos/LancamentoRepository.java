package Sistema_financeiro.api.domain.Lançamentos;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
    Page<DadosListagemLancamento> findBy();
}
