package ocp.inheritance;

public class TestInterfaces implements Fly {
    public static void main(String args[]) {
        Fly.calculateSpeed(1, 2); //testInterfacesnew.calculateSpeed no static methods allowed
        TestInterfaces testInterfacesnew = new TestInterfaces();
        System.out.println(testInterfacesnew.MAX_SPEED);
    }

    @Override
    public int getWingSpan() throws Exception {
        return 0;
    }

    @Override
    public void land() {

    }
}
