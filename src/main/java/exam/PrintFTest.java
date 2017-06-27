package exam;

/**
 * Created by xworks.admin on 26/06/2017.
 */
public class PrintFTest {

    enum Color {     RED("yellow"), YELLOW("blue"), BLUE("red");     String color;     Color(String c) {this.color = color;} }

    public static void main(String args[]) {
        Integer qty = 991177;
        System.out.printf("I want: [%-+5d] bottles of %s color", qty, Color.RED); //not 99117
    }
}
