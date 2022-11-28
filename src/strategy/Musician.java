package strategy;

public class Musician {
    Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void play(){
        instrument.createMelody();
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

}
