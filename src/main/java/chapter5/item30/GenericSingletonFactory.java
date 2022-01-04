package chapter5.item30;

import java.util.Collection;
import java.util.Objects;
import java.util.function.UnaryOperator;

// 제네릭 싱글턴 팩터리 패턴 (178쪽)
public class GenericSingletonFactory {
    // 코드 30-4 제네릭 싱글턴 팩터리 패턴 (178쪽)
    //f(x) = x 항등함수 객체
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    //입력된 타입 매개변수에 따라 형변환 후 반환하는 제너릭 메서드
    static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }
    
    // 코드 30-5 제네릭 싱글턴을 사용하는 예 (178쪽)
    public static void main(String[] args) {
        String[] strings = {"water","stand","fattening"};
        UnaryOperator<String> sameString = identityFunction();
        for(String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for(Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }

    //코드 30-6 재귀적 타입 한정을 이용해 상호 비교할 수 있음을 표현했다.
    public static <E extends Comparable<E>> E max(Collection<E> c){
        if(c.isEmpty())
            throw new IllegalArgumentException("컬렉션이 비어있습니다!");

        E result = null;
        for(E e: c)
            if(result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return result;
    }
}