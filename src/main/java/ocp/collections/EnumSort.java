package ocp.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dia on 1.7.2017 г..
 */
public class EnumSort {
    enum Title {Mr, Ms, Dr};//ENUM ORDER MATTERS
    static class Person implements Comparable<Person> {
        String name; Title title;
        public Person(Title t, String n) {
            title = t;
            name = n;
        }
        public int compareTo(Person p) {
            int compareName = name.compareTo(p.name);
            return compareName != 0 ? compareName : title.compareTo(p.title);
        }
        public String toString() {
            return title + " " + name;
        }
    }

    public static void main(String args[]) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(Title.Mr, "Selvan"));
        list.add(new Person(Title.Dr, "Shreya"));
        list.add(new Person(Title.Ms, "Shreya"));
        Collections.sort(list);
        for (Person p : list) {
            System.out.println(p);
        }
    }
}
