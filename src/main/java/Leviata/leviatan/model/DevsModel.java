package Leviata.leviatan.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "TbDevs")
public class DevsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDevsModel;

    @NotBlank
    private String nome_empresa;

    @NotBlank
    private String nome_respponsavel;

    @NotBlank
    private String email_empresa;

    String whatsapp;

    @Column(name = "ativo")
    private boolean ativo;


    public int getIdDevsModel() {
        return idDevsModel;
    }

    public void setIdDevsModel(int idDevsModel) {
        this.idDevsModel = idDevsModel;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getNome_respponsavel() {
        return nome_respponsavel;
    }

    public void setNome_respponsavel(String nome_respponsavel) {
        this.nome_respponsavel = nome_respponsavel;
    }

    public String getEmail_empresa() {
        return email_empresa;
    }

    public void setEmail_empresa(String email_empresa) {
        this.email_empresa = email_empresa;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
