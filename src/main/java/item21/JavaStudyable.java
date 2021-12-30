package item21;

public interface JavaStudyable { // ~able 네이밍 규칙을 가진다.
    public abstract void study(); //일반적인 메서드 선언

    public default void reset(){ //default 메서드 선언 후 구현
        System.out.println("쉽시다아");
    }
}

class RealTest implements JavaStudyable{
    @Override
    public void study(){
        System.out.println("공부합시당");
    }

    @Override
    public void reset(){
        System.out.println("신나는 15분의 휴식시간!");
    }

    public static void main(String[] args) {
        RealTest rt = new RealTest();
        rt.study();
        rt.reset();
    }
}