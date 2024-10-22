package com.example.chercheur.Module;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Enseignant {

        private Long id;

        private String nom;

        private String prenom;

        private String cne;

        private String mail;

        private String themrecherche;

        private String password;

    public Enseignant(Long id, String nom, String prenom, String cne, String mail, String themrecherche, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.mail = mail;
        this.themrecherche = themrecherche;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getThemrecherche() {
        return themrecherche;
    }

    public void setThemrecherche(String themrecherche) {
        this.themrecherche = themrecherche;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
