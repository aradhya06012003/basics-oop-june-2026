package encapsulationexample;

public class Teacher {
    private int id;
    private String name;
    private String email;
    private String qualfication;
    private double salary;

    //getters - used to fetch/get the values
    //setters - used to set/assign the values

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setQualfication(String qualfication){
        this.qualfication = qualfication;
    }
    public String getQualfication(){
        return qualfication;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", qualfication='" + qualfication + '\'' +
                ", salary=" + salary +
                '}';
    }
}
