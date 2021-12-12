package item03;

class StudentInfoY{
    public int grade;
    StudentInfoY(int grade){ this.grade = grade; }
}

class EmployeeInfoY{
    public int rank;
    EmployeeInfoY(int rank){ this.rank = rank;}
}

class Person{
    public Object info;
    Person(Object info){this.info = info; }
}

public class noGeneric2 {
    public static void main(String[] args) {
        //타입이 안전하지 않은 2가지 경우
        //1. Object로 설정해버려서 의도한 바와 다르게 String 타입이 들어감
        Person p1 = new Person("부장");

        //2. 컴파일 단계에서 에러가 발생하지 않음.
        EmployeeInfoY eiOut = (EmployeeInfoY)p1.info;
        System.out.println(eiOut.rank);
    }
}
