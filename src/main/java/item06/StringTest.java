package item06;

public class StringTest {
    public static void main(String[] args) {
        String s = new String("Ara"); //따라하지 마세요!
        String d = new String("Ara"); //따라하지 마세요!

        System.out.println(s == d);//false

        String name = "Ara";
        String name2 = "Ara";

        System.out.println(name == name2);//true

        Boolean true1 = Boolean.valueOf("true");
        Boolean true2 = Boolean.valueOf("true");

        System.out.println(true1 == true2);//true
        System.out.println(true1 == Boolean.TRUE);//true
    }
}
