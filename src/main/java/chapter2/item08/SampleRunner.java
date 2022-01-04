package chapter2.item08;

public class SampleRunner {

    public static void main(String[] args) throws InterruptedException {
        SampleRunner runner = new SampleRunner();
        runner.run();
        //run 메서드가 끝남과 동시에 finalizerExample의 유효성이 끝나면서 GC의 대상이 됨
         Thread.sleep(1000l);//1초
        //종료 - finalizerExample가 GC의 대상이 됐다고 해서, 바로 GC가 되지 않았음.
        //      이렇게 finalize라는 메서드가 호출이 안될 수도 있고, 언제 호출이 될지 모름.
    }

    private void run(){
        FinalizerExample finalizerExample = new FinalizerExample();
        finalizerExample.hello();
    }
}
