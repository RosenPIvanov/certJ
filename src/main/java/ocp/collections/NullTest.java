package ocp.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by dia on 16.9.2017 г..
 */
public class NullTest {


    public static void main(String args[]) {

        Map hm = new ConcurrentHashMap();
       // hm.put(null, "asdf");  //1    NullPointerException
      //  hm.put("aaa", null);  //2 NullPointerException

        hm = new HashMap();
        hm.put(null, "asdf");  //3
        hm.put("aaa", null);  //4

        List list = new ArrayList<>();
        list.add(null); //5
        list.add(null); //6

        list = new CopyOnWriteArrayList();
        list.add(null); //7

        TreeSet<StringBuilder> treeSetNames = new TreeSet<StringBuilder>();
        //treeSetNames.add(null); //NullPointerException

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put( "", null);
        treeMap.put(null, "");  //NullPointerException
    }
}
