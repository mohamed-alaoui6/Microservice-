package com.example.chercheur.module2;

import jakarta.persistence.Column;

public class Projet {

    private Long id;

    private String titre;

    private String desc;

    public Projet(Long id, String titre, String desc) {
        this.id = id;
        this.titre = titre;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
