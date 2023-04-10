package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import pojo.CadastraCarrinho;
import java.io.FileInputStream;
import java.io.FileWriter;
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

    /*public static CadastraCarrinho converteCarrinhoJson(){
        CadastraCarrinho obj = new CadastraCarrinho();
        Gson gson = new Gson();

        // converte objetos Java para JSON e retorna Json como String
        String json = gson.toJson(obj);

        try{
            //Escreve Json convertido em arquivo chamado "file.json"
            FileWriter writer = new FileWriter("src/test/resources/requestBody/postCadastraCarrinho.json");
            writer.write(json);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(json);

        return converteCarrinhoJson();
    }*/

}
