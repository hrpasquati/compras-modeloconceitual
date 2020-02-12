package com.hrpasquati.cursomc.cursomc.servicesResponsavelPelaComunicacao;

import com.hrpasquati.cursomc.cursomc.domain.Categoria;
import com.hrpasquati.cursomc.cursomc.domain.Pedido;
import com.hrpasquati.cursomc.cursomc.repositoyOuDAO.PedidoRepository;
import com.hrpasquati.cursomc.cursomc.servicesResponsavelPelaComunicacao.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
