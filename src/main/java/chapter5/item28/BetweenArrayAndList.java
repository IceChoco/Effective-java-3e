package chapter5.item28;

public class BetweenArrayAndList {
    public static void main(String[] args) {
        Super[] superman = new Sub[1];
        //List<Super> superList = new ArrayList<Sub>();//컴파일 에러

        //정상
        Object[] objectArray = new Long[1];
        /* 컴파일 에러 X. 런타임에서야 에러남
         *
         * Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
         * at item28.BetweenArrayAndList.main(BetweenArrayAndList.java:7)
         */
        objectArray[0] = "String을 넣어봅시다!";

        //컴파일 에러
//        List<Object> objList = new ArrayList<Long>();
//        objList.add("String을 넣어봅시다!");

//        List<String>[] stringList = new List<String>[1]; // 허용된다 가정
//        List<Integer> initList = List.of(42);
//        Object[] objects = stringList;
//        objects[0] = initList;
//        String s = stringList[0].get(0);
    }
}

class Sub extends Super {
}

class Super {
}