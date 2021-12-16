package item10;

public class Member {
    private String name;
    private String address;

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        // 동치 비교(equivalence) vs 동일성 비교(identity)
        Member member1 = new Member("ko", "seoul");
        Member member2 = new Member("ko", "seoul");

        System.out.println(member1 == member2); //동치비교 - false
        System.out.println(member1.equals(member2)); //동일성 비교 - false. equals 재 정의하여 true로 만들어야 함.

//1 reflexibility
        System.out.println(member1.equals(member1));

//2 symmetry
        System.out.println(member1.equals(member2));
        System.out.println(member2.equals(member1));

//3 transitivity
        Member member3 = new Member("ko","seoul");
        System.out.println(member1.equals(member2));
        System.out.println(member2.equals(member3));
        System.out.println(member1.equals(member3));

//4 consistency
        System.out.println(member1.equals(member3));
        System.out.println(member1.equals(member3));
        System.out.println(member1.equals(member3));
    }
}