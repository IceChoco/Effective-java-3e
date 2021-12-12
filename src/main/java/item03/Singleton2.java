package item03;

import java.io.Serializable;

public class Singleton2 implements Serializable {

    //transient: 직렬화, 역직렬화 하지 않음
    private static final transient Singleton2 instance = new Singleton2();

    private Singleton2(){
    }

    public static Singleton2 getInstance(){
        return instance;
    }

    //싱글턴임을 보장해주는 readResolve 메서드
    //역직렬화 할 때 readResolve가 호출됨. 이게 구현되어 있으면 return에 있는 것만 리턴함!
    private Object readResolve(){
        //진짜 singleton2를 반환하고, 가짜 singleton2는 가비지 컬렉터에 맡긴다.
        return instance;
    }

}
