package composite;

public class Product extends Component{
    private int price;



    public Product(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    String getContent() {
        return name;
    }


    public void setPrice(int price) {
        this.price = price;
    }


}
