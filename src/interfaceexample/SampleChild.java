package interfaceexample;

public class SampleChild implements SampleInterface, SampleInterface2{

    @Override
    public void sample1(){
        System.out.println("aaa is : "+SampleInterface.aaa);
        System.out.println("Sample1 implementation inside SampleChild class");
    }

    @Override
    public void sample2(){
        System.out.println("bbb is : "+SampleInterface.bbb);
        System.out.println("Sample2 implementation inside SampleChild class");
    }

    @Override
    public void sample3(){
        System.out.println("ccc is : "+SampleInterface.ccc);
        System.out.println("Sample3 implementation inside SampleChild class");
    }

    @Override
    public void sample4() {
        System.out.println("ddd is : "+SampleInterface.ddd);
        System.out.println("Sample4 implementation inside SampleChild class");
    }

    @Override
    public void sample5() {
        //Multilevel Inheritance using Interfaces
        System.out.println("Sample5 implementation inside SampleChild class from both SampleInterface and SampleInterface2");
    }

    @Override
    public void sample6() {
        //Multilevel Inheritance using Interfaces
        System.out.println("Sample6 implementation inside SampleChild class from both SampleInterface and SampleInterface2");
    }
}
