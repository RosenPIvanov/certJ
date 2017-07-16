package oca;


public class InitailizeTest {

        private int j;

        void showJ() {
            while (j <= 5) {
                for (int j = 1; j <= 5; ) {
                    System.out.print(j + " ");
                    j++;
                }
                j++;
            }
        }

        public static void main(String[] args) {
            int x = 0;
            if (false) { x=3; }
            //while (false) { x=3; } ureachable

            
            if (new Boolean("true") == Boolean.TRUE) {
                System.out.println("equal");
            }
            ;
            new InitailizeTest().showJ();
        }
    }
