package item24;

public class LocalExam {
    void x(int a) {
        class LocalClass {
            private int b;
            LocalClass(int b){ this.b = b;}
            void doPrint() {
                System.out.println("LocalClass");
            }
        }
        LocalClass local = new LocalClass(a/10);
        local.doPrint();
    }

    public static void main(String[] args) {
        LocalExam a = new LocalExam();
        a.x(100);
    }
}
