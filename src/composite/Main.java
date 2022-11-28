package composite;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Гречка", 100);
        Product product2 = new Product("Рис", 110);
        Product product3 = new Product("Овсянка", 30);
        Product product4 = new Product("Перловка", 40);
        Product product5 = new Product("Перловка Особенная", 10);


        Box box1 = new Box("Пакет1");
        box1.addComponent(product1);
        box1.addComponent(product2);
        Box box2 = new Box("Пакет2");
        box2.addComponent(product3);
        box2.addComponent(product4);
        Box box3 = new Box("Пакет3");
        box3.addComponent(box1);
        box3.addComponent(box2);
        box3.addComponent(product5);

        System.out.println(product1.getContent());
        System.out.println(product1.getPrice());
        System.out.println(product2.getContent());
        System.out.println(product2.getPrice());
        System.out.println(product3.getContent());
        System.out.println(product3.getPrice());
        System.out.println(product4.getContent());
        System.out.println(product4.getPrice());
        System.out.println();
        System.out.println(box1.getPrice());
        System.out.println(box2.getPrice());
        System.out.println(box3.getPrice());

    }
}
