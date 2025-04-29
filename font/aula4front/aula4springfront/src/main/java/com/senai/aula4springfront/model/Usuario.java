package com.senai.aula4springfront.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Nome e obrigatorio.")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "E-mail e obrigatorio.")
    @Email(message = "Deve ser um e-mail valido.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Senha e obrigatorio.")
    @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.")
    private String senha;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome e obrigatorio.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome e obrigatorio.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "E-mail e obrigatorio.") @Email(message = "Deve ser um e-mail valido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail e obrigatorio.") @Email(message = "Deve ser um e-mail valido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha e obrigatorio.") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha e obrigatorio.") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
