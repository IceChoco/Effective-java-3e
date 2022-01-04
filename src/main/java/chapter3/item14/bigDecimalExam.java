package chapter3.item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class bigDecimalExam {
    public static void main(String[] argc){
        Set bigDecimalHashSet = new HashSet<>();
        bigDecimalHashSet.add(new BigDecimal("1.0"));
        bigDecimalHashSet.add(new BigDecimal("1.00"));

        Set bigDecimalTreeSet = new TreeSet();
        bigDecimalTreeSet.add(new BigDecimal("1.0"));
        bigDecimalTreeSet.add(new BigDecimal("1.00"));

        System.out.println(bigDecimalHashSet.size());   // 원소 2개 - equals 메소드로 비교하기 때문
        System.out.println(bigDecimalTreeSet.size());   // 원소 1개 - compareTo 메소드로 비교하기 때문
        System.out.println("");
        System.out.println(new BigDecimal("1.0").equals(new BigDecimal("1.00")));    // false
        System.out.println(new BigDecimal("1.0").compareTo(new BigDecimal("1.00"))); // 0 (true)
    }
}
