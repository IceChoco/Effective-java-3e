package item17;

public class FinalFieldExample {
    final int x;
    int y;
    static FinalFieldExample f;

    public FinalFieldExample() {
        x = 3; //생성자에서 final 필드를 초기화하라
        y = 4;
        // 생성자가 끝나기 전에는 다른 스레드가 접근 가능한 곳에 이 객체로의 참조를 두지 말아라
    }

    static void writer(){
        //이 객체로의 참조는 생성자 밖 별도의 메소드에 따로 둬라
        f = new FinalFieldExample();
    }

    static void reader(){
        if(f!= null){
            int i = f.x; // 3임을 보장함
            int j = f.y; // 0일수도 있음!
        }
    }

}
