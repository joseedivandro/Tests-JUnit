package br.com.treinaweb.twbiblioteca.models;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class AutorTest {

    @Test
    void teste_Metodo_Esta_Vivo_igual_true() {

        // cenario
        var autor = new Autor();

        // execução
        var estaVivo = autor.estaVivo();

        // verificação
        assertTrue(estaVivo);
    }

    @Test
    void teste_Metodo_Esta_Vivo_igual_false() {

        // cenario
        var autor = new Autor();
        autor.setDataFalecimento(LocalDate.now());

        // execução

        var estaVivo = autor.estaVivo();

        // verificação
        assertFalse(estaVivo);
    }

}
