package com.prueba.APIREST.controller;

import com.prueba.APIREST.service.TextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
    @RestController
    @RequestMapping("/api/v1/texto")
    public class TextoController {

        @Autowired
        private TextoService textoService;

        @PostMapping("/procesar")
        public ResponseEntity<List<String>> procesarTexto(@RequestBody String input) {
            return ResponseEntity.ok(textoService.procesarTexto(input));
        }
    }


