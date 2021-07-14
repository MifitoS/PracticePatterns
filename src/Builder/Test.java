package Builder;

public class Test {
    public static void main(String[] args) {
        SuperHero builder = new SuperHero.Builder()
                .withName("Anton")
                .withSurname("Lobov")
                .build();

    }
}
