package chapter4.item22;

public class Calculator implements PhysicalConstants {
    public double call(int input){
        return input * AVOGADROS_NUMBER;
    }
    public double call2(int input){
        return input * BOLTZMANN_CONSTANT;
    }
    public double call3(int input){
        return input * ELECTRON_MASS;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //다음 릴리즈에 call에서 AVOGADROS_NUMBER를 사용하고 있지 않더라도 삭제하면 여기서 에러 발생
        //바이너리 호환성을 위해 상수 인터페이스를 구현하고 있어야 함.
        double myResult = 100 * Calculator.AVOGADROS_NUMBER;
        System.out.println(myResult);
    }
}
