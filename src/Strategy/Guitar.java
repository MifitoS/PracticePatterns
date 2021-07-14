package Strategy;

public class Guitar implements Instrument {
    @Override
    public void createMelody() {
        System.out.println("Играть на гитаре");
    }
}
