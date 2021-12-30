package item18.callBackExam;

public class Wrapeer implements SomethingWithCallback{
    private final WrapperObject wrapperObject;

    public Wrapeer(WrapperObject wrapperObject) {
        this.wrapperObject = wrapperObject;
    }

    @Override
    public void doSomething(){
        //내부 객체의 dosomething을 호출
        wrapperObject.doSomething();
    }

    @Override
    public void call() {
        System.out.println("Wrapper callback!");
    }
}
