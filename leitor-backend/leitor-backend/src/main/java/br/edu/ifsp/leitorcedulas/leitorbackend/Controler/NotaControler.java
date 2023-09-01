package br.edu.ifsp.leitorcedulas.leitorbackend.Controler;

import java.util.ArrayList;

import br.edu.ifsp.leitorcedulas.leitorbackend.dao.CedulaDAO;
import br.edu.ifsp.leitorcedulas.leitorbackend.model.Cedula;

@RestController
public class NotaControler {
    
    @GetMapping("/api/bd/notas/{id}")
    public ArrayList<Cedula> endPoint1() {
        return CedulaDAO.read();
    }
}
