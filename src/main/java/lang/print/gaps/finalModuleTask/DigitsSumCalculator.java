package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int b,c,d,e;
        b=number%10;
        c=number%100/10;
        d=number%1000/100;
        e=number%10000/1000;
        System.out.println(b+c+d+e);
    }
}
