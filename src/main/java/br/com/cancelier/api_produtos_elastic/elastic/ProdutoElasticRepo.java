package br.com.cancelier.api_produtos_elastic.elastic;

import br.com.cancelier.api_produtos_elastic.domain.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProdutoElasticRepo extends ElasticsearchRepository<Produto, String> {
}
