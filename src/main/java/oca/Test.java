package oca;

public class Test {

    public static void main(String args[]){
        int i;
        int j;
        for (i = 0, j = 0 ; j < 1 ; ++j , i++){
            System.out.println( i + " " + j );
        }
        System.out.println( i + " " + j );

        for (i = 0, j = 0 ; j < 1 ; ++j , i++){
            System.out.println( i + " " + j );
            break;
        }
        System.out.println( i + " " + j );

        for(int ii=0, jj/*+*/=5;  ii<j ; ii++) {  jj--;  }
        for(;;);//infinite loop
    }
}
