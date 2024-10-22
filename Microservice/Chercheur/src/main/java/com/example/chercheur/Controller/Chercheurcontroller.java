package com.example.chercheur.Controller;

import com.example.chercheur.Entity.Chercheur;
import com.example.chercheur.Service.Chercheurservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Chercheur")
@RestController
public class Chercheurcontroller {


        @Autowired
        Chercheurservice chercheurservice;

        @PreAuthorize("hasAnyAuthority('ADMIN')")
        @PostMapping
        public ResponseEntity<Chercheur> add(@RequestBody Chercheur C){
            Chercheur chercheur = chercheurservice.crieraccount(C);
            return ResponseEntity.ok(chercheur);
        }

        @GetMapping("/kolxi")
        public ResponseEntity<List<Chercheur>> getAll(){
            List<Chercheur>  chercheurs = chercheurservice.getallchercheur();
            return ResponseEntity.ok(chercheurs);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Chercheur> getbyid(@PathVariable Long id){
            Chercheur chercheur = chercheurservice.getchercheurbyid(id);
            return ResponseEntity.ok(chercheur);
        }
}
