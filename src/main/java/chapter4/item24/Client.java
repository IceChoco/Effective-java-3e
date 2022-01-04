package chapter4.item24;

public class Client {
    public static void main(String[] args) {
        //1. static 멤버 클래스
        //Calculator.Operation test = Calculator.Operation.PLUS;

        //2. non-static 멤버 클래스
        NonStaticExample nonStaticExample = new NonStaticExample("NonStatic");
        System.out.println(nonStaticExample.getName());

        NonStaticExample nonStaticExample2 = new NonStaticExample("NonStatic2");
        nonStaticExample2.new NonStaticClass();// 피하라!
        System.out.println(nonStaticExample2.getName());

    }
}