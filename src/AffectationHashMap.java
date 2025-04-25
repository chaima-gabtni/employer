import java.util.HashMap;
import java.util.Map;

public class AffectationHashMap {
    private HashMap<employer, Departement> affectations = new HashMap<>();

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    //  affecter un employe a un departement
    public void ajouterAffectation(employer employe, Departement departement) {
        affectations.put(employer, departement);
    }

    public void ajouterEmployeDepartement(employer e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
            System.out.println("affectation faite : " + e.getName() + " → " + d.getNomDepartement());
        } else {
            System.out.println("erreur : Leemploye " + e.getName() + " est deja affecte a un departement.");
        }
    }



    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation ");
        } else {
            System.out.println("liste:");
            for (Map.Entry<employer, Departement> entry : affectations.entrySet()) {
                employer e = entry.getKey();
                Departement d = entry.getValue();
                System.out.println(e.getName() + " " + e.getLastName() +
                        " " + d.getNomDepartement());
            }
        }
    }

    public void supprimerEmploye(employer e) {
            affectations.remove(e);}

    public void afficherEmployes() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé affecté.");
        } else {
            System.out.println("liste:");
            for (employer e : affectations.keySet()) {
                System.out.println(e);
            }
        }
    }


}
