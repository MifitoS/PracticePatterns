package factory2;

public class Main {


    public static void main(String[] args) throws Exception {
        Window window = WindowFabric.getWindow("plastic");
        House house = new House(window);
        house.openWindow();
    }

}
