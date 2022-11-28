package factory2;

public class WindowFabric {

    public static Window getWindow(String window) throws IllegalAccessException {
        if(window.equals("plastic")){
            PlasticWindow plasticWindow = new PlasticWindow();
            System.out.println("Отправили на фабрику");
        return plasticWindow;
        }
        if(window.equals("wood")){
            WoodWindow woodWindow = new WoodWindow(43,31);
            System.out.println("Отправили на фабрику");
            return woodWindow;
        }
        throw new IllegalAccessException("Таких окон нет, ты ебанулся?");
    }
}
//проблема в том, что нужно создать на всё фабрику
//spring благодаря своему спрингКонтексту хранит все эти объекты и подаёт им нам при нужде.

//спринг кладет по определенным параметрам в контекст