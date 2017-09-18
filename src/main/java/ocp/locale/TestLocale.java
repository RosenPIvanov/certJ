package ocp.locale;

import java.text.NumberFormat;
import java.util.Locale;

public class TestLocale {
    public static void main(String args[]) {
        System.out.println(NumberFormat.getInstance(Locale.FRANCE).format (9999));
        //System.out.println(NumberFormat.getLocalInstance().format(9999));
        //System.out.println(NumberFormat.getDefaultInstance().format(9999));
        //System.out.println(NumberFormat.getDefault().format(9999));
        Locale myLocale = Locale.getDefault();
        myLocale = Locale.US;
        myLocale = new Locale("ru", "RU");

    }
}
