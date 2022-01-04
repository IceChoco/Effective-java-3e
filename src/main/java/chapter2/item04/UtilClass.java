package chapter2.item04;

//인스턴스화 불가 class
public class UtilClass {

    public static String getName(){
        return "IceChoco";
    }

    //유틸 클래스라 인스턴스를 만들지 못하게 막았습니다.
    private UtilClass() {
        throw new AssertionError();
    }

    static class AnotherClass extends UtilClass{

    }

    public static void main(String[] args) {
        //UtilClass에 abstract를 붙이면 1차적으로 아래처럼 인스턴스화 할 수 없긴함
        //UtilClass utilClass = new UtilClass();//가 아닌
        UtilClass.getName();//으로 사용되길 원함

        //AnotherClass의 메서드는 사용할 수 없지만 인스턴스화는 할 수 있음. 정말 쓸모없는 인스턴스...
        //의미 없는 인스턴스를 아래처럼 만들 수 있는 가능성을 배제하기 위해 private생성자를 만들라고 권고한다.
        // private UtilClass() 추가 후, Exception in thread "main" java.lang.AssertionError 발생
        AnotherClass anotherClass = new AnotherClass();

    }

}

class outClass{
    //UtilClass utilClass = new UtilClass();
}