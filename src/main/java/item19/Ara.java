package item19;

public class Ara extends IntroduceTemplate {

    public Ara(String name, int age) {
        super(name, age);
    }

    @Override
    public void saySpeciality(){
        System.out.println("저는 블로그에 맛집 정보 기록하는 것을 잘합니다 :D");
    }

    @Override
    public void sayMessage() {
        System.out.println("열심히 하겠습니다!");
    }

    public static void main(String[] args) {
        IntroduceTemplate Ara = new Ara("조아라",26);
        Ara.introduceOneSelf();
    }
}
