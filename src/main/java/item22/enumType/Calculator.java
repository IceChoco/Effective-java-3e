package item22.enumType;

public class Calculator{
    public double call(int input){
        return input * PhysicalConstants.AVOGADROS_NUMBER.getValue();
    }
    public double call2(int input){
        return input * PhysicalConstants.BOLTZMANN_CONSTANT.getValue();
    }
    public double call3(int input){
        return input * PhysicalConstants.ELECTRON_MASS.getValue();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double myResult = 100 * PhysicalConstants.AVOGADROS_NUMBER.getValue();
        System.out.println(myResult);
    }
}
