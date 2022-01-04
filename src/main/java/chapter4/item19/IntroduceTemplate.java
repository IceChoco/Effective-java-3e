package chapter4.item19;

public abstract class IntroduceTemplate {

    String name;
    int age;

    public IntroduceTemplate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void introduceOneSelf(){
        sayName();
        sayAge();
        saySpeciality();
        sayMessage();
    }

    public void sayName(){
        System.out.println("안녕하십니까? 저는 "+name+"입니다.");
    }

    public void sayAge(){
        System.out.println("저의 나이는 "+age+"세 입니다.");
    }

    //hook method
    public void saySpeciality(){
    }

    public abstract void sayMessage();
}
