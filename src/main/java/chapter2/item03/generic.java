package chapter2.item03;

public class generic {
    class Person<T>{
        public T info;
    }

    Person<String> p1 = new Person<String>();
    Person<StringBuilder> p2 = new Person<StringBuilder>();
}
