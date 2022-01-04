package chapter2.item02;

//�ڵ� 2-6 Į�ʳ� ���� - ������ ������ Ȱ���� ���� Ŭ���� (20~21��)
public class Calzone extends Pizza {
	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder<Builder> {
		private boolean sauceInside = false; // �⺻��

		public Builder sauceInside() {
			sauceInside = true;
			return this;//Builder ��ü�� �ѱ�
		}

		@Override
		public Calzone build() {//���忡���� Į���׸� ����
			return new Calzone(this);//Builder �ڱ� �ڽ��� �ѱ�
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	private Calzone(Builder builder) {//build���� �ѱ� Builder�� ����
		super(builder);
		sauceInside = builder.sauceInside;//Builder���� ������� sauceInside �÷��׸� Calzone Ŭ������ �ҽ��λ��̵忡 ������ �� ���� 
	}

	@Override
	public String toString() {
		return String.format("%s�� ������ Į�ʳ� ���� (�ҽ��� %s��)", toppings, sauceInside ? "��" : "�ٱ�");
	}
}