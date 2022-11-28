package strategy;

public class Piano implements Instrument {
    @Override
    public void createMelody() {
        System.out.println("Играть на пьяно :)");
    }
}
