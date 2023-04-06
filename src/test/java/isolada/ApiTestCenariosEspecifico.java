package isolada;

import factory.CadastraCarrinhoDataFactory;
import factory.CadastraProdutoDataFactory;
import factory.CadastraUsuarioDataFactory;
import factory.LoginDataFactory;
import jdk.nashorn.internal.parser.Token;
import org.junit.Before;
import org.junit.Test;
import io.restassured.http.ContentType;
import pojo.CadastraCarrinho;
import pojo.CadastraProduto;
import pojo.CadastraUsuario;
import pojo.Login;

import java.io.IOException;

import static io.restassured.RestAssured.*;


public class ApiTestCenariosEspecifico {
    private String authorization = "";
    private String idProduto;
    private String idCarrinho;

    @Before
    public void SetUp() throws IOException {
        baseURI = "https://serverest.dev";
        //Realiza login
        Login loginAdministrador = LoginDataFactory.loginAdministradorResources();

        this.authorization = given()
            .contentType(ContentType.JSON)
            .body(loginAdministrador)
        .when()
            .post("/login")
        .then()
            .assertThat()
                .statusCode(200)
                .extract()
                .path("authorization");

        System.out.println("\n\n esse é o authorization: " + authorization + "\n\n" );
    }

    @Test
    public void cadatroDeProduto() throws IOException {
        CadastraProduto cadastraProduto = CadastraProdutoDataFactory.cadastraProdutoResources();
        this.idProduto = given()
            .contentType(ContentType.JSON)
            .body(cadastraProduto)
            .header("Authorization", authorization)
        .when()
            .post("/produtos")
        .then()
            .assertThat()
                .statusCode(201)
                .extract()
                .path("_id");
        System.out.println("\n\n Id do produto:" + idProduto);
    }

    @Test
    public void cadastraCarrinho() throws IOException {
        CadastraCarrinho novoCarrinho = CadastraCarrinhoDataFactory.cadastraCarrinhoResources();
        this.idCarrinho = given()
            .contentType(ContentType.JSON)
            .body(novoCarrinho)
            .header("Authorization",authorization)
        .when()
            .post("/carrinhos")
        .then()
            .assertThat()
                .statusCode(201)
                .extract()
                .path("_id");
        System.out.println("Id do carrinho: " + idCarrinho);
    }
}
