package chapter3.item13.threadTest;

public class Calculator {
    private int memory;

    public synchronized int getMemory() {//읽을 때, 쓸때 모두 동기화 해주는 것이 좋다!
        return memory;
    }

    //1. 메서드 전체를 임계영역으로 지정
//    public synchronized void setMemory(int memory) { //계산기에 메모리 값을 저장하는 메소드
//        this.memory = memory;           //매개값을 memory 필드에 저장
//        try{
//            Thread.sleep(2000);   //스레드를 2초간 일시정지시킴
//        }catch(InterruptedException e){}
//        System.out.println(Thread.currentThread().getName() + ":"+this.memory);//스레드의 이름: 메모리값
//    }

    //2. 특정한 영역을 임계 영역으로 지정
    public void setMemory(int memory) { //계산기에 메모리 값을 저장하는 메소드
        synchronized(this){//this: 공유 객체인 Calculator의 참조(잠금 대상)
            this.memory = memory;           //매개값을 memory 필드에 저장
            try{
                Thread.sleep(2000);   //스레드를 2초간 일시정지시킴
            }catch(InterruptedException e){}
            System.out.println(Thread.currentThread().getName() + ":"+this.memory);//스레드의 이름: 메모리값
        }
    }
}
