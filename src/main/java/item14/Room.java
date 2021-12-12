package item14;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable { //Room 클래스는 AutoCloseable을 구현한다.
    // finalizer와 달리 cleaner는 클래스에 public api로 노출되지 않는다.
    private static final Cleaner cleaner = Cleaner.create(); // parameter로 threadfactory 선택 가능.

    // 청소가 필요한 자원. 절대 Room을 참조해서는 안된다!
    private static class State implements Runnable {
        int numJunkPiles; // 방(Room) 안의 쓰레기 수

        public State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        // room의 close 메서드 호출 시, 또는 gc가 room을 회수할 때. 호출 된다.
        @Override
        public void run() {
            System.out.println("방 청소(junk) : " + numJunkPiles);
            numJunkPiles = 0;
        }
    }

    //방의 상태. Cleanable과 공유한다.
    private final State state;

    //Cleanable 객체. 수거 대상이 되면 방을 청소한다.
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);//Room → State 호출
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}