package chapter5.item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser2<T> {//제너릭으로 변환
    private final T[] choiceArray;

    //@SuppressWarnings("unchecked") // 비검사 형변환 경고(unchecked cast경고)
    public Chooser2(Collection<T> choices){
        choiceArray = (T[]) choices.toArray();
    }

    public Object choose(){
        Random rnd = ThreadLocalRandom.current();
        return  choiceArray[rnd.nextInt(choiceArray.length)];
    }
}

