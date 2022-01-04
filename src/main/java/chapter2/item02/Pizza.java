package chapter2.item02;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Pizza {
	public enum Topping{
		HAM, MUSHROOM, ONION
	}
	
	final EnumSet<Topping> toppings;
	
	//Builder<T extends Builder<T>>: ������� Ÿ�� ����. �ڱ��ڽ��� ����Ÿ���� �޴� ����.
	abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class); //�⺻ �ν��Ͻ��� ����ִ� EnumSet���� ����
        
        public T addTopping(Topping topping) {//addToping �޼��带 ����Ͽ� ������ �߰��� �� ����
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
 
        abstract Pizza build();//���⼭ ���� Ÿ���� Pizza�� �ƴ�. Pizza�� abstract�� new�� ���� �Ұ�
        					   //Pizza�� ���� Ÿ���� ���⼭ ����� ��
        					   //Convariant ���� Ÿ���� ���� �غ� �۾�(Convariant ���� Ÿ��: �޼��尡 �������̵��� �� �� ���� Ÿ��(����Ŭ����)���� ��ü�� �� �ִٴ� ��)

        // ���� Ŭ������ �� �޼��带 ������(overriding)�Ͽ�
        // "this"�� ��ȯ�ϵ��� �ؾ� �Ѵ�.
        protected abstract T self();
	} 
	
	Pizza(Builder<?> builder){
		 toppings = builder.toppings;//Pizaa�� ������ �ִ� ������ ������ ������ �ִ� �������� �ٲ���
	}
}