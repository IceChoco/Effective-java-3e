package chapter4.item16;

import java.awt.*;

// 패키지 바깥에서 접근할 수 있는 클래스라면 접근자(getter, setter)를 제공함으로써
// 클래스 내부 표현 방식을 언제든 바꿀 수 있는 유연성을 얻을 수 있다.
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    Dimension d= new Dimension();
}
