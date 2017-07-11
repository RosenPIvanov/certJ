package ocp;

/**
 * Created by xworks.admin on 26/06/2017.
 */
public class PrintFTest {

    enum Color {     RED("yellow"), YELLOW("blue"), BLUE("red");     String color;     Color(String c) {this.color = color;} }

    public static void main(String args[]) {
        Integer qty = 991177;
        //System.out.printf("I want: [%-+5d] bottles of %s color", qty, Color.RED); //not 99117

        //target (99,887,766)
        /*a*/ System.out.printf("%(,d", -99887766);//(99,887,766)
        /*b*/ System.out.printf("%,d", -99887766);//-99,887,766
        //c System.out.printf("%(),f", -99887766);//java.util.UnknownFormatConversionException: Conversion = '('
        //d System.out.printf("%,l", -99887766);//java.util.UnknownFormatConversionException: Conversion = 'l'
        //e System.out.printf("%,i", -99887766);//java.util.UnknownFormatConversionException: Conversion = 'i'
        //f System.out.printf("%(,i)", -99887766);//java.util.UnknownFormatConversionException: Conversion = 'i'
        /*g*/ System.out.printf("(%,d)", -99887766);//(-99,887,766)
        //h System.out.printf("(%,i)", -99887766);//java.util.UnknownFormatConversionException: Conversion = 'i'
    }
}
