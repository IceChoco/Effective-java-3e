package chapter2.item08.FinalizerAttack;

public class AttackVulnerable extends Vulnerable{
    static Vulnerable vulnerable;

    public AttackVulnerable(int value){
        super(value);
    }

    @Override
    public void finalize(){
        vulnerable = this;
    }

    public static void main(String[] args) {
        try{
            new AttackVulnerable(-1);
        }catch (Exception e){
            System.out.println(e);
        }
        System.gc();
        System.runFinalization();
        if(vulnerable != null){
            System.out.println("Vulnerable object " + vulnerable + " created!");
        }
    }
}
