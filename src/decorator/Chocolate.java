package decorator;

public class Chocolate extends Goodies{
    public Chocolate(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return 100 + baking.getPrice();
    }

    @Override
    public String getDesctription() {
        return baking.getDesctription() + "и с шоколадной присыпкой";
    }
}
