package chapter4.item24;

public class NonStaticExample {
    private final String name;

    public NonStaticExample(String name) {
        this.name = name;
    }

    public String getName() {
        NonStaticClass nonStaticClass = new NonStaticClass();
        return nonStaticClass.getNameWithOuter();
    }

    public class NonStaticClass {
        public String getNameWithOuter() {
            // 정규화된 this 를 이용해서 바깥 클래스의 인스턴스 메서드를 사용할 수 있다.
            return NonStaticExample.this.name;
        }
    }
}