package factory2;

public class WoodWindow implements Window{

    int weight;
    int height;

    public WoodWindow(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void open() {
        System.out.println("Открываем деревянное окно");
    }
}
