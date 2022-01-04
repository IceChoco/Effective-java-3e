package chapter2.item05.useCase3;

import java.util.List;
import java.util.Objects;

public class SpellChecker {

    private Lexicon dictionary;

    //생성자에 의존객체인 사전을 주입
    public SpellChecker(Lexicon dictionary){
        this.dictionary = Objects.requireNonNull(dictionary);
    };

    public static boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {

    }
}

interface Lexicon{}

class KoreanDictionary implements Lexicon{}
