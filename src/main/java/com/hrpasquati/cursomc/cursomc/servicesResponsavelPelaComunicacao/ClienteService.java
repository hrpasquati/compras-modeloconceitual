package com.hrpasquati.cursomc.cursomc.servicesResponsavelPelaComunicacao;

import com.hrpasquati.cursomc.cursomc.domain.Cliente;
import com.hrpasquati.cursomc.cursomc.repositoyOuDAO.ClienteRepository;
import com.hrpasquati.cursomc.cursomc.servicesResponsavelPelaComunicacao.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente find(Integer id){
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado" + Cliente.class.getName()));
    }
}
