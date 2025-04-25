public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        employer e1 = new employer(1, "chaima", "gabtni", 3, "IT");
        employer e2 = new employer(2, "manou", "barabim", 2, "RH");
        employer e3 = new employer(3, "mouhamed", "barabom", 5, "IT");

        societe.addEmployer(e1);
        societe.addEmployer(e2);
        societe.addEmployer(e3);

        System.out.println("Avant tri :");
        societe.displayEmployer();

        System.out.println("\nTri par ID :");
        societe.trierEmployerParId();
        societe.displayEmployer();

        System.out.println("\nTri par département et grade :");
        societe.trierEmployerParDepartmentNameAndGrade();
        societe.displayEmployer();
    }


}

