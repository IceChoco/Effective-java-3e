package item06;

public class autoboxing {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = 0l;
        for(long i = 0; i<=Integer.MAX_VALUE ; i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start);//Long sum : 6448, long sum: 696
    }

}
