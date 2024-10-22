package com.example.enseignant.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Enseignants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom", length = 255)
    private String nom;
    @Column(name = "prenom", length = 255)
    private String prenom;
    @Column(name = "cne", length = 255)
    private String cne;
    @Column(name = "mail", length = 255)
    private String mail;
    @Column(name = "themrecherche", length = 255)
    private String themrecherche;
    @Column(name = "password", length = 255)
    private String password;
}
