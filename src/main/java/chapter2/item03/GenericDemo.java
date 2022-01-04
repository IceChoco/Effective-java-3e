package chapter2.item03;

class StudentInfoD{
    public int grade;
    StudentInfoD(int grade){ this.grade = grade; }
}

class EmployeeInfoD{
    public int rank;
    EmployeeInfoD(int rank){ this.rank = rank;}
}

class PersonD<T, S>{
    public T info;
    public S id;
    PersonD(T info, S id){
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        EmployeeInfoD e = new EmployeeInfoD(1);
        Integer id = 1;
        PersonD p1 = new PersonD(e, id);
        p1.printInfo(e);
    }
}
