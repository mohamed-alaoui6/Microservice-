package com.example.chercheur.Repository;

import com.example.chercheur.Entity.Chercheur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Chercheurrepository extends JpaRepository<Chercheur,Long> {
}
