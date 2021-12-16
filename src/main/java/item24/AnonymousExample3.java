package item24;

public class AnonymousExample3 {
    private double x;
    private double y;

    static double operate() {//정적 문맥
        Operator3 operator = new Operator3() {//구현 인터페이스 이름
            static final double a = 0;
            //static double b = 0; //컴파일에러 발생. 자바 16부터는 에러 발생 X
            @Override
            public double plus() {
                //return x; //바깥 인스턴스 x, y 참조 불가
                return a;
            }
        };
        return operator.plus();
    }

    public static void main(String[] args) {
        AnonymousExample3 a = new AnonymousExample3();
        System.out.println(a.operate());
    }
}

interface Operator3 {
    double plus();
}

