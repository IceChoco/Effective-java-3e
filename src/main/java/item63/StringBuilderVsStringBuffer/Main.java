package item63.StringBuilderVsStringBuffer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        StringBuilderTest builderThreads = new StringBuilderTest(sb);
        Thread thread1 = new Thread(builderThreads);
        Thread thread2 = new Thread(builderThreads);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("StringBuilderTest: " + builderThreads.getSb().length());

        //**************************************************************

        StringBuffer sb2 = new StringBuffer();
        StringBufferTest bufferThreads = new StringBufferTest(sb2);
        Thread bufferThread1 = new Thread(bufferThreads);
        Thread bufferThread2 = new Thread(bufferThreads);

        bufferThread1.start();
        bufferThread2.start();

        try{
            bufferThread1.join();
            bufferThread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("StringBufferTest: " + bufferThreads.getSb().length());
    }
}
