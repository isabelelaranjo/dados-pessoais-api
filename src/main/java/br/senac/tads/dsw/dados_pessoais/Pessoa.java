package br.senac.tads.dsw.dados_pessoais;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {

    private Integer id;
    private String username;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String senha;
    private String senhaRepeticao;
    private List<String> conhecimentos;

    public Pessoa() { // Está vazio porque é necessário para o Spring criar o objeto Pessoa a partir do json.
    }

    public Pessoa(Integer id, String username, String nome, String email, String telefone, LocalDate dataNascimento) {
        this.id = id;
        this.username = username;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenhaRepeticao() {
        return senhaRepeticao;
    }

    public void setSenhaRepeticao(String senhaRepeticao) {
        this.senhaRepeticao = senhaRepeticao;
    }

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(List<String> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

}

