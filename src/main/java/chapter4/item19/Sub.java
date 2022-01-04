package chapter4.item19;

import java.time.Instant;

public class Sub extends Super{
    //초기화되지 않은 final 필드, 생성자에서 초기화한다.
    private final Instant instant;

    Sub(){
        instant = Instant.now();
    }

    //재정의 가능 메서드. 상위 클래스의 생성자가 호출한다.
    @Override public void overrideMe(){
        System.out.println(instant);
    }

    public static void main(String[] args) {
        //하위 클래스 선언 시,
        //상위 클래스 생성자 호출(null) → 하위 클래스 생성자 호출(instant 생성됨) 순으로 수행된다.
        Sub sub = new Sub();//null
        sub.overrideMe();   //2021-12-26T14:03:44.081808500Z
    }
}
