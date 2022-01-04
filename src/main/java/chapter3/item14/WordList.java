package chapter3.item14;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

// Comparable 구현 시의 이점 (87쪽)
public class WordList {
//    static Value[] num;

    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, args);
        System.out.println(s);
    }
}

//public interface Comparable<T> {
//interface Comparable<T> {
//    /**
//     * 기준 값.compareTo( 비교대상 )
//     *
//     * @param o – 비교대상 오브젝트
//     * @return 기준 값 < 비교대상 : -1
//     * 기준 값 == 비교대상 : 0
//     * 기준 값 > 비교대상 : positive integer
//     * @throws NullPointerException
//     * : 기준 값.compareTo(null)은 NullPointer를 발생시킴.
//     * 기준 값.equals(null)이 false를 번환하는 것과 차이가 있음.
//     * @throws ClassCastException
//     * : 이 객체와 비교할 수 없는 타입의 객체가 주어지면 발생
//     */
//    public int compareTo(T o);
//}