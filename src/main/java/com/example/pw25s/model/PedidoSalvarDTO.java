package com.example.pw25s.model;

public class PedidoSalvarDTO {

    private String nomePedido;

    private String urlItem;

    private String urlImagem;

    private String descricao;

    public PedidoSalvarDTO() {
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public String getUrlItem() {
        return urlItem;
    }

    public void setUrlItem(String urlItem) {
        this.urlItem = urlItem;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNome(nomePedido);
        pedido.setUrlItem(urlItem);
        pedido.setUrlImagem(urlImagem);
        pedido.setDescricao(descricao);
        return pedido;
    }
}
