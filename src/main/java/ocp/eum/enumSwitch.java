package ocp.eum;

public class enumSwitch {
    public static void main(String[] args) {
        Switch s = Switch.OFF;
        switch (s) {
            case OFF://!!!!! not Switch.OFF
                System.out.println("It is off!");
                break;
        }
    }

    enum Switch {ON, OFF}
}
