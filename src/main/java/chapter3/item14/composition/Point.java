package chapter3.item14.composition;

// 단순한 불변 2차원 정수 점(point) 클래스 (56쪽)
public class Point implements Comparable<Point> {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        int result = Integer.compare(x, point.x);
        if (result == 0) {
            return Integer.compare(y, point.y);
        }
        return result;
    }

    public static void main(String[] args) {
        ColorPoint cp1 = new ColorPoint(new Point(1,2),3);
        ColorPoint cp2 = new ColorPoint(new Point(1,2),4);

        System.out.println(cp1.compareTo(cp2)); //출력 -1. 즉, cp1 < cp2
        System.out.println(cp1.compareTo(null)); //출력 -1. 즉, cp1 < cp2
    }
}

//View 메서드(asPoint)를 제공
class ColorPoint implements Comparable<ColorPoint>{
    private Point point; //객체참조필드 : 클래스 내 변수로 선언된 객체
    private int color;

    public ColorPoint(Point point, int color) {
        this.point = point;
        this.color = color;
    }

    public Point asPoint(){
        return point;
    }

    @Override
    public int compareTo(ColorPoint colorPoint) {
        int result = point.compareTo(colorPoint.point);
        if (result == 0) {
            return Integer.compare(color, colorPoint.color);
        }
        return result;
    }
}