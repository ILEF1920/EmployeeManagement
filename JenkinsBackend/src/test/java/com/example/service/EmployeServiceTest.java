package com.example.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.model.Employe;

import java.util.List;
import java.util.NoSuchElementException;

class EmployeServiceTest {
	
	private EmployeService employeService;

	/*@BeforeEach
    public void setup() {
        employeService = new EmployeService();
        employeService.ajouterEmploye(new Employe(1, "Alice", 5000));
        employeService.ajouterEmploye(new Employe(2, "Bob", 7001));
        employeService.ajouterEmploye(new Employe(3, "Charlie", 6000));
    }*/

	/*erreur de test*/
/*	@Test
    public void testAjouterEmploye() {
        Employe newEmploye = new Employe(4, "Dian", 8000);
        Employe result = employeService.ajouterEmploye(newEmploye);

        assertEquals("Diana", result.getNom());
        assertEquals(4, result.getId());
        assertEquals(8000, result.getSalaire());
    }
	
	@Test
    public void testTrouverEmployeParId_Succes() {
        Employe employe = employeService.trouverEmployeParId(1);
        assertEquals("Alice", employe.getNom());
    }

    @Test
    public void testTrouverEmployeParId_Erreur() {
        assertThrows(NoSuchElementException.class, () -> employeService.trouverEmployeParId(99));
    }
	
	@Test
    public void testSupprimerEmploye_Succes() {
        boolean result = employeService.supprimerEmploye(2);
        assertTrue(result);
        assertThrows(NoSuchElementException.class, () -> employeService.trouverEmployeParId(2));
    }*/
	
	/*erreur de test
	@Test
    public void testObtenirEmployesTriesParSalaire() {
        List<Employe> sortedList = employeService.obtenirEmployesTriesParSalaire();

        assertEquals(7000, sortedList.get(0).getSalaire());
        assertEquals(6000, sortedList.get(1).getSalaire());
        assertEquals(5000, sortedList.get(2).getSalaire());
    }*/
	
}
