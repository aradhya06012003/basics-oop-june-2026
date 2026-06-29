package classesandobjects;

public class Student {
    public int id;
    public String name;
    private String email;
    protected String dob;
    public String grade;

    public Student(){

    }

    public void setEmail(String email){ //Accessing the private value of Email in main class through setter and getter method
            this.email = email;
        }

        public String getEmail(){ //Accessing the private value of Email in main class through setter and getter method
            return email;
        }

    public Student(int id, String name, String email, String dob, String grade) { //This is an example of parameterized constructor
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.grade = grade;
    }

    //It converts object into string format
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
