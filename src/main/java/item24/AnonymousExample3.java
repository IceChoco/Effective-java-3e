package item24;

public class AnonymousExample3 {
    private double x;
    private double y;

    static double operate() {//정적 문맥
        Operator3 operator = new Operator3() {//구현 인터페이스 이름
            static final double A = 0;
            // 자바 8부터는 정적멤버가 static이 아니여도 컴파일에러 발생 X. 그러나 값을 변경할 순 없어서 의미적으로는 여전히 상수여야 한다.
            static double B = 0;
            @Override
            public double plus() {
                //바깥 인스턴스 x, y 참조 불가
                return A;
            }
        };
        return operator.plus();
    }
}

interface Operator3 {
    double plus();
}

