package ocp.eum;


enum Metal {
    COPPER, GOLD;
    /*public*/ Metal(int x) {
        System.out.print("public constructor is not allowed");
    }
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
