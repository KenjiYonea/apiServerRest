package factory;

import pojo.CadastraProduto;
import pojo.EditarProdutos;

public class EditaProdutosDataFactory {
    public static EditarProdutos editarProdutos() {
        EditarProdutos editarProdutos = new EditarProdutos();

        editarProdutos.setNome("Ração de Cachorro");
        editarProdutos.setPreco("4.79");
        editarProdutos.setDescricao("Adulto");
        editarProdutos.setQuantidade("10");


        return editarProdutos();
    }
}
