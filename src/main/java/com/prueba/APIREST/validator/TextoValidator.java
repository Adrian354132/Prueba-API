package com.prueba.APIREST.validator;

import org.springframework.stereotype.Component;

@Component
public class TextoValidator {
    public void validarFormato(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("El texto de entrada no puede estar vacío.");
        }
        if (!input.contains("\\")) {
            throw new IllegalArgumentException("Formato de entrada inválido. Falta el carácter '\\'.");
        }
    }
}
