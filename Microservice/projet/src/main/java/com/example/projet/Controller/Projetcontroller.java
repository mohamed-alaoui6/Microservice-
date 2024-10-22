package com.example.projet.Controller;

import com.example.projet.Entity.Projet;
import com.example.projet.Service.Projetservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Projet")
public class Projetcontroller {

    @Autowired
    private Projetservice projetservice;

    @GetMapping("/kolxi")
    public ResponseEntity<List<Projet>> getAll(){
        List<Projet>  projets = projetservice.getall();
        return ResponseEntity.ok(projets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projet> getbyid(@PathVariable Long id){
        Projet projet = projetservice.getbyid(id);
        return ResponseEntity.ok(projet);
    }
    
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @PostMapping
    public ResponseEntity<Projet> crierproj(@RequestBody Projet P){
        Projet projet = projetservice.crierprojet(P);
        return ResponseEntity.ok(projet);
    }
}
