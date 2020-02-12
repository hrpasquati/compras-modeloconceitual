package com.hrpasquati.cursomc.cursomc.repositoyOuDAO;

import com.hrpasquati.cursomc.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
