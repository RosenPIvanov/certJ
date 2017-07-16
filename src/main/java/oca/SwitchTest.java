package oca;

public class SwitchTest {

    public static long getSwitch(int x){
        return x - 20/x + x*x;
    }
    public static void main(String[] args) {
int i = 5;
        switch (i) {
            case -1:
                System.out.println(-1);
            default:
                System.out.println("default");
            case 1:
                System.out.println(1);
            case 0:
                System.out.println(0);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
        }

        int x = 10_003;   //1
               long y = 1_3;     //2
         float z = 3.234_567f; //3
                 System.out.println(x+" "+y+" "+z);
/*
        switch (Integer.parseInt(args[1]))  //1
        {
            case 0:
                boolean b = false;
                break;

            case 1:
                b = true; //2
                break;
        }
*/
        // if (b) System.out.println(args[2]);
    }
}
