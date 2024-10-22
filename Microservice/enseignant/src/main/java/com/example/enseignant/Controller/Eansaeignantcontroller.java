package com.example.enseignant.Controller;

import com.example.enseignant.Entity.Enseignants;
import com.example.enseignant.Service.Enseignantservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Enseignants")
@RestController
public class Eansaeignantcontroller {

    @Autowired
    Enseignantservice enseignantservice;
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @PostMapping
    public ResponseEntity<Enseignants> add(@RequestBody Enseignants E){
        Enseignants enseignants = enseignantservice.crieraccount(E);
        return ResponseEntity.ok(enseignants);
    }

    @GetMapping("kolxi")
    public ResponseEntity<List<Enseignants>> getAll(){
       List<Enseignants>  enseignants = enseignantservice.getall();
        return ResponseEntity.ok(enseignants);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enseignants> getbyid(@PathVariable Long id){
        Enseignants enseignants = enseignantservice.getenseignantbyid(id);
        return ResponseEntity.ok(enseignants);
    }
}
