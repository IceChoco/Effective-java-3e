package item11;

import java.util.HashMap;

public class PhoneNumber {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    private String[] args;
    private Address address;
    private int hashCode; //자동으로 0으로 초기화된다.

    public PhoneNumber(int firstNumber, int secondNumber, int thirdNumber, Address address) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber p = (PhoneNumber) o;
        return this.firstNumber == p.firstNumber &&
                this.secondNumber == p.secondNumber &&
                this.thirdNumber == p.thirdNumber;
    }

    //사용 금지! 최악의 hashCode구현
//    @Override
//    public int hashCode() {
//        return 42;
//    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if(result == 0){
            // 1. int 변수 result 선언 후 값을 첫번째 핵심 필드에 대한 hashcode로 초기화한다.
            result = Integer.hashCode(firstNumber);

            // 2. 기본 타입 필드라면 Type.hashCode()를 사용한다.
            // Type은 기본타입의 Boxing 클래스이다.
            result = 31 * result + Integer.hashCode(secondNumber);
            result = 31 * result + Integer.hashCode(thirdNumber);

            // 3. 참조 타입이라면 참조타입에 대한 hashCode 함수를 호출한다.
            // 4. 값이 null이면 0으로 사용한다.
            result = 31 * result + address.hashCode();

            // 5. 필드가 배열이라면 핵심 원소를 각각 필드처럼 다룬다.
//        for (String arg : args) {
//            result = 31 * result + arg == null ? 0 : arg.hashCode();
//        }

            // 6. 배열의 모든 원소가 핵심 필드라면 Arrays.hashCode를 이용한다.
            //result = 31 * result + Arrays.hashCode(args);

            hashCode = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Instance 1 hashcode : " + new PhoneNumber(707, 867, 5307, new Address(16509)).hashCode());
        System.out.println("Instance 2 hashcode : " + new PhoneNumber(707, 867, 5301, new Address(16509)).hashCode());

        // Instance 1 hashcode : 1028214719
        // Instance 2 hashcode : 1706234378

        HashMap<PhoneNumber, String> map = new HashMap<>();
        map.put(new PhoneNumber(707, 867, 5307, new Address(16509)), "제니");
        System.out.println(map.get(new PhoneNumber(707, 867, 5307, new Address(16509)))); // 제니
        System.out.println(map.get(new PhoneNumber(707, 867, 5301, new Address(16509)))); // null
    }
}

class Address{
    int zipCode;

    public Address(int city) {
        this.zipCode = city;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(zipCode);
        return result;
    }
}