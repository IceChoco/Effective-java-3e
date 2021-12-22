package item18.callBackExam;

public class WrapperObject implements SomethingWithCallback {
    private final SomeService service;

    public WrapperObject(SomeService service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        /*
        * wrapper가 무엇인지 모르니(알 방법도 없음)
        */
    }

    @Override
    public void call() {

    }
}


