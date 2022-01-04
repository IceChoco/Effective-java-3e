package chapter3.item14;

public class MyInteger {

    // 1. 자바 7 이전 : 관계연산자 <, > 사용
    public static class RelationalMyInteger implements Comparable<RelationalMyInteger> {
        private Integer integer;

        @Override
        public int compareTo(RelationalMyInteger relationalMyInteger) {
            if (integer == relationalMyInteger.integer) {
                return 0;
            }
            if (integer > relationalMyInteger.integer) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    // 2. 자바 7 이후 : compare 이용 비교
    public static class CompareMyInteger implements Comparable<CompareMyInteger> {
        private Integer integer;

        @Override
        public int compareTo(CompareMyInteger compareMyInteger) {
            return Integer.compare(integer, compareMyInteger.integer);
        }
    }

    /**
     * 정수형 기본타입 필드가 관계연산자를 이용하여 비교를 하는경우 == 연산자는 에서 의도치 않은 결과가 유발될 수 있다.
     */
    public static void main(String[] args){

        RelationalMyInteger relationalMyInteger1 = new RelationalMyInteger();
        RelationalMyInteger relationalMyInteger2 = new RelationalMyInteger();

        // 1. 자바 7 이전 : 관계연산자 -> null과 null을 비교하는데 에러가 안남
        // 출력: 0
        System.out.println(relationalMyInteger1.compareTo(relationalMyInteger2));

        CompareMyInteger compareMyInteger1 = new CompareMyInteger();
        CompareMyInteger compareMyInteger2 = new CompareMyInteger();

        // 2. 자바 7 이후 : compare 이용 비교
        // Exception in thread "main" java.lang.NullPointerException
        System.out.println(compareMyInteger1.compareTo(compareMyInteger2));
    }
}