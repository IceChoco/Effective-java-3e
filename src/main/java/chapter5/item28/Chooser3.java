package chapter5.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser3<T> {//제너릭으로 변환
    private final List<T> choiceList;//리스트로 변경

    public Chooser3(Collection<T> choices){
        choiceList = new ArrayList<>(choices);
    }

    public Object choose(){
        Random rnd = ThreadLocalRandom.current();
        return  choiceList.get(rnd.nextInt(choiceList.size()));
    }
}

