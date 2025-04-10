import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<employer> {

    ArrayList  <employer> listEmployees = new ArrayList<>();

    @Override
    public void addEmployer(employer e) {
        listEmployees.add(e);
    }

    @Override
    public boolean searchEmployer(String name) {
        for (employer e : listEmployees) {
            if (e.getName().equals(name)) {
                return true;
            }
        }
    @Override
    public boolean searchEmployer(employer) {
        listEmployees.contains(employer);
    }

    @Override
    public void deleteEmployer(employer e) {
        listEmployees.remove(employer);

    }

    }

    @Override
    public void displayEmployer() {
        for (employer e : listEmployees){
            System.out.println(e);
        }
    }


    @Override
    public void trierEmployerParId() {
        Collections.sort(listEmployees);
    }

    @Override
    public void trierEmployerParDepartmentNameAndGrade() {
        listeEmployes.sort(Comparator.comparing(employer::getDepartmentName).thenComparing(employer::getGrade));

    }
}