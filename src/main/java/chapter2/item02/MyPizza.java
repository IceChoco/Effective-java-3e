package chapter2.item02;

public class MyPizza extends Pizza{
    private MyPizza(Pizza.Builder<?> builder) {
        super(builder);
    }

    public static class Builder extends Pizza.Builder<Builder> {
        Pizza build() {
            return null;
        }

        protected Builder self() {
            return null;
        }
    }
}
