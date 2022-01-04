package chapter4.item24;

public class Test<b> {
    public static void main(String[] args) {
        int a = 0;
        Integer b = null;

//        System.out.println(a > b);
        System.out.println(Integer.compare(a, b));
    }
}
