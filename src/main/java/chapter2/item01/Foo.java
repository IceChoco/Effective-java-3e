package chapter2.item01;

public class Foo {
    String name;
    String address;
   
    public Foo(){
    }
   
    //������
    public Foo(String name) {
        this.name = name;
    }
   
    //������ - ���� �����ڶ� �ñ״�ó�� �����Ƿ� ���� �Ұ�
//  public Foo(String address) {
//      this.address = address;
//  }
   
    // static ���丮 �޼���
    public static Foo withName(String name){
        return new Foo(name);
    }
   
    public static Foo withAddress(String address) {
        Foo foo = new Foo(address);
        return foo;
    }
   
    private static final Foo GOOD_NIGHT = new Foo();
   
    public static Foo getFoo() {
        return GOOD_NIGHT;//��ü�� �ƿ� ���� �������� �ʰ� �̸� �������� ���� ������. Ư�� ��������� ū ��� ������ ����� ����÷���.
    }
   
    public static void main(String[] args){
        //���� 1: foo �ڵ庸�ٴ� foo2 �ǹ̰� �� �б� ���ϴ�. Ara�� ���� �ǹ����� �� �� �����Ƿ�.
        Foo foo = new Foo("Ara");
        Foo foo1 = Foo.withName("Ara");
       
        //���� 2: �ݵ�� ���ο� ��ü�� ���� �ʿ䰡 ����. �ö��̿���Ʈ ���ϵ� �̿� ����� �����.
        Foo foo2 = Foo.getFoo();
    }
}