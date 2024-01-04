package com.locapp.locapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceDeDepannage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    private String nomFournisseur;
    private String descriptionDuService;
    private String prix;
    private String telephone;
    private double latitude; // Ajout de l'attribut latitude
    private double longitude; // Ajout de l'attribut longitude

    @OneToMany(mappedBy = "serviceDeDepannage", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<DemandeDeDepannage> demandesDeDepannage;

}
