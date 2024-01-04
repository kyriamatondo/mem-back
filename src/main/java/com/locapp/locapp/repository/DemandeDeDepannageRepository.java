package com.locapp.locapp.repository;


import com.locapp.locapp.model.DemandeDeDepannage;
import com.locapp.locapp.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandeDeDepannageRepository extends JpaRepository<DemandeDeDepannage, Long> {

    List<DemandeDeDepannage> findByUtilisateur(Utilisateur utilisateur);
}
