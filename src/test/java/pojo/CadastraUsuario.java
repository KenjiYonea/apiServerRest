package pojo;

public class CadastraUsuario {
    private String nome;
    private String email;
    private String password;
    private String administrador;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        this.password = senha;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador (String administrador) {
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
