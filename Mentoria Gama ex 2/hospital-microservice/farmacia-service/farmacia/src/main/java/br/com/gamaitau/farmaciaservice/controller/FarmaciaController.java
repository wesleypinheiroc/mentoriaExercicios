package br.com.gamaitau.farmaciaservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamaitau.farmaciaservice.service.FarmaciaService;

@RestController
@RequestMapping("/farmacia")
public class FarmaciaController {
    
    @Autowired
    FarmaciaService service;

    @GetMapping("/get")
    public ResponseEntity<String> getMedical(){

        String msg = service.getMensage();
        return ResponseEntity.ok(msg);
    }
}
