package chapter5.item28;

abstract class Abstract2 {
    protected abstract void hello();
}

abstract class NotActuallyDetails extends Abstract2 {
    protected void hello() {
        System.out.println("a");
    }
}

class ActuallyDetails extends NotActuallyDetails {
    protected void hello() {
        System.out.println("b");
    }
}