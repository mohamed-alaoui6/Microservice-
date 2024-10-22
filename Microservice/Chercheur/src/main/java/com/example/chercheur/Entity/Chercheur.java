package com.example.chercheur.Entity;

import com.example.chercheur.Module.Enseignant;
import com.example.chercheur.module2.Projet;
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
public class Chercheur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom", length = 255)
    private String nom;
    @Column(name = "prenom", length = 255)
    private String prenom;
    @Column(name = "ninscription", length = 255)
    private String ninscription;
    @Column(name = "ide", length = 255)
    private String ide;
    @Column(name = "idp", length = 255)
    private String idp;
    @Transient
    private Enseignant enseignant;

    @Transient
    private Projet projet;
}
