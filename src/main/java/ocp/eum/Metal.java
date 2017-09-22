package ocp.eum;


enum Metal {
    COPPER, GOLD;
    /*public*/ Metal(int x) {
        System.out.print("public constructor is not allowed");
    }
    private Metal() {
        //cannot access static non-final fields
        name = /*prefix +*/ prefixOK + "a";
        System.out.print("constructor:");
    }
    static {
        System.out.print("static:");
    }
    static String prefix = "I am ";
    static final String prefixOK = "I am ";
    String name;
    public static void main(String args[]) {
        System.out.print(Metal.COPPER + ":");//constructor:constructor:static:COPPER:
    }
}
