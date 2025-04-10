public interface IGestion <T>{
        void addEmployer(T t);
        boolean searchEmployer(String nom);
        boolean searchEmployer(T t);
        void deleteEmployer(T t);
        void displayEmployer();
        void trierEmployerParId(); // Comparable
        void trierEmployerParDepartmentNameAndGrade(); // Comparator


}
