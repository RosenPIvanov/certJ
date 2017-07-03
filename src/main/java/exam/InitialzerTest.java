package exam;

/**
 * Created by xworks.admin on 03/07/2017.
 */
public class InitialzerTest  extends Metal {

    InitialzerTest(int a){
        System.out.print("Copper-");
    }
    public static void main(String args[]) {
        new InitialzerTest(101);
    }
}


class Metal {
    {
        try {
           //  error: initializer must be able to complete normally
            // throw new RuntimeException();
        }
        finally{
            System.out.print("finally-");
        }
    }
    Metal() {
        System.out.print("Metal-");
    }
}