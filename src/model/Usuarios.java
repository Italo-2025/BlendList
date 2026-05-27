package model;

public class Usuarios {
    private int id;
    private String nome;
    private String senha;

    public Usuarios(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    int getId() { return id; }
    public String getNome() { return nome; }
    public String getSenha() { return senha; }

    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setSenha(String senha) { this.senha = senha; }
}
