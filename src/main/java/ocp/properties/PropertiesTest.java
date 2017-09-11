package ocp.properties;

import java.util.Properties;

/**
 * Created by dia on 6.9.2017 г..
 */
public class PropertiesTest {
    private static void print(Properties props) {
        //not compiling System.out.println(props.get("veggies", "none")
        //        + " " + props.get("omni", "none"));
        System.out.println(props.getOrDefault(new Object(), "none")
                + " " + props.getProperty("omni", "none"));
    }
}
