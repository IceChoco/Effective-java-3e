package item17;

import java.math.BigInteger;

public class negateExam {
    public static void main(String[] args) {
        //1. BigInteger 클래스의 negate
        BigInteger howMuch = new BigInteger("5500");
        System.out.println(howMuch.negate()); //result: -5500

        //2.StringBuilder 클래스의 toString
        StringBuilder sb = new StringBuilder();
        sb.append("DdangGeulEe");
        sb.append(" GomGomEe");
        System.out.println(sb.toString());
    }
}
