package model;

public class Jogador {
    private String nome;
    private String email;
    private String senha;
    private Double saldo;

    public Jogador() {}

    public Jogador(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getAposta() {
        return saldo;
    }

    public void setAposta(Double saldo) {
        this.saldo = saldo;
    }

        

}
