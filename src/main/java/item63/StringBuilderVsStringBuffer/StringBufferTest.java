package item63.StringBuilderVsStringBuffer;

public class StringBufferTest extends Thread {
    private static StringBuffer sb = new StringBuffer();

    public StringBufferTest(StringBuffer sb) {
        this.sb = sb;
    }

    public void run(){
        for(int i=0;i<100;i++)
            sb.append("A");
    }

    public static final StringBuffer getSb(){
        return sb;
    }
}
