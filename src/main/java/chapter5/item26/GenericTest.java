package chapter5.item26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericTest {
/*
    //Stamp 인스턴스만 취급하는 Collection 로타입 선언
    private final Collection stamps = ...;

    //실수로 동전을 넣은 경우 "Unchecked call" 경고만 내뱉고 오류없이 컴파일된다.
    stamps.add(new Coin(...));

    //이렇게 동전을 꺼내기 전에는 오류를 알아채지 못한다.
    for(Iterator i = stamps.iterator(); i.hasNext();){
        Stamp stamp = (Stamp)i.next(); //ClassCastException을 던진다.
        stamp.cancel();
    }

    //매개변수화된 컬렉션 타입 - 타입 안전성 확보!
    private final Collection<Stamp> stampsC = ...;
    stampsC.add(new Coin(...));
 */

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        addList(strings, Integer.valueOf(42)); //매개변수 List를 받는 메서드에 `List<String>`을 넘길 수 있다.
        //safeAddList(strings, Integer.valueOf(42)); //컴파일 에러! List<String>은 List<Object>의 하위타입이 아니다.
        String s = strings.get(0);
    }

    private static void addList(List list, Object o){
        list.add(o);
    }

//    private static void safeAddList(List<Object> list, Object o){
//        list.add(o);
//    }

    //잘못된 예 : 모르는 타입의 원소도 받는 로타입 사용
    //2개의 집합(Set)을 받아 공통 원소의 수를 반환하는 메서드
//    static int numElementsInCommon(Set s1,Set s2){
//        int result = 0;
//        for (Object o1 : s1)
//            if(s2.contains(o1))
//                result++;
//        return result;
//    }

    //좋은 예: 비한정적 와일드 타입 사용
    static int numElementsInCommon(Set<?> s1,Set<?> s2){
        int result = 0;
        for (Object o1 : s1)
            if(s2.contains(o1))
                result++;
        return result;
    }
}