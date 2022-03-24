package chapter5.item30;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class GenericMethodTest {
    //나쁜 예 : 로 타입 사용은 수용 불가
//    public static Set Union(Set s1, Set s2){
//        //Unchecked call to 'HashSet(Collection<? extends E>)' as a member of raw type 'java.util.HashSet'
//        Set result = new HashSet(s1);
//        //Unchecked call to 'addAll(Collection<? extends E>)' as a member of raw type 'java.util.Set'
//        result.addAll(s2);
//        return result;
//    }

    // 제너릭 메서드
    public static <E> Set<E> Union(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}

