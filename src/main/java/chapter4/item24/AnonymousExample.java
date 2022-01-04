package chapter4.item24;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousExample {
    private double x;
    private double y;

    Object iv = new Object(){void method(){}}; //이름이 없어서 컴파일 하게 되면 AnonymousExample$1.class로 생성됨

    public double operate() {
        //AnonymousExample a = new AnonymousExample(){//new 조상클래스 이름 또는
        Operator operator = new Operator() {//구현 인터페이스 이름
            @Override
            public double plus() {
                System.out.printf("%f + %f = %f\n", x, y, x + y);
                return x + y;
            }
            @Override
            public double minus() {
                System.out.printf("%f - %f = %f\n", x, y, x - y);
                return x - y;
            }
        };
        return operator.plus();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 6, 7, 1, 3, 4);
        Collections.sort(list, Comparator.comparingInt(o -> o));
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1, o2);
//            }
//        });
        System.out.println(list);
    }
}

interface Operator {
    double plus();
    double minus();
}