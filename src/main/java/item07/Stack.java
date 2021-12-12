package item07;

import java.util.Arrays;
import java.util.EmptyStackException;

// 코드 7-1 메모리 누수가 일어나는 위치는 어디인가? (36쪽)
public class Stack {
    private Object[] elements;
    private int size = 0;//인덱스
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

//    public Object pop() {
//        if (size == 0)
//            throw new EmptyStackException();
//        //사이즈를 먼저 줄이고 그다음 그 인덱스에 해당하는 elements를 리턴함. 왜냐? push할 때 값을 넣은 뒤 ++해서 인덱스를 하나 미리 늘려놨기 때문이다.
//        return elements[--size];
//    }

    //    // 코드 7-2 제대로 구현한 pop 메서드 (37쪽)
    public Object pop() {
        //age 라는 변수는 scope이 pop이라는 메서드 안에서만 한정되어있음. 밖으로 나가면 무의미한 참조 변수가 되기 때문에 gc에 의해서 정리가 됨
        Object age = 27 ;

        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제

        // 그러므로 이런 경우 매번 null로 만들지 않아도 된다.
        age = null;

        return result;
    }


    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다.
     * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);//현재사이즈의 2배정도 되는 배열을 하나 더 만들어서 용량을 늘려준다.
    }
}