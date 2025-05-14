package Leviata.leviatan.controllers;

import Leviata.leviatan.model.JogosModel;
import Leviata.leviatan.repositories.JogosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/jogos")
public class JogosController {

    @Autowired
    private JogosRepository jogosRepository;

    @PostMapping
    public ResponseEntity<JogosModel> addJogo(@RequestBody @Valid JogosRepository jogosRepository) {
    var jogo = new JogosModel();
    return null;
    }
}
