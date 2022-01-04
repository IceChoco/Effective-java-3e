package chapter5.item28.Juice;

public class Juice {
    String name;

    Juice(String juice){
        this.name = name + juice;
    }

    public String toString(){
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";
        for (Fruit f : box.getList())
            tmp += f + " ";

        return new Juice(tmp);
    }
}

class Fruit {
    public String toString(){
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString(){
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString(){
        return "Grape";
    }
}
