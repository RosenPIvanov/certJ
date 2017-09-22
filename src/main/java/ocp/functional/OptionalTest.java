package ocp.functional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<Double> price = Optional.ofNullable(null);
        Double x = price.orElse(0.0);
        Double x2 = price.orElseGet(() -> 0.0);
        Double z = price.orElseThrow(() -> new RuntimeException("Bad Code"));
        price = Optional.of(null);//NullPointerException

    }
}
