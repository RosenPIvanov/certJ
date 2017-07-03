package exam.eum;

/**
 * Created by xworks.admin on 03/07/2017.
 */
enum Metal {
    COPPER, GOLD;
    Metal() {
        System.out.print("constructor:");
    }
    static {
        System.out.print("static:");
    }
    public static void main(String args[]) {
        System.out.print(Metal.COPPER + ":");//constructor:constructor:static:COPPER:
    }
}
