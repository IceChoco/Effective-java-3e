package item63.StringBuilderVsStringBuffer;

public class StringBuilderTest extends Thread {
    private static StringBuilder sb;

    public StringBuilderTest(StringBuilder sb) {
        this.sb = sb;
    }

    public void run(){
        for(int i=0;i<100;i++)
            sb.append("A");
    }

    public static final StringBuilder getSb(){
        return sb;
    }
}
