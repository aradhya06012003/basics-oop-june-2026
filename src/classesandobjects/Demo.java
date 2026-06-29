package classesandobjects;

public class Demo {
    public int abc = 100; //non-static variable - object is required
    public static int xyz = 200; //static variable - object is not required

    public void demo1(){
        abc = 300;
        xyz = 400; //static variable can be called in a non-static method
        System.out.println("Demo1 non-static method");
    }

    public static void demo2(){
//        abc = 500; //non-static variable cannot be called in a static method
        xyz = 600;
        System.out.println("Demo2 static method");
    }
}
