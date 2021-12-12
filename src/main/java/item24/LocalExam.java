package item24;

public class LocalExam {
    void x() {
        class LocalClass {
            void doPrint() {
                System.out.println("LocalClass");
            }
        }
        LocalClass local = new LocalClass();
        local.doPrint();
    }

    public static void main(String[] args) {
        LocalExam a = new LocalExam();
        a.x();
    }
}
