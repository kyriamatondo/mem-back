package com.locapp.locapp.service;

import com.locapp.locapp.model.ServiceDeDepannage;
import com.locapp.locapp.repository.ServiceDeDepannageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceDeDepannageService {

    @Autowired
    private ServiceDeDepannageRepository serviceDeDepannageRepository;

    public List<ServiceDeDepannage> getAllServicesDeDepannage() {
        return serviceDeDepannageRepository.findAll();
    }

    public Optional<ServiceDeDepannage> getServiceDeDepannageById(Long id) {
        return serviceDeDepannageRepository.findById(id);
    }

    public ServiceDeDepannage createServiceDeDepannage(ServiceDeDepannage serviceDeDepannage) {
        return serviceDeDepannageRepository.save(serviceDeDepannage);
    }

    public ServiceDeDepannage updateServiceDeDepannage(ServiceDeDepannage serviceDeDepannage) {
        return serviceDeDepannageRepository.save(serviceDeDepannage);
    }

    public void deleteServiceDeDepannage(Long id) {
        serviceDeDepannageRepository.deleteById(id);
    }

    // Correction du nom de la méthode pour correspondre à la modification dans le
    // repository
    public ServiceDeDepannage getServiceDeDepannageByNom(String nomFournisseur) {
        return serviceDeDepannageRepository.findByNomFournisseur(nomFournisseur);
    }
}
