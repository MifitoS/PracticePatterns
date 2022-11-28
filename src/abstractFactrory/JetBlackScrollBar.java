package abstractFactrory;

public class JetBlackScrollBar extends ScrollBar{
    @Override
    void scrollTo(int i) {
        System.out.println("Jet Black scrolling to " + i);
    }
}
