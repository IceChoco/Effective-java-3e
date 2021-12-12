package item08.AutoCloseableExam;

public class SampleResource implements AutoCloseable {
    boolean close;

    @Override
    public void close() throws RuntimeException{
        if(this.close){
            throw new IllegalStateException();
        }

        close = true;
        System.out.println("close");
    }

    public void hello(){
        System.out.println("hello");
    }

    protected void finalize() throws Throwable{
        if(!this.close) close(); //finalizer 안에서 자기 자신의 자원을 반납하도록!
    }
}
