package ocp.nested;

/**
 * Created by dia on 27.9.2017 г..
 */
public class InnerMethodAccess {
    static int si = 2;
    int ii = 2;

    public InnerMethodAccess() {
        si = 1;
        ii = 3;
    }

    void m() {
        int p = 0;
        p = 2;
        class innermerthod {
            void inner() {
                //p
                System.out.println(si + ii);
            }
        }
    }
}
