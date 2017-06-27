package exam.resources;


public class EnumClosable {
    public static void main(String args[]) {
        try (
            Color red = Color.RED) {          //line2
            System.out.print("try:");
        } finally {
            System.out.print("finally:");
        }
    }
}

enum Color implements AutoCloseable { //line1
    PINK, GREEN, RED;

    public void close() {
        System.out.print("closed:");
    }
}
