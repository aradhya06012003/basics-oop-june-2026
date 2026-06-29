package polymorsphismexample;

public class PerformSum {

    public void add(int a, int b){
        System.out.println("sum of two int nos : "+(a+b));
    }
    public void add(int a, int b, int c) {
        System.out.println("sum of three int nos : "+(a+b+c));
    }
    public void add(int a, float b){
        System.out.println("sum of one int and one float nos : "+(a+b));
    }
    public void add(int a, double b){
        System.out.println("sum of one int and one double nos : "+(a+b));
    }
    public void add(double a, float b){
        System.out.println("sum of one double and one float nos : "+(a+b));
    }
}
