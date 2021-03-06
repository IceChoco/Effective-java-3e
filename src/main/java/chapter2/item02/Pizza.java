package chapter2.item02;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Pizza {
	public enum Topping{
		HAM, MUSHROOM, ONION
	}
	
	final EnumSet<Topping> toppings;
	
	//Builder<T extends Builder<T>>: 재귀적인 타입 한정. 자기자신의 하위타입을 받는 빌더.
	abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class); //기본 인스턴스는 비어있는 EnumSet으로 셋팅
        
        public T addTopping(Topping topping) {//addToping 메서드를 사용하여 토핑을 추가할 수 있음
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
 
        abstract Pizza build();//여기서 실제 타입은 Pizza가 아님. Pizza는 abstract라서 new로 생성 불가
        					   //Pizza의 하위 타입을 여기서 만들게 됨
        					   //Convariant 리턴 타입을 위한 준비 작업(Convariant 리턴 타입: 메서드가 오버라이딩될 때 더 좁은 타입(서브클래스)으로 교체할 수 있다는 것)

        // 하위 클래스는 이 메서드를 재정의(overriding)하여
        // "this"를 반환하도록 해야 한다.
        protected abstract T self();
	} 
	
	Pizza(Builder<?> builder){
		 toppings = builder.toppings;//Pizaa가 가지고 있는 토핑을 빌더가 가지고 있는 토핑으로 바꿔줌
	}
}
