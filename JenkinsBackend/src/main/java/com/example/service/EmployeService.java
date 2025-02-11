	package com.example.service;

	import com.example.model.Employe;
	import com.example.repository.EmployeRepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import java.util.List;
	import java.util.Optional;

@Service
public class EmployeService {
   /* private final Map<Integer, Employe> employeRepository = new HashMap<>();

    // Ajouter un employé
    public Employe ajouterEmploye(Employe employe) {
        if (employeRepository.containsKey(employe.getId())) {
            throw new IllegalArgumentException("L'employé avec cet ID existe déjà.");
        }
        employeRepository.put(employe.getId(), employe);
        return employe;
    }

    // Trouver un employé par ID
    public Employe trouverEmployeParId(int id) {
        return Optional.ofNullable(employeRepository.get(id))
                .orElseThrow(() -> new NoSuchElementException("Employé introuvable."));
    }

    // Supprimer un employé
    public boolean supprimerEmploye(int id) {
        if (!employeRepository.containsKey(id)) {
            throw new NoSuchElementException("Impossible de supprimer, employé introuvable.");
        }
        employeRepository.remove(id);
        return true;
    }

    // Obtenir une liste triée par salaire
    public List<Employe> obtenirEmployesTriesParSalaire() {
        return employeRepository.values().stream()
                .sorted(Comparator.comparingDouble(Employe::getSalaire).reversed())
                .collect(Collectors.toList());
    }*/
	




	    @Autowired
	    private EmployeRepository employeRepository;

	    // Ajouter un employé
	    public Employe ajouterEmploye(Employe employe) {
	        return employeRepository.save(employe);
	    }

	    // Lister tous les employés
	    public List<Employe> listerEmployes() {
	        return employeRepository.findAll();
	    }

	    // Récupérer un employé par ID
	    public Optional<Employe> getEmployeById(Long id) {
	        return employeRepository.findById(id);
	    }

	    // Supprimer un employé
	    public void supprimerEmploye(Long id) {
	        employeRepository.deleteById(id);
	    }

	    // Mettre à jour un employé
	    public Employe mettreAJourEmploye(Long id, Employe employeDetails) {
	        Employe employe = employeRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Employé non trouvé"));
	        employe.setNom(employeDetails.getNom());
	        employe.setSalaire(employeDetails.getSalaire());
	        return employeRepository.save(employe);
	    }


	
}

