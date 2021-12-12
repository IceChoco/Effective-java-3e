package item05.useCase1;

import java.util.List;

public class SpellChecker {

    //한국 사전으로 고정되어있음
    private static final Lexicon dictionary = new KoreanDictionary();

    private SpellChecker(){
        // 객체생성방지
    }

    public static boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SpellChecker.isValid("hello");
    }
}

interface Lexicon{}

class KoreanDictionary implements Lexicon{}
