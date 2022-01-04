package chapter3.item10;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterPointTest {
    private static final Set<Point> unitCircle =
            Set.of(new Point(1,0),new Point(0,1),new Point(-1,0),new Point(0,-1));

    public static boolean onUnitCircle(Point p){
        return unitCircle.contains(p);
    }

    public static void main(String[] args) {
        CounterPoint counterPoint = new CounterPoint(1,0);
        System.out.println(onUnitCircle(counterPoint)); //false
        //Set을 포함하여 대부분의 컬렉션은 contains 작업에 equals 메서드를 이용하는데,
        // CounterPoint의 인스턴스는 어떤 Point와도 같을 수 없기 때문이다.
    }
}

class CounterPoint extends Point {
    private static final AtomicInteger counter =
            new AtomicInteger();
    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }
    public static int numberCreated() { return counter.get(); }
}