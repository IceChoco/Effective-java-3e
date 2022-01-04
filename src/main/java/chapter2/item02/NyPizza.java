package chapter2.item02;

import java.util.Objects;

// �ڵ� 2-5 ���� ���� - ������ ������ Ȱ���� ���� Ŭ���� (20��)
public class NyPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {//������ ������ ����Ͽ� ���� ���� Ŭ����
        private final Size size;

        public Builder(Size size) {//�ʼ������� ����� �޾ƿ��� ��
            this.size = Objects.requireNonNull(size);//requireNonNull: null ���� �ƴ��� üũ�� �� �� ��������
        }

        @Override public NyPizza build() {//����Ÿ���� ���� ������. build ȣ���ϴ� Ŭ���̾�Ʈ�� Ÿ�� ĳ������ �� �ʿ� ���� �������ڷ� �ٷ� ���� �� ����
            return new NyPizza(this);//this��� Builder ��ü�� �Ѱ���
        }

        @Override protected Builder self() { return this; }
    }

    private NyPizza(Builder builder){//�Ű����� Builder�� 10~22������ Builder��.
        super(builder);//Pizza Ŭ������ 'Pizza(Builder<?> builder)'�� ȣ��Ǿ� ���ε� �����̵�
        size = builder.size;//Builder���� ���� size�� NyPizza�� ������ �� ����
    }

    @Override public String toString() {
        return toppings + "�� ������ ���� ����";
    }
    
}

