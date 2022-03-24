package chapter5.item30;

public class Solution {

    public static void main(String[] args) {
        String a = "a";
        String b = null;

//#1
        String c = "";
        c += a;
        c += b;
        System.out.println(c);//anull
//#2
        String c2 = "";
        c2.concat(a);
        c2.concat(b);
        System.out.println(c2);//NPE
//#3
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        System.out.println(sb);//anull
//#4
        StringBuffer sb2 = new StringBuffer();
        sb2.append(a).append(b);
        System.out.println(sb2);//anull
    }
}
