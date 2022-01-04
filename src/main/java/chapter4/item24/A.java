package chapter4.item24;

public class A {
    private int i = 10, j = 20;
    void x(int a){
        class B {
            private int b;
            B(int b){ this.b = b;}
            void y() {
                System.out.println(a + b);
            }
        }
        B bb = new B(a/10);
        bb.y();
    }
    void y(){x(200);}
    void z(){x(300);}

    public static void main(String[] args) {
        A a = new A();
        a.x(100);
    }
}
