package chapter4.item22.constantUtility;

import chapter4.item22.PhysicalConstants;

public class Calculator{
    public double call(int input){
        return input * chapter4.item22.PhysicalConstants.AVOGADROS_NUMBER;
    }
    public double call2(int input){
        return input * chapter4.item22.PhysicalConstants.BOLTZMANN_CONSTANT;
    }
    public double call3(int input){
        return input * chapter4.item22.PhysicalConstants.ELECTRON_MASS;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double myResult = 100 * PhysicalConstants.AVOGADROS_NUMBER;
        System.out.println(myResult);
    }
}
