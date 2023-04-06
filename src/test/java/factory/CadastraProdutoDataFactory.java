package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.CadastraProduto;
import java.io.FileInputStream;
import java.io.IOException;

public class CadastraProdutoDataFactory {
    public static CadastraProduto cadastraProdutoResources() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CadastraProduto novoProduto = objectMapper.readValue(new FileInputStream("src/test/resources/requestBody/postCadastraProduto.json"), CadastraProduto.class);
        return novoProduto;
    }

    public static CadastraProduto cadastraNovoProduto () throws IOException {
        CadastraProduto cadastraProduto = cadastraProdutoResources();
        return cadastraProduto;
    }
}
