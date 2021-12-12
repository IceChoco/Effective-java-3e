package item08.AutoCloseableExam;

public class SampleRunner {

    public static void main(String[] args) throws InterruptedException {
        try(SampleResource sampleResource = new SampleResource()){
            sampleResource.hello();
        }
        //명시적으로 close를 호출하지 않아도 try 블럭이 끝날 때 AutoCloseable 인터페이스에 있는 close를 호출하여 closing 해줌
    }
}
