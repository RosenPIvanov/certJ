package oca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {
        boolean b = //WRITE CODE HERE
            checkList(new ArrayList(), al -> al.add("hello"));
        // checkList(new ArrayList(), (List al) -> al.isEmpty()); //OK
        //  checkList(new ArrayList(), (ArrayList al) -> al.isEmpty()); // NOT COMPILE Predicate is typed to List
        // (not ArrayList)
        System.out.println(b);

        //2
        ArrayList<Data> al = new ArrayList<>();
        Data d = new Data(1);
        al.add(d);
        d = new Data(2);
        al.add(d);
        d = new Data(3);
        al.add(d);
        //INSERT METHOD CALL HERE
        //filterData(al, d -> d.value%2 == 0 )//variable d already defined in scope!!!
        //OK filterData(al, d1 -> d1.value%2 == 0 );
        filterData(al, (Data x) -> x.value%2 == 0 );
         System.out.println(al);

    }

    public static void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
        Iterator<Data> i = dataList
            .iterator();
        while (i.hasNext()) {
            if (p.test(i.next())) {
                i.remove();
            }
        }
    }
}

class Data {
    int value;

    Data(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }
}
