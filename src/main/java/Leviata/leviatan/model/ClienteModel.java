package Leviata.leviatan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbCliente")
public class ClienteModel {

    @Id
    private int id;



}
