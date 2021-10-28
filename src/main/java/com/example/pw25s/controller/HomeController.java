package com.example.pw25s.controller;

import com.example.pw25s.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("pedidos",  pedidoRepository.findAll());
        return "home";
    }
}
