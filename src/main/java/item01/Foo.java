public class Foo {
    String name;
    String address;
   
    public Foo(){
    }
   
    //생성자
    public Foo(String name) {
        this.name = name;
    }
   
    //생성자 - 위의 생성자랑 시그니처가 같으므로 생성 불가
//  public Foo(String address) {
//      this.address = address;
//  }
   
    // static 팩토리 메서드
    public static Foo withName(String name){
        return new Foo(name);
    }
   
    public static Foo withAddress(String address) {
        Foo foo = new Foo(address);
        return foo;
    }
   
    private static final Foo GOOD_NIGHT = new Foo();
   
    public static Foo getFoo() {
        return GOOD_NIGHT;//객체를 아예 새로 생성하지 않고 미리 만들어놓은 것을 가져옴. 특히 생성비용이 큰 경우 성능을 상당히 끌어올려줌.
    }
   
    public static void main(String[] args){
        //장점 1: foo 코드보다는 foo2 의미가 더 읽기 편하다. Ara가 무슨 의미인지 알 수 있으므로.
        Foo foo = new Foo("Ara");
        Foo foo1 = Foo.withName("Ara");
       
        //장점 2: 반드시 새로운 객체를 만들 필요가 없다. 플라이웨이트 패턴도 이와 비슷한 기법임.
        Foo foo2 = Foo.getFoo();
    }
}