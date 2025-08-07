package br.com.cancelier.api_produtos_elastic.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "produtos")
public class Produto {

    @Id
    private String id;

    private String nome;

    private Integer quantidade;

}
