package item03;

import java.io.*;

public class SomeObject implements Serializable {

    public static byte[] serializedObject;
    private String name;
    private String email;

    public SomeObject(String name, String email){
        this.name = name;
        this.email = email;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        //1. 파일 출력
//        File f= new File("a.txt");
//        ObjectOutputStream fileOutputStream = new ObjectOutputStream(new FileOutputStream(f));
//        fileOutputStream.writeObject(new SomeObject("IceChoco", "test@test.com"));
//
        //2. byteArray로 출력
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(new SomeObject("IceChoco", "test@test.com"));
        serializedObject = byteArrayOutputStream.toByteArray();

        System.out.println(serializedObject);
          serializableTest();
    }

    static void serializableTest() throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayOutputStream = new ByteArrayInputStream(serializedObject);
        ObjectInputStream objectOutputStream = new ObjectInputStream(byteArrayOutputStream);
        SomeObject someObject = (SomeObject) objectOutputStream.readObject();

        System.out.println(someObject.name+" "+someObject.email);
    }
}

