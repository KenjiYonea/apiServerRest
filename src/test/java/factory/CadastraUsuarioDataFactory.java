package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.CadastraUsuario;
import java.io.FileInputStream;
import java.io.IOException;

public class CadastraUsuarioDataFactory {
    public static CadastraUsuario criarUsuarioAdministradorResources() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CadastraUsuario cadastraUsuarioAdmin = objectMapper.readValue(new FileInputStream("src/test/resources/requestBody/postCadastraUsuario.json"), CadastraUsuario.class);
        cadastraUsuarioAdmin.setEmail("usuario.admin00000125@email.com");
        cadastraUsuarioAdmin.setAdministrador("true");
        return  cadastraUsuarioAdmin;
    }

    public static CadastraUsuario criaUsuarioAdministrador() throws IOException {
        CadastraUsuario cadastraUsuarioAdmin = criarUsuarioAdministradorResources();
        return cadastraUsuarioAdmin;
    }

    public static CadastraUsuario criarUsuarioComumResources() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CadastraUsuario cadastraUsuario = objectMapper.readValue(new FileInputStream("src/test/resources/requestBody/postCadastraUsuario.json"), CadastraUsuario.class);
        return  cadastraUsuario;
    }

    public static CadastraUsuario cadastraUsuarioResources() throws IOException {
        CadastraUsuario cadastraUsuario = criarUsuarioComumResources();
        return cadastraUsuario;
    }
}
