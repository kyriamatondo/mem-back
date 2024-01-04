package com.locapp.locapp.controller;

import com.locapp.locapp.model.DemandeDeDepannage;
import com.locapp.locapp.model.Utilisateur;
import com.locapp.locapp.service.DemandeDeDepannageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/demandes-de-depannage")
@CrossOrigin("http://localhost:3000")
public class DemandeDeDepannageController {

    @Autowired
    private DemandeDeDepannageService demandeDeDepannageService;

    @GetMapping
    public List<DemandeDeDepannage> getAllDemandesDeDepannage() {
        return demandeDeDepannageService.getAllDemandesDeDepannage();
    }

    @GetMapping("/{id}")
    public Optional<DemandeDeDepannage> getDemandeDeDepannageById(@PathVariable Long id) {
        return demandeDeDepannageService.getDemandeDeDepannageById(id);
    }

    @PostMapping
    public DemandeDeDepannage createDemandeDeDepannage(@RequestBody DemandeDeDepannage demandeDeDepannage) {
        return demandeDeDepannageService.createDemandeDeDepannage(demandeDeDepannage);
    }

    @PutMapping("/{id}")
    public DemandeDeDepannage updateDemandeDeDepannage(@PathVariable Long id,
            @RequestBody DemandeDeDepannage demandeDeDepannage) {
        demandeDeDepannage.setIdDemande(id);
        return demandeDeDepannageService.updateDemandeDeDepannage(demandeDeDepannage);
    }

    @DeleteMapping("/{id}")
    public void deleteDemandeDeDepannage(@PathVariable Long id) {
        demandeDeDepannageService.deleteDemandeDeDepannage(id);
    }

    // Méthode supplémentaire pour rechercher des demandes par utilisateur
    @GetMapping("/byUtilisateur/{idUtilisateur}")
    public List<DemandeDeDepannage> getDemandesByUtilisateur(@PathVariable Long idUtilisateur) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setIdUtilisateur(idUtilisateur);
        return demandeDeDepannageService.getDemandesByUtilisateur(utilisateur);
    }
}
