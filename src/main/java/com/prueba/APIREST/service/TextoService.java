package com.prueba.APIREST.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TextoService {

    public List<String> procesarTexto(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("El texto de entrada no puede estar vacío.");
        }

        return Arrays.stream(input.split("\n"))
                .map(this::procesarLinea)
                .toList();
    }

    private String procesarLinea(String linea) {
        if (!linea.contains("\\")) {
            throw new IllegalArgumentException("Formato de entrada inválido. Falta el carácter '\\'.");
        }

        String[] partes = linea.split("\\\\", 2);
        int numero = Integer.parseInt(partes[0]);
        String fraseOriginal = partes[1];
        String fraseLimpia = fraseOriginal.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        int conteoPalabras = fraseLimpia.split("\\s+").length;

        boolean esIgual = (numero == conteoPalabras);
        return fraseLimpia + "\\" + esIgual;
    }
}
