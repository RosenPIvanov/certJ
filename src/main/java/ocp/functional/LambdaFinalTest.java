package ocp.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaFinalTest {
    public double process(double payment, int rate) {
      //  double defaultrate = 0.10;        //1
       // if (rate > 10) defaultrate = rate;  //2


        class Implement {
            public int apply(double data) {
                /*defaultrate is the problem*/
                // Function<Integer, Integer> f = x -> x + (int) (x * defaultrate);  //3
                // return f.apply((int) data); //4

                /*defaultrate is the problem*/
               // BiFunction<Integer, Double, Integer> f = (m, n) -> m + (int) (n * m);
              //  return f.apply((int) data, defaultrate);
                return 0;
            }
        }
        Implement i = new Implement();
        return i.apply(payment);
    }
}
