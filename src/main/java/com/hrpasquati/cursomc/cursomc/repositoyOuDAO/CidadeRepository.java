package com.hrpasquati.cursomc.cursomc.repositoyOuDAO;

import com.hrpasquati.cursomc.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
