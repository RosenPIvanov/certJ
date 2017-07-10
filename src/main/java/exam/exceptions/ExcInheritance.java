package exam.exceptions;

public class ExcInheritance {

    class ExA extends Exception {
    }

    class ExB extends ExA {
    }

    class ExC extends ExB {
    }

    class App {
        void launch() throws ExB {
            throw new ExC();
        }

        void useLaunch() {
            try {
                launch();
            } catch (/*insert code here*/ ExB ex) { // no way ExC
            }
        }
    }
}
