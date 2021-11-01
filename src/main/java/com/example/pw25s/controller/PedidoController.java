package com.example.pw25s.controller;

import com.example.pw25s.model.PedidoSalvarDTO;
import com.example.pw25s.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

    @RequestMapping("/novo")
    public String novoPedido(){
        return "pedido/formulario";
    }

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public String salvarPedido(PedidoSalvarDTO pedidoSalvarDTO){
        pedidoRepository.save(pedidoSalvarDTO.toPedido());
        return "pedido/formulario";
    }
}
