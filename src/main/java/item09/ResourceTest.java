package item09;

public class ResourceTest {
    public void tryFinally(){
        System.out.println("### Try Finally 테스트 시작 ###");
        try{
            MyCustomResource resource = new MyCustomResource();
            resource.dosomething();
        }finally {
            System.out.println("Finally 안에 들어왔습니다.");
            throw new RuntimeException();
        }
    }

    public void tryWithResource() throws Exception{
        System.out.println("### Try Finally 테스트 시작 ###");
        try(MyCustomResource resource = new MyCustomResource()){
            resource.dosomething();
        }
    }

    public static class MyCustomResource implements AutoCloseable {
        public void close() throws Exception{
            System.out.println("close 메서드에 들어옴");
            double x = 1/0;
            System.out.println("close 메서드가 끝까지 실행됨");
        }
        public void dosomething(){
            throw new RuntimeException();
        }
    }
}

class Client {
    public static void main(String[] args) throws Exception {
        ResourceTest rs = new ResourceTest();
        rs.tryWithResource();
    }
}
