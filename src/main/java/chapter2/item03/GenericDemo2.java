package chapter2.item03;

interface Info{
    //abstract class Info{
    public abstract int getLevel();
}

class EmployeeInfo2 implements Info{
    //class EmployeeInfo extends Info{
    public int rank;
    EmployeeInfo2(int rank){
        this.rank = rank;
    }
    public int getLevel(){
        return this.rank;
    }
}

//제너릭 안의 extends는 부모가 누구냐는 뜻. 그러므로 인터페이스여도 implements를 사용하지 않아도 된다.
class Person2<T extends Info>{
    public T info;
    Person2(T info){
        this.info = info;
        info.getLevel();
    }
}

public class GenericDemo2 {
    public static void main(String[] args){
        Person2<EmployeeInfo2> p1 = new Person2<EmployeeInfo2>(new EmployeeInfo2(1));
//String은 Info의 자식이 아니기 때문에 아래는 에러 발생
//Person<String> p2 = new Person<String>("부장");
    }
}