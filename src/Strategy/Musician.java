package Strategy;

public class Musician {

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    Instrument instrument;

    public void play(){
        instrument.createMelody();
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

}
