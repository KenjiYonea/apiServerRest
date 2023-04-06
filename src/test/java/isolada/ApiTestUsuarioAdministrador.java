package isolada;

import factory.CadastraProdutoDataFactory;
import factory.CadastraUsuarioDataFactory;
import factory.LoginDataFactory;
import org.junit.Test;
import io.restassured.http.ContentType;
import pojo.CadastraProduto;
import pojo.CadastraUsuario;
import pojo.Login;

import java.io.IOException;

import static io.restassured.RestAssured.*;

public class ApiTestUsuarioAdministrador {
    @Test
    public void testCadastroUsuarioRetornaSucesso() throws IOException {
        // Configurações Rest-Assured
        baseURI = "https://serverest.dev";

        //Cria novo cadastro
        CadastraUsuario cadastraUsuarioAdmin = CadastraUsuarioDataFactory.criarUsuarioAdministradorResources();
        String id = given()
            .contentType(ContentType.JSON)
            .body(cadastraUsuarioAdmin)
        .when()
            .post("/usuarios")
        .then()
            .assertThat()
                .statusCode(201)
                .extract()
                .path("_id");

        System.out.println("\n\n Esse é o ID:" + id + "\n\n");

        //Realiza login
        Login loginAdministrador = LoginDataFactory.loginAdministradorResources();

        String authorization = given()
            .contentType(ContentType.JSON)
            .body(loginAdministrador)
        .when()
            .post("/login")
        .then()
            .assertThat()
                .statusCode(200)
                .extract()
                .path("authorization");

        System.out.println("\n\n esse é o authorization: " + authorization);

        //Cadastra produto
        CadastraProduto cadastraProduto = CadastraProdutoDataFactory.cadastraProdutoResources();

        String idProduto = given()
            .contentType(ContentType.JSON)
            .body(cadastraProduto)
            .header("Authorization", authorization)
        .when()
            .post("/produtos")
        .then()
            .assertThat()
            .statusCode(201)
            .extract()
            .path("id");
        System.out.println("\n\n Id do produto:" + idProduto);
    }
}
