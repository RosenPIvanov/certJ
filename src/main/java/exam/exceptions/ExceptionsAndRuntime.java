package exam.exceptions;

/**
 * Created by xworks.admin on 27/06/2017.
 */
public class ExceptionsAndRuntime {

    public static void main(String args[]) {
        Lake lake = new Lake();
        try {
            lake.waterSkiing();
        } catch (RuntimeException e) {
            System.out.print("RuntimeEx:");
        } catch (Exception e) {
            System.out.print("Ex:");
        }
    }
}

class Lake {
    void waterSkiing() throws RuntimeException {
        System.out.print("Skiing:");
    }
}
