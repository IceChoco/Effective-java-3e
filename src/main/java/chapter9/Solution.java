package chapter9;

import java.util.ArrayList;

public class Solution {
    private ArrayList<String> item = new ArrayList<String>();
    public static final int LINE_WIDTH = 80;

    //1. 문자열 연결 연산자(+)
    public String statement(){
        String result="";
        for(int i=0;i<numItems();i++)
            result += lineForItem(i); //문자열 연결

        return result;
    }

    //2. StringBuilder
    public String statement2(){
        StringBuilder sb = new StringBuilder(100000 * LINE_WIDTH);
        for(int i=0;i<numItems();i++)//numItems: 5,000,000
            sb.append(lineForItem(i)); //문자열 연결

        return sb.toString();
    }

    //3. Concat
    public String statement3(){
        String result="";
        for(int i=0;i<numItems();i++)//numItems: 100,000
            result = result.concat(lineForItem(i)); //문자열 연결

        return result;
    }

    //4. StringBuffer
    public String statement4(){
        StringBuffer sb = new StringBuffer(numItems() * LINE_WIDTH);
        for(int i=0;i<numItems();i++)//numItems: 100,000
            sb.append(lineForItem(i)); //문자열 연결

        return sb.toString();
    }

    private int numItems(){
        return item.size();
    }

    private String lineForItem(int i){
        return item.get(i);
    }

    public void add(String a){
        item.add(a);
    }

    public static void main(String[] args) {
        long start;
        Solution test = new Solution();

        String testString="";
        for(int i=0;i<100000;i++){
            for(int j=0;j<80;j++)
                testString += (char)(97+i);
            test.add(testString);
            testString = "";
        }
        start = System.currentTimeMillis();
        test.statement();
        System.out.println("소요시간: "+ (float)(System.currentTimeMillis()-start)/1000+"초");

        start = System.currentTimeMillis();
        test.statement2();
        System.out.println("소요시간: "+ (float)(System.currentTimeMillis()-start)/1000+"초");

        start = System.currentTimeMillis();
        test.statement3();
        System.out.println("소요시간: "+ (float)(System.currentTimeMillis()-start)/1000+"초");
    }
}
