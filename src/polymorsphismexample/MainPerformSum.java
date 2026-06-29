package polymorsphismexample;

public class MainPerformSum {
    public static void main(String[] args){
        PerformSum performSum = new PerformSum();

        performSum.add(2, 3);
        performSum.add(4, 5, 6);
        performSum.add(2, 5.67f);
        performSum.add(2, 6.78);
        performSum.add(2.34, 6.34f);
    }
}
