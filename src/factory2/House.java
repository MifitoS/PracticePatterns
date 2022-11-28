package factory2;

public class House {

    Window window;

    public House(Window window) {
        this.window = window;
    }

    public void openWindow(){
        window.open();
    }

}
