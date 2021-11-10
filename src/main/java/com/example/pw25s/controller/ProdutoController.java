package com.example.pw25s.controller;

import com.example.pw25s.model.ProdutoSalvarDTO;
import com.example.pw25s.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping(value = "/estoque")
    public String home(Model model) {
        model.addAttribute("produtos",  produtoRepository.findAll());
        return "produto/estoque";
    }

    @RequestMapping("/novo")
    public String novoProduto(ProdutoSalvarDTO produtoSalvarDTO){
        return "produto/cadastro";
    }

    @PostMapping(value = "/salvar")
    public String salvarProduto(@Valid ProdutoSalvarDTO produtoSalvarDTO, BindingResult result){
        if(!result.hasErrors()) {
            produtoRepository.save(produtoSalvarDTO.toProduto());
        }
        return "produto/cadastro";
    }
}
