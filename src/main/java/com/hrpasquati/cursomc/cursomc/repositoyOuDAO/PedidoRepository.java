package com.hrpasquati.cursomc.cursomc.repositoyOuDAO;

import com.hrpasquati.cursomc.cursomc.domain.Categoria;
import com.hrpasquati.cursomc.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {


}
