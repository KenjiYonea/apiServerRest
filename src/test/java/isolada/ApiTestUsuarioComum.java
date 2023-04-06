package isolada;

import factory.CadastraUsuarioDataFactory;
import factory.LoginDataFactory;
import org.junit.Before;
import org.junit.Test;
import io.restassured.http.ContentType;
import pojo.CadastraUsuario;
import pojo.Login;

import java.io.IOException;

import static io.restassured.RestAssured.*;

public class ApiTestUsuarioComum {

    @Test
    public void testePontaAPontaComUsuarioComumRetornaSucesso() throws IOException {
        // Configurações Rest-Assured
        baseURI = "https://serverest.dev";

        //Cria novo cadastro
        CadastraUsuario cadastraUsuarioComum = CadastraUsuarioDataFactory.cadastraUsuarioResources();
        String id = given()
            .contentType(ContentType.JSON)
            .body(cadastraUsuarioComum)
        .when()
            .post("/usuarios")
        .then()
            .assertThat()
                .statusCode(201)
                .extract()
                .path("_id");

        System.out.println("\n\n Esse é o ID:" + id + "\n\n");

        //Realiza login e se houver a necessidade de extrair o token, se utiliza o "extract" atribuindo a variavel "token"

        Login loginUsuarioComum = LoginDataFactory.loginUsuarioComum();

        String authorization = given()
            .contentType(ContentType.JSON)
            .body(loginUsuarioComum)
        .when()
            .post("/login")
        .then()
            .assertThat()
                .statusCode(200)
                .extract()
                .path("authorization");

        System.out.println("\n\n esse é o authorization: " + authorization);
    }
}
