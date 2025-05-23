package Sistema_financeiro.api.domain.Lançamentos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
    Page<Lancamento> findAllByAtivoTrue(Pageable pag);

    ;
}
