package ocp.waitnotify;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dia on 25.6.2017 г..
 */
public class IntegerPool {

    public static void main(String [] args) {
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1==i2);
        Integer i11 = 1000000;
        Integer i22 = 1000000;
        System.out.println(i11==i22);

        //Map m = new HashMap();
        Map<MyKeys, String> m = new HashMap<>();
        MyKeys m1 = new MyKeys(1);
        MyKeys m2 = new MyKeys(2);
        MyKeys m3 = new MyKeys(1);
        MyKeys m4 = new MyKeys(new Integer(2));
        m.put(m1, "car");
        m.put(m2, "boat");
        m.put(m3, "plane");
        m.put(m4, "bus");
        System.out.print(m.size());
    }

    static  class  MyKeys {
        Integer key;
        MyKeys(Integer k) {
            key = k;
        }
        public boolean equals(Object o) {
            //no one is calling this code!!!
            return ((MyKeys) o).key == this.key;
        }
    }

}
