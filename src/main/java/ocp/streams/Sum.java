package ocp.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum {
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy("red", 10));
        toys.add(new Toy("yellow", 10));
        toys.add(new Toy("red", 10));
        double totalPrice = toys.stream()
                .filter(e -> e.getColor() == "red")
                /* Line n1 */
                .mapToDouble(e -> e.getPrice())
                //.map(e -> e.getPrice())
                .sum();
        System.out.println("Total Price of Red Toys: " + totalPrice);

        List<Integer> names = Arrays.asList(1, 2, 3);
        System.out.println(names.stream().mapToInt(x->x).sum());
        System.out.println(names.stream().reduce(0, (a, b)->a+b));
        System.out.println(names.stream().collect(Collectors.mapping(x->x, Collectors.summarizingInt(x->x))).getSum());
        System.out.println(names.stream().collect(Collectors.summarizingInt(x->x)).getSum());
    }


    static class Toy {
        double price;
        String color;

        Toy(String color, double price) {
            this.color = color;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }
    }
}
