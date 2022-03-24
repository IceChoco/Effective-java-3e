package chapter5.item31;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Stack<E> {
    public Stack(){
    }

    public void push(E e){
    }

    public E pop(){
        E rtn = null;
        return rtn;
    }

    public boolean isEmpty(){
        return false;
    }

//    public void pushAll(Iterable<E> src){//수정 전
    public void pushAll(Iterable<? extends E> src){//수정 후
        for(E e: src)
            push(e);
    }

    //    public void pushAll(Iterable<E> src){//수정 전
    public void popAll(Collection<? super E> dst){//수정 후
        while (!isEmpty())
            dst.add(pop());
    }
}

class StackClient{
    public static void main(String[] args) {
        Stack<Number> st = new Stack<>();

        int[] arr = {1,2,3,4,5};
        Iterable<Integer> integers = () -> new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return arr.length > index;
            }

            @Override
            public Integer next() {
                return arr[index++];
            }
        };
        /* [에러발생]
         * java: incompatible types: java.lang.Iterable<java.lang.Integer> cannot be converted to java.lang.Iterable<java.lang.Number>
         */
        st.pushAll(integers);
        Collection<Object> objects = new Collection<Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Object> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        st.popAll(objects);
    }
}