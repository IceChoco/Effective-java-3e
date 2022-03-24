package item72;

import java.util.ArrayList;

public class UtilityClass{
    private UtilityClass()
    {
        //클래스 안에서 실수로라도 생성자를 호출하는 것을 방지
        throw new IllegalStateException("UtilityClass");
    }

    public static void nullpointerTest(String ptr) {
        if (ptr == null)
            throw new NullPointerException();
    }

    public static void main(String[ ] args) {
//        String input = null;
//        UtilityClass.nullpointerTest(input); // static method

        ArrayList<String> colors = new ArrayList<>();
        for (int i = 0; i <= colors.size(); i++) {
            colors.get(i); //에러발생
        }
    }
}
