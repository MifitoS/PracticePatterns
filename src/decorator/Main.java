package decorator;

public class Main {

    public static void main(String[] args) {
        Baking baking = new Cake();
        System.out.println(baking.getDesctription() + baking.getPrice());

        baking = new Cream(baking);

        System.out.println(baking.getDesctription() + baking.getPrice());

        baking = new Chocolate(baking);
        baking = new Cream(baking);
        baking = new Chocolate(baking);
        baking = new Chocolate(baking);
        baking = new Chocolate(baking);
        baking = new Chocolate(baking);
        baking = new Chocolate(baking);
        baking = new Chocolate(baking);
        baking = new Chocolate(baking);
        baking = new Cream(baking);
        System.out.println(baking.getDesctription() + baking.getPrice());

    }

}
