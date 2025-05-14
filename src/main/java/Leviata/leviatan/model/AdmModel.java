package Leviata.leviatan.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "tbAdm")
public class AdmModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdm;

    @NotBlank
    private String admName;

    private String email;
    private String senha;

    @Column(name = "ativo")
    private boolean ativo = true;


    public int getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
