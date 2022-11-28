package abstractFactrory;

public class Main {
    private static GuiFactrory guiFactory = new JetBlackFactory();

    public static void main(String[] args) {
//        ScrollBar scrollBar = new ScrollBar();
//        TextArea textArea = new TextArea();
//        Button button = new Button();

//        ScrollBar scrollBar = new JetBlackScrollBar();
//        Button button = new JetBlackButton();
//        TextArea textArea = new JetBlackTextArea();

        TextArea textArea = guiFactory.createTextArea();
        ScrollBar scrollBar1 = guiFactory.createScrollBar();
        scrollBar1.scrollTo(100);
    }
}
