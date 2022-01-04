package chapter4.item18.callBackExam;

public class SomeService {
    // callBack을 전달받아 callback.call() 호출
    void performAsync(SomethingWithCallback callback){
        new Thread(() -> {
            perform();
            callback.call();
        }).start();
    }

    void perform(){
        System.out.println("Service is being performed");
    }

    public static void main(String[] args) {
        SomeService service = new SomeService();
        WrapperObject wrapperObject= new WrapperObject(service);
        Wrapeer wrapeer = new Wrapeer(wrapperObject);
        wrapeer.doSomething();
    }
}
