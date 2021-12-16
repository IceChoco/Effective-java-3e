package item10;

public class SmellPoint extends Point{
    private final String name;

    public SmellPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override public boolean equals(Object o) {
        if(!(o instanceof Point))
            return false;

        if (!(o instanceof SmellPoint))
            return o.equals(this);
        return super.equals(o) && ((SmellPoint) o).name.equals(name);
    }

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Point colorPoint = new ColorPoint(1, 2, Color.GREEN);
        Point smellPoint = new SmellPoint(1,2,"Larry");

        System.out.println(point.equals(colorPoint)); //true
        System.out.println(point.equals(smellPoint)); //true
        System.out.println(colorPoint.equals(smellPoint)); //무한재귀 StackOverflowError
    }
}