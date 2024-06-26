package com.api.gestnotesapi.repository;

import com.api.gestnotesapi.entities.Niveau;
import com.api.gestnotesapi.entities.Option;
import com.api.gestnotesapi.entities.Parcours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ParcoursRepo extends JpaRepository<Parcours, Long> {

    Optional<Parcours> findByLabel(String label);

    Optional<Parcours> findByOptionAndNiveau(Option option, Niveau niveau);

    List<Parcours> findAllByOption(Option option);

    Parcours findByLabelAndActive(String label, boolean b);

}
