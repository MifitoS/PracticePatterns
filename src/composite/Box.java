package composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends Component{
//    List<Product> products;
//    List<Box> boxes;

    List<Component> components;

    public Box(String name) {
        super(name);
        components = new ArrayList<>();
    }

    @Override
    int getPrice() {
        int price = 0;
        for (Component component : components) {
            price += component.getPrice();
        }
        return price;
    }

    @Override
    String getContent() {
        StringBuilder names = new StringBuilder();
        for (Component component : components) {
            names.append(component.getContent());
        }
        return names.toString();
    }

    void addComponent(Component component){
        components.add(component);
    }
}
