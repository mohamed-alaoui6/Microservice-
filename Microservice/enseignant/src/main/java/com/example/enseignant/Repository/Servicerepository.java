package com.example.enseignant.Repository;

import com.example.enseignant.Entity.Enseignants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Servicerepository extends JpaRepository<Enseignants,Long> {
}
