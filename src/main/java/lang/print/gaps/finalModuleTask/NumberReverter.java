package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int b,c,d;
        b=number%10;
        c=number%100/10;
        d=number%1000/100;
        System.out.println(b+""+c+""+d);
    }
}
