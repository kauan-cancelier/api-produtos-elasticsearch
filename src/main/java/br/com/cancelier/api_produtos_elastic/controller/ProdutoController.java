package br.com.cancelier.api_produtos_elastic.controller;

import br.com.cancelier.api_produtos_elastic.domain.Produto;
import br.com.cancelier.api_produtos_elastic.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return produtoService.listarTodos();
    }

    @GetMapping("{id}")
    public Optional<Produto> buscar(@PathVariable String id) {
        return produtoService.buscarPorId(id);
    }

}
