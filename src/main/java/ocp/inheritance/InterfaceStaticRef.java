package ocp.inheritance;


interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Office {
    public static String getAddress() {
        return "101 Smart Str";
    }
}

interface WFH extends House, Office {
}

public class InterfaceStaticRef {
    public static void main(String[] args) {
        Office off = new HomeOffice();  //1
        //illegal static interface method call
        //System.out.println(off.getAddress()); //2
        HomeOffice off2 = new HomeOffice();  //1
        System.out.println(off2.getAddress()); //2

    }
}

class HomeOffice implements House, Office {
    public String getAddress() {
        return "R No 1, Home";
    }
}



