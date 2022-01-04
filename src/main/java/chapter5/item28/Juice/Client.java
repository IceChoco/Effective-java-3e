package chapter5.item28.Juice;

public class Client {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        // ? extends Fruit: Fruit과 그 자손들 Apple, Grape
        //FruitBox<? extends Fruit> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
    }
}
