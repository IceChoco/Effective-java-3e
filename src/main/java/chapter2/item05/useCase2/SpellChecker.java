package chapter2.item05.useCase2;

import java.util.List;

public class SpellChecker {

    //한국 사전으로 고정되어있음
    private final Lexicon dictionary = new KoreanDictionary();

    private SpellChecker(){
        // 객체생성방지
    }

    public static final SpellChecker INSTANCE = new SpellChecker(){
    };

    public static boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SpellChecker.INSTANCE.isValid("hello");
    }
}

interface Lexicon{}

class KoreanDictionary implements Lexicon{}
