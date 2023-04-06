package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.CadastraCarrinho;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CadastraCarrinhoDataFactory {
    public static CadastraCarrinho cadastraCarrinhoResources() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CadastraCarrinho cadastraCarrinho = objectMapper.readValue(new FileInputStream("src/test/resources/requestBody/postCadastraCarrinho.json"), CadastraCarrinho.class);

        return cadastraCarrinho;
    }

    public static CadastraCarrinho cadastraNovoCarrinho() throws IOException {
        CadastraCarrinho cadastraNovoCarrinho = cadastraCarrinhoResources();
        return  cadastraNovoCarrinho;

    }

}
