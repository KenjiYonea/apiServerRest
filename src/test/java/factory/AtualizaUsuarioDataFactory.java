package factory;

import pojo.AtualizaUsuario;


public class AtualizaUsuarioDataFactory {
    public static AtualizaUsuario atualizaUsuarioAdministrador(){

        AtualizaUsuario atualizaAdministrador = new AtualizaUsuario();

        atualizaAdministrador.setNome("usuarioadministrador");
        atualizaAdministrador.setEmail("bruno5.teste@email.com");
        atualizaAdministrador.setPassword("123456");
        atualizaAdministrador.setAdministrador("true");

        return atualizaUsuarioAdministrador();
    }

    public static AtualizaUsuario atualizaUsuarioComum(){

        AtualizaUsuario atualizaCumum = new AtualizaUsuario();

        atualizaCumum.setNome("usuarioadministrador");
        atualizaCumum.setEmail("bruno5.teste@email.com");
        atualizaCumum.setPassword("123456");
        atualizaCumum.setAdministrador("false");

        return atualizaUsuarioComum();
    }
}
