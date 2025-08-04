package br.com.cancelier.api_produtos_elastic.service;

import br.com.cancelier.api_produtos_elastic.domain.Produto;
import br.com.cancelier.api_produtos_elastic.elastic.ProdutoElasticRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProdutoService {

    private final ProdutoElasticRepo produtoElasticRepo;

    public ProdutoService(ProdutoElasticRepo produtoElasticRepo) {
        this.produtoElasticRepo = produtoElasticRepo;
    }

    public Produto salvar(Produto produto) {
        return produtoElasticRepo.save(produto);
    }

    public List<Produto> listarTodos() {
        Iterable<Produto> produtos = produtoElasticRepo.findAll();
        return StreamSupport.stream(produtos.spliterator(), false)
                .collect(Collectors.toList());
    }

    public Optional<Produto> buscarPorId(String id) {
        return produtoElasticRepo.findById(id).stream().findFirst();
    }



}
