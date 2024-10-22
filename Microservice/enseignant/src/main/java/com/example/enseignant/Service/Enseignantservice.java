package com.example.enseignant.Service;

import com.example.enseignant.Entity.Enseignants;
import com.example.enseignant.Repository.Servicerepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class Enseignantservice {

    private Servicerepository servicerepository;

    @Autowired
    public Enseignantservice(Servicerepository servicerepository) {
        this.servicerepository = servicerepository;
    }


    public Enseignants crieraccount(Enseignants e){

    return servicerepository.save(e);
    }

    public Enseignants getenseignantbyid(Long id){

    return servicerepository.findById(id).orElse(null);
    }

    public List<Enseignants> getall(){
        return servicerepository.findAll();
    }

}
