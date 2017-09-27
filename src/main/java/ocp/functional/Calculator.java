package ocp.functional;

import java.util.function.Function;

public class Calculator {

    public static void main(String[] args) {
        double principle = 100;
        int interestrate = 5;
        double amount = compute(principle, x -> x * interestrate);
    }

    public static double compute(double base, Function<Integer, Integer> func) {
        Integer res = func.apply((int) base);
        return res;//func.apply((int) base);
    }
/*Error
    public static double compute(double base, Function<Integer, Double> func) {
        return func.apply((int) base);
    }*/

   //OK public static double compute(double base, Function<Double, Double> func) {
     //   return func.apply(base);
    //}
}

