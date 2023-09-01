package br.edu.ifsp.leitorcedulas.leitorbackend.dao;

import java.util.ArrayList;

import br.edu.ifsp.leitorcedulas.leitorbackend.database.Database;
import br.edu.ifsp.leitorcedulas.leitorbackend.model.Pais;

public class PaisDAO {

    private Database db;
    private static PaisDAO instance;

    // O construtor privado garante que uma única instância irá existir
    private PaisDAO() {

    }

    // Recupera a única instância do DAO
    public static PaisDAO getInstance() {
        if (instance == null) {
            instance = new PaisDAO();
        }
        return instance;
    }

    // Recupera a conexão com o Banco de Dados
    private Database getConnection() {
        if (this.db == null) {
            Database db = new Database();
            db.initPais();
            this.db = db;
        }
        return this.db;
    }

    // Cria um novo Pais
    public void create(Pais novo) {
        Database db = getConnection();
        db.addDadoPais(novo);
    }

    // Recupera todas as listas
    public ArrayList<Pais> read() {
        Database db = getConnection();
        return db.recuperaDadoPais();
    }

    public void delete(Pais deletar) {
        // Sem implementação
    }

    public void update(Pais toUpdate) {
        // Sem implementação
    }
}