class Outerclass1 {
    int a;
    class Innerclass{
        int a;
        Innerclass()
        {
            a=10;
            System.out.println("Value of a"+a);
        }
    }
    Outerclass1()
    {
       a=20;
       System.out.println("Value of a:"+a);
    }
}

public class Outerclass{
    public static void main(String args[])
    {
        Outerclass1 out =new Outerclass1();
        Outerclass1.Innerclass inner =out.new Innerclass();
    }
}
