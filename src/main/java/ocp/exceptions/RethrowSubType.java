package ocp.exceptions;

/**
 * Created by dia on 6.9.2017 г..
 */
public class RethrowSubType {
    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException e) {
            //is not SneezeException e = new RuntimeException();
            e = new SneezeException();
            e = new SniffleException();
            throw e;
        }


        //multicatch();
    }
    static void multicatch() throws SneezeException {
        //multi-catch is effectively final
        try {
            throw new SneezeException();
        } catch (SneezeException| RuntimeException e)        {
            //is not SneezeException e = new RuntimeException();
           //cannot assign e = new SneezeException();
            //cannot assign e = new SniffleException();
            throw e;
        }
    }

    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }
}
