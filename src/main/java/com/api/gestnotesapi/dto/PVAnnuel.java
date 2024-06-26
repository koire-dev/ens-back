package com.api.gestnotesapi.dto;

import com.api.gestnotesapi.entities.TYPE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PVAnnuel {
    private String anneeAca;
    private String parcours;
    List<PVEtudiantAnnuel> pvEtudiantAnnuelList;
}
