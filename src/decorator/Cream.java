package decorator;

public class Cream extends Goodies{

    public Cream(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return 16 + baking.getPrice();
    }

    @Override
    public String getDesctription() {
        return  baking.getDesctription() + "с кремовой присыпкой";
    }
}
