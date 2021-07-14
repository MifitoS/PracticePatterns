package Singleton;

public class Putin {

    private static Putin putin;

    public static Putin getInstance(){
        if(putin == null){
        putin = new Putin();
        }
        return putin;
    }


}
