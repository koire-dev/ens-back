
package com.api.gestnotesapi.repository;

import com.api.gestnotesapi.entities.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SemestreRepo extends JpaRepository<Semestre, Long> {
    public Semestre findByValeur(Integer valeur);
}
