package abstractFactrory;

public class RoseGoldScrollBar extends ScrollBar{
    @Override
    void scrollTo(int i) {
        System.out.println("Rose gold scrolling to " + i);
    }
}
