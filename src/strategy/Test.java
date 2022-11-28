package strategy;

public class Test {
    //2 СТРАТЕГИЯ
    public static void main(String[] args) {
        Musician musician = new Musician(new Guitar());
        musician.play();
        System.out.println("Попробуем-с на другом инструменте");
        musician.setInstrument(new Piano());
        musician.play();
    }
}
