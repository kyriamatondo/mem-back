package com.locapp.locapp.repository;

import com.locapp.locapp.model.ServiceDeDepannage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceDeDepannageRepository extends JpaRepository<ServiceDeDepannage, Long> {

    // Correction du nom de l'attribut dans la requête JPQL
    @Query("SELECT s FROM ServiceDeDepannage s WHERE s.nomFournisseur = :nomFournisseur")
    ServiceDeDepannage findByNomFournisseur(@Param("nomFournisseur") String nomFournisseur);
}
