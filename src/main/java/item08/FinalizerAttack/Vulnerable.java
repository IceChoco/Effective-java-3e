package item08.FinalizerAttack;

public class Vulnerable {
    Integer value = 0;

    Vulnerable(int value){
        if(value <= 0){
            throw new IllegalArgumentException("FinalizerExample value must be positive");
        }
        this.value = value;
    }

//    public final void finalize(){//finalier attack 공격 방지
//    }

    @Override
    public String toString(){
        return (value.toString());
    }
}
