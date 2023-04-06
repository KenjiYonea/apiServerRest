package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Login;
import java.io.FileInputStream;
import java.io.IOException;

public class LoginDataFactory {

    public static Login loginAdministradorResources() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Login loginAdministrador= objectMapper.readValue(new FileInputStream("src/test/resources/requestBody/postLogin.json"), Login.class);
        loginAdministrador.setEmail("usuario.admin");
        loginAdministrador.setEmail("usuario.admin00000125@email.com");
        return loginAdministrador;
    }

    public static Login loginUsuarioAdministradorResources() throws IOException {
        Login loginAdministrador = loginAdministradorResources();
        return loginAdministrador;
    }

    public static Login loginComumResources() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Login loginComum = objectMapper.readValue(new FileInputStream("src/test/resources/requestBody/postLogin.json"), Login.class);
        return loginComum;
    }

    public static Login loginUsuarioComum() throws IOException {
        Login loginComum = loginComumResources();
        return loginComum;
    }
}
