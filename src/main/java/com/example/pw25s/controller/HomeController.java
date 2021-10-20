package com.example.pw25s.controller;

import com.example.pw25s.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNome("Mac Book Pro Charger");
        pedido.setUrlItem("https://amzn.to/3lXhoXt");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/51H7tRV8bxL._AC_SL1498_.jpg");
        pedido.setDescricao("uma descrição qualquer para esse pedido");

        List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido);

        model.addAttribute("pedidos", pedidos);
        return "home";
    }

}
