public class employer {
    int id ;
    String name;
    String lastName;
    String departmentName;
    int grade;

    public employer(){
    }
    public employer(int id,String name,String lastName, int grade, String departmentName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String nom) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        employer other = (employer) o;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override

    public String toString() {

        return "id: " + id + " | " +name + " " + lastName + " , department name = " + departmentName  + "| " +
                ", grade=" + grade;
    }

}
