package chapter2.item03;

public class Singleton1 {

    //instance는 static이니까 클래스가 로딩될 시점에 한번만 초기화됨.
    //초기화될 때 new를 사용하기 때문에 그때 처음 만들어진 instance가 계속해서 재사용하게됨
    public static final Singleton1 instance = new Singleton1();

    static int cnt;

    private Singleton1() {
        cnt++;
        if(cnt != 1){//리플렉션을 막기 위한 방법
            throw new IllegalStateException("this object should be singleton");
        }
    }

}
