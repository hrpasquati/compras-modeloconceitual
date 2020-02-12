package com.hrpasquati.cursomc.cursomc.resourceControleRest;

import com.hrpasquati.cursomc.cursomc.domain.Pedido;
import com.hrpasquati.cursomc.cursomc.servicesResponsavelPelaComunicacao.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResoucer {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id){
        Pedido obj = pedidoService.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
