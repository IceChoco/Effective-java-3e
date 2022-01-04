package chapter2.item05.useCase4;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class SpellChecker {

    private Lexicon dictionary;

    //생성자에 의존객체인 사전을 주입
    public SpellChecker(Supplier<Lexicon> dictionary){
        this.dictionary = Objects.requireNonNull(dictionary.get());
    };

    public static boolean isValid(String word){
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Lexicon lexicon = new KoreanDictionary();

// SpellChecker spellChecker = new SpellChecker(new Supplier<Lexicon>() {
// @Override
// public Lexicon get() {
// return lexicon;
// }
// });
        SpellChecker spellChecker = new SpellChecker(() -> lexicon); //위 소스를 이와 같은 람다식으로 수정
        spellChecker.isValid("hello");
    }
}

interface Lexicon{}

class KoreanDictionary implements Lexicon{}

class testDictionary implements Lexicon{}