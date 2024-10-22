package com.example.chercheur.Service;

import com.example.chercheur.Entity.Chercheur;
import com.example.chercheur.Module.Enseignant;
import com.example.chercheur.Repository.Chercheurrepository;
import com.example.chercheur.module2.Projet;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class Chercheurservice {

    private Chercheurrepository chercheurrepository;

    private RestTemplate restTemplate;

    public Chercheurservice(Chercheurrepository chercheurrepository) {
        this.chercheurrepository = chercheurrepository;
        this.restTemplate = new RestTemplate();
    }

     public Chercheur crieraccount(Chercheur c){
            return chercheurrepository.save(c);
     }
    public List<Chercheur> getallchercheur(){
        List<Chercheur> chercheurList = chercheurrepository.findAll();
        if (chercheurList != null){

            for (Chercheur c : chercheurList){
                Enseignant e = restTemplate.getForObject("http://localhost:8085/Enseignant/"+c.getIde(),Enseignant.class);
                Projet p=restTemplate.getForObject("http://localhost:8086/Projet)"+c.getIdp(),Projet.class);
                c.setEnseignant(e);
                c.setProjet(p);
            }
        }

        return chercheurList;
    }


    public Chercheur getchercheurbyid(Long id){
        Chercheur chercheur = chercheurrepository.findById(id).orElse(null);
        if (chercheur != null){

                chercheur.setEnseignant( restTemplate.getForObject("http://localhost:8085/Enseignant/"+ chercheur.getIde(), Enseignant.class) );
                chercheur.setProjet( restTemplate.getForObject("http://localhost:8086/Projet)"+ chercheur.getIdp(), Projet.class) );

        }
        return chercheur;
    }


}
