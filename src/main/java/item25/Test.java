package item25;

public class Test {
    private static class Song{
        static final String NAME = "Dance";
    }

    private static class Music{
        static final String NAME = "Rap";
    }

    public static void main(String[] args) {
        System.out.println(Song.NAME + Music.NAME);
    }
}
