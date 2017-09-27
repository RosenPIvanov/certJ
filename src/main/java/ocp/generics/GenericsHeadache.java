package ocp.generics;


import java.util.*;

public class GenericsHeadache {
    public static void main(String[] args) {
        new GenericsHeadache().checkIt();
    }

    public <E extends CharSequence> Collection<E>
    getWordsStartingWith(Collection<E> input, char ch) {
        Collection<E> returnValue = new ArrayList<E>();
        int len = input.size();
        for (E e : input) {
            if (e.charAt(0) == ch) returnValue.add(e); //e.charAt!!!!! we need to define type E for this
        }
        return returnValue;
    }

    public void checkIt() {
        List<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("cherry");
        Set<StringBuffer> b = new HashSet<StringBuffer>();
        b.add(new StringBuffer("pineapple"));
        Collection<String> ac = getWordsStartingWith(a, 'a');
        Collection<StringBuffer> bc = getWordsStartingWith(b, 'b');
    }

    //other
    public List<? extends GenericsHeadache> m4(List<? extends GenericsHeadache> strList) {
        List<GenericsHeadache> list = new ArrayList<>();
        list.add(new GenericsHeadache());
        list.addAll(strList);
        return list;
    }

    public List<GenericsHeadache> m5(List<? extends GenericsHeadache> strList) {
        List<GenericsHeadache> list = new ArrayList<>();
        list.add(new GenericsHeadache());
        list.addAll(strList);
        return list;
    }

}
