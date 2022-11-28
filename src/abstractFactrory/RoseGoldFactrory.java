package abstractFactrory;

public class RoseGoldFactrory extends GuiFactrory{
    @Override
    public ScrollBar createScrollBar() {
        return new RoseGoldScrollBar();
    }

    @Override
    public Button createButton() {
        return new RoseGoldButton();
    }

    @Override
    public TextArea createTextArea() {
        return new RoseGoldTextArea();
    }
}
