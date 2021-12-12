package item08;

public class AttackFinalizerExam {
    

    @Override
    protected void finalize() throws Throwable {//가비지 컬렉션이 될때 호출됨
        System.out.println("Clean up");
    }

    public void hello(){
        System.out.println("hi");
    }
}
