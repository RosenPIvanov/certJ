package ocp.locale;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocale {
    public static void main(String args[]) {
        System.out.println(NumberFormat.getInstance(Locale.FRANCE).format (9999));
        //System.out.println(NumberFormat.getLocalInstance().format(9999));
        //System.out.println(NumberFormat.getDefaultInstance().format(9999));
        //System.out.println(NumberFormat.getDefault().format(9999));
        Locale myLocale = Locale.getDefault();
        myLocale = Locale.US;
        myLocale = new Locale("ru", "RU");
        Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build(); //L1
         ResourceBundle msgs = ResourceBundle.getBundle("mymsgs", myloc);
        msgs.getObject("");
        msgs.getString("");
        msgs.getStringArray("");

    }
}
