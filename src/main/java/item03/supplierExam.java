package item03;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class supplierExam {
    public static void main(String[] args){
        final Supplier<String> helloSupplier = () -> "Hello";

        System.out.println(helloSupplier.get() + "World!");

        long start = System.currentTimeMillis();
        printIfValidIndex(0, ()-> getVeryExpensiveValue());//3초
        printIfValidIndex(-1, ()-> getVeryExpensiveValue());//0초
        printIfValidIndex(-2, ()-> getVeryExpensiveValue());//0초
        System.out.println("It took "+((System.currentTimeMillis() - start) / 1000) + " seconds."); //9초 -> 3초
    }

    private static String getVeryExpensiveValue(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
//아래구문이 많은 CPU 연산을 필요로 한다고 가정해보자!
        return "Kevin";
    }

    private static void printIfValidIndex(int number, Supplier<String> valueSupplier){
        if(number>=0){
            System.out.println("The Value is"+valueSupplier.get()+".");
        }else{
            System.out.println("Invalid");
        }
    }

}