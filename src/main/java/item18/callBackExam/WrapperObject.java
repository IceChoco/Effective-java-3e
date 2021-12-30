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
        * sevice의 performAsync를 비동기적으로 수행시키기 위해
        * 자기 자신을 callback으로 넘김
        */
        service.performAsync(this);
    }

    @Override
    public void call() {
        System.out.println("WrapperObject callback!");
    }
}


