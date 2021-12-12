package item24;

public class AnonymousExample2 {
    private double x;
    private double y;

    public double operate() {//비정적문맥
        Operator2 operator = new Operator2() {//구현 인터페이스 이름
            @Override
            public double plus() {
                //바깥 인스턴스 x, y 참조
                System.out.printf("%f + %f = %f\n", x, y, x + y);
                return x + y;
            }
        };
        return operator.plus();
    }
}

interface Operator2 {
    double plus();
}