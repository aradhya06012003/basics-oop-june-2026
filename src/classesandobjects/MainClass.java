package classesandobjects;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Hello all, welcome to Spring1 Module");

        //creating object
        Student student1 = new Student(); //Here Student() is a default constructor where it initializes a object.
        System.out.println("Student1 before assigning values : "+student1);

        //assigning values to object
        student1.id = 101;
        student1.name = "Ajay";
        student1.dob = "01/06/03";
        student1.setEmail("aradhyahindalekar@gmail.com");
        student1.grade = "12th";
        System.out.println("Student1 after assigning values : "+student1+ student1.getEmail());

        Student student2 = new Student(101,"Ajay","ajay@gmail.com","01/01/01","12th");
        System.out.println("Student2 values are : "+student2);

        //static example
        Demo d1 = new Demo();
        System.out.println("abc is : "+d1.abc); //non-static variable - object is required
        System.out.println("xyz is : "+Demo.xyz); //static variable - object is not required
        d1.demo1();
        Demo.demo2();

        //final example
        int aaa = 100;
        final int bbb = 200;
        System.out.println("aaa and bbb is : "+aaa+", "+bbb);

        aaa = 200;
//        bbb = 400; cannot change its value since it is final
    }
}
