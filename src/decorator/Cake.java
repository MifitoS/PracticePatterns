package decorator;

public class Cake implements Baking{
    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public String getDesctription() {
        return "Торт";
    }
}
