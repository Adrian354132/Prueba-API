package com.prueba.APIREST.controller;

import com.prueba.APIREST.service.TextoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TextoServiceTest {

    private final TextoService textoService = new TextoService();

    @Test
    public void procesarTexto_debeRetornarResultadosCorrectos() {
        String input = "3\\the force is strong in this one\n7\\take what you can give nothing back";
        List<String> resultado = textoService.procesarTexto(input);

        Assertions.assertEquals(2, resultado.size());
        Assertions.assertEquals("the force is strong in this one\\false", resultado.get(0));
        Assertions.assertEquals("take what you can give nothing back\\true", resultado.get(1));
    }

    @Test
    public void procesarTexto_debeLanzarExcepcionSiFormatoInvalido() {
        String input = "3 the force is strong in this one";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            textoService.procesarTexto(input);
        });
    }
}
