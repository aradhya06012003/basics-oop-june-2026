package encapsulationexample;

public class MainEncapsulationClass {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher();

        //assign values
        teacher1.setId(101);
        teacher1.setEmail("aradhya@gmail.com");
        teacher1.setName("Aradhya");
        teacher1.setQualfication("MCA");
        teacher1.setSalary(30000.00);

        System.out.println("Teacher1 is "+teacher1);

        System.out.println("Teacher1 is "+teacher1.getName());
        System.out.println("Teacher1 is "+teacher1.getEmail());
        System.out.println("Teacher1 is "+teacher1.getId());
    }
}
