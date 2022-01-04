package chapter2.item03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

public class SingleTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //private이므로 Singleton1 밖에서 생성 불가
        //Singleton1 singleton1 = new Singleton1();
        Singleton1 singleton2 = Singleton1.instance;

        System.out.println(singleton2); //item03.Singleton1@4eec7777 - 주소 잘 가져옴

        //아래와 같은 방식으로 리플렉션 API를 이용하여 private 생성자 호출 가능. But
        Constructor<Singleton1> constructor = Singleton1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton1 singleton3 = constructor.newInstance(); //Caused by: java.lang.IllegalStateException: this object should be singleton - 에러발생

        System.out.println(singleton3);

        Singleton2 singleton4 = Singleton2.getInstance();

        Supplier<Singleton2> s2suppliier = Singleton2::getInstance;//getInstance메소드에 대한 인스턴스를 서플라이어 타입으로 만들 수 있음

        String name = Singleton3.INSTANCE.getNmae();
    }
}
