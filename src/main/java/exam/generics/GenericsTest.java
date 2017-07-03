package exam.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String args[]) {
        output();
      /*
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        List anotherList = books;

        //INSERT CODE HERE
        //a
        List<Gift> gifts = anotherList;
        gifts.add(new Phone());
        //b
        List<? extends Gift> gifts = anotherList;
        gifts.add(new Phone());
        gifts.add(new Gift());
        //c
        List<? super Gift> gifts = anotherList;
        gifts.add(new Phone());
        //d
        List<?> gifts = anotherList;
        gifts.add(new Phone());
        //INSERT CODE HERE

        List<Gift> gifts2 = new ArrayList<>();
        gifts2.add(new Phone());
        gifts2.add(new Book());*/
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
}

class Gift {
}

class Book extends Gift {
}

class Phone extends Gift {
}

