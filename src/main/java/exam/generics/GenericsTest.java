package exam.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest {

    public static void main(String args[]) {
       // output();

        List<Book> books = new ArrayList<>();
        books.add(new Book());
        List anotherList = books;

        //INSERT CODE HERE
        //a
        List<Gift> gifts = anotherList;
        gifts.add(new Phone());
        //b
        //List<? extends Gift> gifts = anotherList;
        gifts.add(new Phone());
        gifts.add(new Gift());
        //c
       // List<? super Gift> gifts = anotherList;
        gifts.add(new Phone());
        //d
        //List<?> gifts = anotherList;
        //gifts.add(new Phone());
        //INSERT CODE HERE

        List<Gift> gifts2 = new ArrayList<>();
        gifts2.add(new Phone());
        gifts2.add(new Book());
        for (Gift item : gifts2) {
            System.out.println(item);
        }
    }

    static void output() {
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        List anotherList = books;
        List<? super Gift> gifts = anotherList;
        gifts.add(new Phone());
/*  ClassCastException: Phone
        for (Book item : books) //INSERT CODE HERE
        {
            System.out.println(item);
        }
*/
        for (Gift item : books) //INSERT CODE HERE
        {
            System.out.println(item);
        }

        for (Book item : books) //INSERT CODE HERE
        {
            System.out.println(item);
        }

        for (Object item : books) //INSERT CODE HERE
        {
            System.out.println(item);
        }

        for (Object item : gifts) //INSERT CODE HERE
        {
            System.out.println(item);
        }

//        for (Phone item : books)//INSERT CODE HERE
        //   {
        //       System.out.println(item);
        //   }
    }

    static void outputCleaned() {

        List<? super Gift> gifts = new ArrayList<>();
        gifts.add(new Phone());
/*
        for (Book item : books) //INSERT CODE HERE
        {
            System.out.println(item);
        }
*/

        /*
        for (Gift item : gifts) //INSERT CODE HERE
        {
            System.out.println(item);
        }*/

        for (Object item : gifts) //INSERT CODE HERE
        {
            System.out.println(item);
        }

//        for (Phone item : books)//INSERT CODE HERE
        //   {
        //       System.out.println(item);
        //   }
    }

    void method4(List<? super B> list) {
        for (Object item : list){}
        //for (A item : list){}
    }

    void addToList(List<? super B> list ){
       // list.add(new Object());
        //list.add(new A());
        list.add(new B());
        list.add(new C());
    }
    void threlevelTest(){
        addToList(new ArrayList<B>());
        addToList(new ArrayList<A>());
        List<C> list = new ArrayList<>();
        addToList(list);
        List<? super IOException> exceptions = new ArrayList<Exception>();
         exceptions.add(new Exception()); // DOES NOT COMPILE
         exceptions.add(new IOException());
         exceptions.add(new FileNotFoundException());
        for(Object item: exceptions){}

        List<? extends Exception> exceptions2 = new ArrayList<IOException>();

        method4(new ArrayList<Object>());
        method4(new ArrayList<A>());
        method4(new ArrayList<B>());
        //method4(new ArrayList<C>()); DOES NOT COMPILE







    }
}

class Gift {
}

class Book extends Gift {
}

class Phone extends Gift {
}


class A {
}

class B extends A {
}

class C extends B {
}
