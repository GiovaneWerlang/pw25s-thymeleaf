package com.example.pw25s.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class ProdutoSalvarDTO {

    @NotBlank
    private String nomeProduto;

    @NotNull
    @DecimalMin(value = "0.00",inclusive = false)
    private BigDecimal valorProduto;

    @NotBlank
    private String urlImagem;

    @NotBlank
    private String paisOrigem;

    public ProdutoSalvarDTO() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public Produto toProduto(){
        Produto produto = new Produto();
        produto.setNome(nomeProduto);
        produto.setValor(valorProduto);
        produto.setUrlImagem(urlImagem);
        produto.setPaisOrigem(paisOrigem);
        return produto;
    }
}
