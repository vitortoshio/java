package com.atividade.ava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atividade.ava.model.Pedido;
import com.atividade.ava.repository.PedidoRepository;
import com.atividade.ava.repository.ProdutoRepository;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pedidos", pedidoRepository.findAll());
        return "pedidos/lista";
    }

    @GetMapping("/novo")
    public String novoPedido(Model model) {
        model.addAttribute("pedido", new Pedido());
        model.addAttribute("produtos", produtoRepository.findAll());
        return "pedidos/form";
    }

    @PostMapping("/salvar")
    public String salvarPedido(Pedido pedido) {
        pedido.setValor(pedido.getProduto().getPreco() * pedido.getQuantidade());
        pedidoRepository.save(pedido);
        return "redirect:/pedidos";
    }
}


