package exam.regexp;

public class TestSplit {
    public static void main(String[] args) {
        String names = "Shreya;.-Selvan;.-Paul;.-Harry";
        String[] results = names.split(";..");
        for (String str : results) {
            System.out.print(str);
        }
    }
}
