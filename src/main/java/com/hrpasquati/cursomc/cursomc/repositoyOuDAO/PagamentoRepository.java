package com.hrpasquati.cursomc.cursomc.repositoyOuDAO;

import com.hrpasquati.cursomc.cursomc.domain.Pagamento;
import com.hrpasquati.cursomc.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {


}
