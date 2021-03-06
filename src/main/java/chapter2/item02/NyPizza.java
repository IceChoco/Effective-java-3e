package chapter2.item02;

import java.util.Objects;

// 코드 2-5 뉴욕 피자 - 계층적 빌더를 활용한 하위 클래스 (20쪽)
public class NyPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {//피자의 빌더를 상속하여 만든 하위 클래스
        private final Size size;

        public Builder(Size size) {//필수값으로 사이즈를 받아오게 함
            this.size = Objects.requireNonNull(size);//requireNonNull: null 인지 아닌지 체크를 한 후 셋팅해줌
        }

        @Override public NyPizza build() {//리턴타입이 뉴욕 피자임. build 호출하는 클라이언트가 타입 캐스팅을 할 필요 없이 뉴욕피자로 바로 받을 수 있음
            return new NyPizza(this);//this라는 Builder 자체를 넘겨줌
        }

        @Override protected Builder self() { return this; }
    }

    private NyPizza(Builder builder){//매개변수 Builder는 10~22라인의 Builder임.
        super(builder);//Pizza 클래스의 'Pizza(Builder<?> builder)'가 호출되어 토핑도 셋팅이됨
        size = builder.size;//Builder에서 받은 size를 NyPizza에 셋팅할 수 있음
    }

    @Override public String toString() {
        return toppings + "로 토핑한 뉴욕 피자";
    }
    
}


