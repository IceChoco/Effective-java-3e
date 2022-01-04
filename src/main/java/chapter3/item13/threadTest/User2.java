package chapter3.item13.threadTest;

public class User2 extends Thread {
    //private으로 해야 동기화가 의미가 있다. private이 아니게 되면 클래스 밖에서 값을 마음대로 바꿀 수 있기 때문이다.
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("CalculatorUser2"); //스레드 이름을 CalculatorUser2로 설정
        this.calculator = calculator;    //공유객체인 Calculator를 필드에 저장
    }

    public void run(){
        calculator.setMemory(50); //공유 객체인 Calculator의 메모리에 50을 저장
    }
}
