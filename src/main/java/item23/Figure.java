package item23;

public class Figure {
    enum Shape {
        RECTANGLE, CIRCLE
    }

    // 태그 필드
    final Shape shape;

    /* RECTANGLE 용 필드 */
    //final로 선언하려면 이 필드를 쓰지 않는 다른 shape에도 초기화를 해줘야 함.
    double length;
    double width;

    // CIRCLE 용 필드
    double radius;

    // RECTANGLE
    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    // CIRCLE
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
        this.length = 0;
    }

    double area() {
        switch(shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
