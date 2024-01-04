package com.locapp.locapp.controller;

import com.locapp.locapp.model.ServiceDeDepannage;
import com.locapp.locapp.service.ServiceDeDepannageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/services-de-depannage")
@CrossOrigin("http://localhost:3000")
public class ServiceDeDepannageController {

    @Autowired
    private ServiceDeDepannageService serviceDeDepannageService;

    @GetMapping
    public List<ServiceDeDepannage> getAllServicesDeDepannage() {
        return serviceDeDepannageService.getAllServicesDeDepannage();
    }

    @GetMapping("/{id}")
    public Optional<ServiceDeDepannage> getServiceDeDepannageById(@PathVariable Long id) {
        return serviceDeDepannageService.getServiceDeDepannageById(id);
    }

    @PostMapping
    public ServiceDeDepannage createServiceDeDepannage(@RequestBody ServiceDeDepannage serviceDeDepannage) {
        return serviceDeDepannageService.createServiceDeDepannage(serviceDeDepannage);
    }

    @PutMapping("/{id}")
    public ServiceDeDepannage updateServiceDeDepannage(@PathVariable Long id,
            @RequestBody ServiceDeDepannage serviceDeDepannage) {
        serviceDeDepannage.setIdService(id);
        return serviceDeDepannageService.updateServiceDeDepannage(serviceDeDepannage);
    }

    @DeleteMapping("/{id}")
    public void deleteServiceDeDepannage(@PathVariable Long id) {
        serviceDeDepannageService.deleteServiceDeDepannage(id);
    }

    // Méthode supplémentaire pour rechercher un service par son nom
    @GetMapping("/byName/{nomDuService}")
    public ServiceDeDepannage getServiceDeDepannageByNom(@PathVariable String nomDuService) {
        return serviceDeDepannageService.getServiceDeDepannageByNom(nomDuService);
    }
}
