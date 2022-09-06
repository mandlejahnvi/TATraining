public class Main extends Aclass {
    Main()
    {
        System.out.println("Inside main constructor");
    }
    public static void main(String[] args) {
        Aclass a;
        a=new Main();
    }
}

abstract class Aclass{
    Aclass()
    {
        System.out.println("Inside Aclass");
    }
}