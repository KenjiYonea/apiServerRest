package pojo;

import java.util.ArrayList;
import java.util.List;

public class CadastraCarrinho {
    private String idProduto;
    private Integer quantidade;
    private Integer precoUnitario;
    private List<CadastraCarrinho> produtos;

    public List<CadastraCarrinho> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<CadastraCarrinho> produtos) {
        this.produtos = produtos;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Integer getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Integer precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
