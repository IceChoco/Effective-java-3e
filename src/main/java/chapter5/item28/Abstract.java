package chapter5.item28;

import java.util.Stack;

abstract class Abstract {
    protected abstract void hello(Object param);

    Stack stackt = new Stack<>();
}

//매개변수의 타입이 다른 경우 다른 메서드로 인식하고, 추상메서드를 재정의하지 않았다는 경고 메시지를 보여준다.
//class NotActuallyDetails extends Abstract {
//
//    protected void hello(NotActuallyDetails param) {
//        System.out.println("a");
//    }
//
//}