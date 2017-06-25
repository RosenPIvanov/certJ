package exam.streams;


import java.util.ArrayList;
import java.util.List;

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
