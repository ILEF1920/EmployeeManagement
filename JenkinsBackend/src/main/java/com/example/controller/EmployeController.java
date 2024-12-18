package com.example.controller;

import com.example.model.Employe;
import com.example.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
@CrossOrigin(origins = "*") // Autorise les appels cross-origin pour le frontend
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    // Ajouter un employé
    @PostMapping
    public ResponseEntity<Employe> ajouterEmploye(@RequestBody Employe employe) {
        Employe nouveauEmploye = employeService.ajouterEmploye(employe);
        return ResponseEntity.ok(nouveauEmploye);
    }

    // Lister tous les employés
    @GetMapping
    public ResponseEntity<List<Employe>> listerEmployes() {
        List<Employe> employes = employeService.listerEmployes();
        return ResponseEntity.ok(employes);
    }

    // Récupérer un employé par ID
    @GetMapping("/{id}")
    public ResponseEntity<Employe> getEmployeById(@PathVariable Long id) {
        Employe employe = employeService.getEmployeById(id)
                .orElseThrow(() -> new RuntimeException("Employé non trouvé"));
        return ResponseEntity.ok(employe);
    }

    // Supprimer un employé
    @DeleteMapping("/{id}")
    public ResponseEntity<String> supprimerEmploye(@PathVariable Long id) {
        employeService.supprimerEmploye(id);
        return ResponseEntity.ok("Employé supprimé avec succès");
    }

    // Mettre à jour un employé
    @PutMapping("/{id}")
    public ResponseEntity<Employe> mettreAJourEmploye(@PathVariable Long id, @RequestBody Employe employeDetails) {
        Employe employeMisAJour = employeService.mettreAJourEmploye(id, employeDetails);
        return ResponseEntity.ok(employeMisAJour);
    }
}
