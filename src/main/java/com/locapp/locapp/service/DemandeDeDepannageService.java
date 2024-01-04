package com.locapp.locapp.service;

import com.locapp.locapp.model.DemandeDeDepannage;
import com.locapp.locapp.model.Utilisateur;
import com.locapp.locapp.repository.DemandeDeDepannageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeDeDepannageService {

    @Autowired
    private DemandeDeDepannageRepository demandeDeDepannageRepository;

    public List<DemandeDeDepannage> getAllDemandesDeDepannage() {
        return demandeDeDepannageRepository.findAll();
    }

    public Optional<DemandeDeDepannage> getDemandeDeDepannageById(Long id) {
        return demandeDeDepannageRepository.findById(id);
    }

    public DemandeDeDepannage createDemandeDeDepannage(DemandeDeDepannage demandeDeDepannage) {
        return demandeDeDepannageRepository.save(demandeDeDepannage);
    }

    public DemandeDeDepannage updateDemandeDeDepannage(DemandeDeDepannage demandeDeDepannage) {
        return demandeDeDepannageRepository.save(demandeDeDepannage);
    }

    public void deleteDemandeDeDepannage(Long id) {
        demandeDeDepannageRepository.deleteById(id);
    }

    public List<DemandeDeDepannage> getDemandesByUtilisateur(Utilisateur utilisateur) {
        return demandeDeDepannageRepository.findByUtilisateur(utilisateur);
    }
}
