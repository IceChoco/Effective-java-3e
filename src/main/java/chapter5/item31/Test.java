package chapter5.item31;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Cho");
        list.add("a");
        list.add("ra");
        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}