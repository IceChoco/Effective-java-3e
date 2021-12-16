package item10;

import java.net.MalformedURLException;
import java.net.URL;

public class RegexExample {
    public static void main(String[] args) throws MalformedURLException {
        /* 1. RegexExample */
//        String pattern = "^[0-9]*$"; //숫자만
//        String val = "123456789"; //대상문자열
//
//        boolean regex = Pattern.matches(pattern, val);
//        System.out.println(regex);

        /* 2. Timestamp & Date */
//        Timestamp stamp = new Timestamp(System.currentTimeMillis());
//        Date date = new Date(stamp.getTime());
//        System.out.println(stamp.equals(date));//false
//        System.out.println(date.equals(stamp));//true

        /* 3. url test */
        URL url1 = new URL("www.naver.com");
        URL url2 = new URL("www.naver.com");
        url1.equals(url2); //true

        //비즈니스 로직 수행 후 다시 같은 주소로 url 객체를 생성하여 비교하면 다른 결과가 나올 수 있다.

        url2 = new URL("www.naver.com");
        url1.equals(url2); //false
    }
}
