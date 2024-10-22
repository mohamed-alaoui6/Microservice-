package com.example.projet.Service;

import com.example.projet.Entity.Projet;
import com.example.projet.Repositoey.Projetrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Projetservice {

    private Projetrepository projetrepository;

    @Autowired
    public Projetservice(Projetrepository projetrepository) {
        this.projetrepository = projetrepository;
    }

    public Projet crierprojet(Projet p){
        return projetrepository.save(p);
    }

    public Projet getbyid(Long id){

        return projetrepository.findById(id).orElse(null);
    }
    public List<Projet> getall(){
        return projetrepository.findAll();
    }
}
