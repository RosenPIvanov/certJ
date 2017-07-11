package ocp.inheritance;

public class Cloth {

    static class Fibre {
        String type = "Fibre";

        String type() {
            return type;
        }
    }

    static class Silk extends Fibre {
        String type = "Silk";

        String type() {
            return type;
        }
    }

    public static void main(String args[]) {
        Fibre f = new Silk();
        System.out.printf("%s : %s", f.type(), f.type); //Silk : Fibre
        // The instance variables are bound to a reference variable during compilation, but the methods are bound at
        // runtime
    }
}
