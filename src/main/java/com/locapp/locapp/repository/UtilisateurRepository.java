package com.locapp.locapp.repository;

import com.locapp.locapp.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Utilisateur findByEmail(String email);

    // Ajout de méthode JPQL pour rechercher un utilisateur par son nom
    @Query("SELECT u FROM Utilisateur u WHERE u.nom = :nom")
    Utilisateur findByNom(@Param("nom") String nom);
}

