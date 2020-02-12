package com.hrpasquati.cursomc.cursomc.servicesResponsavelPelaComunicacao;

import com.hrpasquati.cursomc.cursomc.domain.Categoria;
import com.hrpasquati.cursomc.cursomc.repositoyOuDAO.CategoriaRepository;
import com.hrpasquati.cursomc.cursomc.servicesResponsavelPelaComunicacao.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
