package com.hrpasquati.cursomc.cursomc.repositoyOuDAO;

import com.hrpasquati.cursomc.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
